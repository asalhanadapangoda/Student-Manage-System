package org.example.service;

import org.example.dto.Student;
import org.example.entity.StudentEntity;

public interface StudentService {
    void addStudent(Student student);
    Iterable<StudentEntity> getBook();
    void deleteBook(long id);
    Student getBookById(long id);


}
