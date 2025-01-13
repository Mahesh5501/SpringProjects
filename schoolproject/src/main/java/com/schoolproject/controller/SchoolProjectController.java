package com.schoolproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.schoolproject.dao.StudentDAO;
import com.schoolproject.dao.TeacherDAO;
import com.schoolproject.model.Student;
import com.schoolproject.model.Teacher;
import com.schoolproject.service.TeacherService;
import com.schoolproject.service.StudentService;

@Controller
public class SchoolProjectController {

    private static final Logger logger = LoggerFactory.getLogger(SchoolProjectController.class);

    private TeacherService teacherService;
    private StudentService studentService;

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getLandingPage() {
        ModelAndView landing = new ModelAndView("landing");
        return landing;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView getLoginPage() {
        ModelAndView landing = new ModelAndView("landing");
        return landing;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView getRegisterPage() {
        ModelAndView landing = new ModelAndView("landing");
        return landing;
    }

    @RequestMapping(value = "/forgot-password", method = RequestMethod.POST)
    public ModelAndView getForgotPasswordPage() {
        ModelAndView landing = new ModelAndView("landing");
        landing.addObject("message", "This is landing Page!!");
        return landing;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getHomePage() {
        ModelAndView home = new ModelAndView("home");
        home.addObject("message", "This is home Page!!");
        return home;
    }

    @RequestMapping(value = "/student-list", method = RequestMethod.GET)
    public ModelAndView listStudents() {
           List<Student> students = studentService.getStudents();
            return new ModelAndView("studentList", "students", students);
    }

    @RequestMapping(value = "/teacher-list", method = RequestMethod.GET)
    public ModelAndView listTeachers() {
            List<Teacher> teachers = teacherService.getTeachers();
            return new ModelAndView("teacherList", "teachers", teachers);
    }

    @RequestMapping(value = "/studentForm", method = RequestMethod.GET)
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentForm";
    }

    @RequestMapping(value = "/teacherForm", method = RequestMethod.GET)
    public String showTeacherForm(Model model) {
        model.addAttribute("teacher", new Teacher());
        return "teacherForm";
    }

    @RequestMapping(value = "/submitStudent", method = RequestMethod.POST)
    public String submitStudentForm(@ModelAttribute("student") Student student, Model model) {
        studentService.insertStudent(student);
        model.addAttribute("student", student);
        return "studentResult";
    }

    @RequestMapping(value = "/submitTeacher", method = RequestMethod.POST)
    public String submitTeacherForm(@ModelAttribute("teacher") Teacher teacher, Model model) {
        teacherService.insertTeacher(teacher);
        model.addAttribute("teacher", teacher);
        return "teacherResult";
    }
}
