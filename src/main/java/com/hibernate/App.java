package com.hibernate;

import com.Dao.StudentDao;
import com.model.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {

        Student student = new Student("Ashraf","Shaikh","ashrsf@123");
        Student student1 = new Student("Aman","Agarwal","assf@123");

        StudentDao studentDao = new StudentDao();
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);

        Student student2 = studentDao.getStudentById(1);
        System.out.println(student2);

        List<Student> studentList = studentDao.getAllStudents();
        studentList.forEach(student3 -> System.out.println(student3.getId()));

        studentDao.deleteStudent(2);

        student.setEmail("ashraf@coditas.com");
        studentDao.updateStudent(student);




    }
}
