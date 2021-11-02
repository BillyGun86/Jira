package com.simbersoft.project_jira.repository;

import com.simbersoft.project_jira.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Integer> {
}
