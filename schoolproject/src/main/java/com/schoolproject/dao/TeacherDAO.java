package com.schoolproject.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.schoolproject.controller.SchoolProjectController;
import com.schoolproject.model.Student;
import com.schoolproject.model.Teacher;

public class TeacherDAO {

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(TeacherDAO.class);

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public TeacherDAO() {
        logger.info("TeacherDAO initialized");
    }

    public List<Teacher> getTeachers() {

        logger.info("TeacherDAO : getTeachers");

        String sql = "SELECT name, email, subject FROM teachers";
        
        logger.info("TeacherDAO : getTeachers"+ sql);
        return jdbcTemplate.query(sql, new RowMapper<Teacher>() {
            @Override
            public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
                Teacher teacher = new Teacher();
                teacher.setName(rs.getString("name"));
                teacher.setEmail(rs.getString("email"));
                teacher.setSubject(rs.getString("subject"));
                return teacher;
            }
        });
    }

    public int insertTeacher(Teacher teacher) {
        String sql = "INSERT INTO teachers (name, email, subject) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, teacher.getName(), teacher.getEmail(), teacher.getSubject());
        return 0;
    }
}
