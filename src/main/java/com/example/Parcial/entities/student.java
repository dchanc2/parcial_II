package com.example.Parcial.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "estudiantes")
public class student {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;


    @Column(name="created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}


