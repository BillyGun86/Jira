package com.simbersoft.project_jira.controller;

import com.simbersoft.project_jira.repository.ProjectRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Api("ProjectController")
public class ProjectController {
    private final ProjectRepo projectRepo;

    ProjectController(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @PostMapping("")
    @ApiOperation("получить данные по релизу")
    public void postMapping() {

    }

    @DeleteMapping("")
    @ApiOperation("удалить данные по релизу")
    public void deleteMapping() {

    }
}