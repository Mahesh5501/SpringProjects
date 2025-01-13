package com.schoolproject.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.schoolproject.dao.TeacherDAO;
import com.schoolproject.model.Teacher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * TeacherService
 */
public class TeacherService {

    private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);

    private TeacherDAO teacherDAO;

    public void setTeacherDAO(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    } 

    public TeacherService(){
        logger.info("TeacherService : Intialized!!");
    }
    

    public List<Teacher> getTeachers() {
        List<Teacher> teachers = teacherDAO.getTeachers();
        logger.info("TeacherService : getTeachers:" + teachers.toString());
        return teachers;
    }
    
    public void insertTeacher(Teacher teacher) {
        int status = teacherDAO.insertTeacher(teacher);
        logger.info("TeacherService : insertTeacher: status :" + status);
    }
}