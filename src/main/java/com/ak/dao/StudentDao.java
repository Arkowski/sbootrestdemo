package com.ak.dao;


import com.ak.enity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class StudentDao implements IStudentDao {




    //hashset albo hashmap jest wydajniejszą formą kolekcji bo nie iteruje po całej liście
    Map<Long, Student> students = new HashMap<>();

    public StudentDao(){
        students.put(1L, new Student(1L, "Marek", "Niedziedz", "Frontend"));
        students.put(2L, new Student(2L, "Arek", "Rosomak", "Java"));
        students.put(3L, new Student(3L, "Kasia", "Delfin", "Ruby"));
        students.put(4L, new Student(4L, "Wojtek", "Niedziedz", "Frontend"));
    }

    @Override
    public Collection<Student> getAll() {
        return students.values();
    }

    @Override
    public Student getById(Long id) {
        return students.get(id);
    }

    @Override
    public void deleteById(Long id) {
        students.remove(id);
    }

    @Override
    public void add(Student student) {
        students.put(student.getId(), student);

    }
    @Override
    public void update(Student student) {
        students.replace(student.getId(), student);
    }
}
