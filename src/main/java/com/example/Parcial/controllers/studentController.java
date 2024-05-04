package com.example.Parcial.controllers;

import com.example.Parcial.entities.student;
import com.example.Parcial.services.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/studiantes")
public class studentController {

    @Autowired
    studentService studentservice;

    @GetMapping
    public List<student> GetAll(){
    return studentservice.findAll();
    }
    @GetMapping(value="/{id}")
    public student GetById(@PathVariable Long id){
        return studentservice.findById(id);
    }
}
