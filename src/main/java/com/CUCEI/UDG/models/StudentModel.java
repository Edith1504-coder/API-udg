package com.CUCEI.UDG.models;

import jakarta.persistence.*;

@Entity
@Table(name="Students")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    private String code;
    private String name;
    private String degree;
    private double score;
    private String email;

    public StudentModel() {
    }

    public StudentModel(Long id, String code, String name, String degree, double score, String email) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.degree = degree;
        this.score = score;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}