package com.ak.controller;

import com.ak.enity.Student;
import com.ak.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/studentService")  // http://localhost:8082/studentService
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Student> getAllStudents() {
        return studentService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteById(id);
        System.out.println("Student id: " + id + " has been deleted");
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student) {
        studentService.add(student);
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student) {
        studentService.update(student);
    }
    //metoda zwracajaca srednia studentow
}
