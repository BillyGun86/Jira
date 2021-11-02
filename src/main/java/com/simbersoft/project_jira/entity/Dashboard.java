package com.simbersoft.project_jira.entity;

import javax.persistence.*;

@Entity
@Table(name = "dashboard")
public class Dashboard{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "task")
    private String task;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project")
    private Project project;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author")
    private Employees author;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "executor")
    private Employees executor;

    public Dashboard() {
    }

    public Dashboard(String task, Project project, Employees author, Employees executor) {
        this.task = task;
        this.project = project;
        this.author = author;
        this.executor = executor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employees getAuthor() {
        return author;
    }

    public void setAuthor(Employees author) {
        this.author = author;
    }

    public Employees getExecutor() {
        return executor;
    }

    public void setExecutor(Employees executor) {
        this.executor = executor;
    }
}
