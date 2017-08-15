package com.ak.service;

import com.ak.dao.IStudentDao;
import com.ak.dao.StudentDao;
import com.ak.enity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public Collection<Student> getAll() {
        return studentDao.getAll();
    }

    @Override
    public Student getById(Long id) {
        return studentDao.getById(id);
    }

    @Override
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }

    @Override
    public void add(Student student) {
        studentDao.add(student);

    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }
}
