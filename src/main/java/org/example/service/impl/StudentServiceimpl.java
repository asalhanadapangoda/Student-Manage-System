package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Student;
import org.example.entity.StudentEntity;
import org.example.repository.Repository;
import org.example.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceimpl implements StudentService {

    final Repository repository;

    ModelMapper mapper;
    @Bean
    public void setUp(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addStudent(Student student) {
        StudentEntity entity =mapper.map(student,StudentEntity.class);
        repository.save(entity);
    }

    public Iterable<StudentEntity> getBook() {
        return (List<StudentEntity>) repository.findAll();
    }

    public void deleteBook(long id) {
        repository.deleteById(id);
    }

    public Student getBookById(long id) {
        Optional<StudentEntity> byId=repository.findById(id);
        return mapper.map(byId,Student.class) ;
    }
}
