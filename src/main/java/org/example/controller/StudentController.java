package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Student;
import org.example.entity.StudentEntity;
import org.example.service.impl.BookService;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {
    final BookService service;

    @PostMapping("/addStudent")
    public  void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping("/getStudent")
    public Iterable<StudentEntity> getStudent(){
        return service.getBook();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable long id){
        service.deleteBook(id);
    }

    @GetMapping("/search/{id}")
    public Student getStudentById(@PathVariable long id){
        return service.getBookById(id);
    }
}
