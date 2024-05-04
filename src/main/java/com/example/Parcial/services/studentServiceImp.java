package com.example.Parcial.services;

import com.example.Parcial.Dao.studentDao;
import com.example.Parcial.entities.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceImp implements studentService {

    @Autowired
    studentDao studentdao;

    @Override
    public List<student> findAll() {
        return (List<student>)studentdao.findAll();
    }

    @Override
    public student findById(Long id) {
        return (student) studentdao.findById(id).orElse(null);
    }
}
