package com.ak.service;


import com.ak.enity.Student;

import java.util.Collection;

public interface IStudentService {

    Collection<Student> getAll();
    Student getById (Long id);
    void deleteById (Long id);
    void add (Student student);
    void update (Student student);

}
