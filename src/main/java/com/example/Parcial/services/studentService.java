package com.example.Parcial.services;

import com.example.Parcial.entities.student;

import java.util.List;

public interface studentService {
    public List<student> findAll();
    public student findById(Long id);
}
