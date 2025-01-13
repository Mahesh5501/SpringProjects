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

public class StudentDAO {

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(StudentDAO.class);

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public StudentDAO() {
        logger.info("StudentDAO initialized");
    }

    public List<Student> getStudents() {
        
        String sql = "SELECT name, email, grade FROM students";

        return jdbcTemplate.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setName(rs.getString("name"));
                student.setEmail(rs.getString("email"));
                student.setGrade(rs.getString("grade"));
                return student;
            }
        });
    }

    public int insertStudent(Student student) {
        String sql = "INSERT INTO students (name, email, grade) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getGrade());
        return 0;
    }
}
