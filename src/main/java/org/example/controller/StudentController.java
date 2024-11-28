package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Student;
import org.example.entity.StudentEntity;
import org.example.service.impl.StudentServiceimpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@CrossOrigin
public class StudentController {
   final StudentServiceimpl service;

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
