package com.yakub.controller;

import com.yakub.model.Student;
import com.yakub.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }

    @DeleteMapping("/delete/{sId}")
    public void delete(@PathVariable int sId){
        studentRepo.deleteById(sId);
    }

    @GetMapping("/get/{sId}")
    public Student getOne(@PathVariable int sId){
        return studentRepo.findById(sId).get();
    }

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return studentRepo.findAll();
    }

    @PutMapping("/update/{sId}")
    public Student update(@RequestBody Student student,@PathVariable Integer sId){
        Student s1=studentRepo.findById(sId).get();
             s1.setsName(student.getsName());
             s1.setsMail(student.getsMail());
             s1.setsAddress(student.getsAddress());

             return studentRepo.save(s1);
    }
}
