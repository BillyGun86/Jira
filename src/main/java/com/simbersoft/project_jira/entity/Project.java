package com.simbersoft.project_jira.entity;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "release")
    private float release;

    @Column(name = "status")
    private String status;

    public Project() {
    }

    public Project(float release, String status) {
        this.release = release;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRelease() {
        return release;
    }

    public void setRelease(float release) {
        this.release = release;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
