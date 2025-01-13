package com.schoolproject.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.jdbc.core.RowMapper;

import com.schoolproject.dao.StudentDAO;
import com.schoolproject.model.Student;

public class StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);

    private StudentDAO studentDAO;
   
    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public StudentService(){
        logger.info("StudentService : Intialized!!");
    }

    public List<Student> getStudents() {
        List<Student> students = studentDAO.getStudents();
        logger.info("StudentService : getStudents:" + students.toString());
        return students;
    }

    public void insertStudent(Student student) {
        int status = studentDAO.insertStudent(student);
        logger.info("StudentService : insertStudent: status :" + status);
    }
}
