package com.simbersoft.project_jira.entity;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employees{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "role")
    private String role;

    public Employees() {
    }
}
