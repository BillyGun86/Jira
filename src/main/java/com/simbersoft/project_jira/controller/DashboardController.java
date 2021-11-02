package com.simbersoft.project_jira.controller;

import com.simbersoft.project_jira.repository.DashboardRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("DashboardController")
public class DashboardController {
    private final DashboardRepo dashboardRepo;

    DashboardController(DashboardRepo dashboardRepo) {
        this.dashboardRepo = dashboardRepo;
    }

    @GetMapping("")
    @ApiOperation("отобразить все задачи")
    public void getMapping() {

    }

    @PostMapping("")
    @ApiOperation("получить задачу")
    public void postTask() {

    }

    @DeleteMapping("")
    @ApiOperation("удалить задачу")
    public void deleteTask() {

    }

    @PostMapping("")
    @ApiOperation("получить автора задачи")
    public void postAuthor() {

    }

    @DeleteMapping("")
    @ApiOperation("удалить автора задачи")
    public void deleteAuthor() {

    }

    @PostMapping("")
    @ApiOperation("получить исполнителя задачи")
    public void postExecutor() {

    }

    @DeleteMapping("")
    @ApiOperation("удалить исполнителя задачи")
    public void deleteExecutor() {

    }
}