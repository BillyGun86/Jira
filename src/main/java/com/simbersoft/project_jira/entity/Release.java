package com.simbersoft.project_jira.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "release")
public class Release{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "start")
    private Date start;

    @Column(name = "finish")
    private Date finish;

    @Column(name = "version")
    private float version;

    public Release() {
    }
}
