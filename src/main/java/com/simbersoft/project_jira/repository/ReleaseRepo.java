package com.simbersoft.project_jira.repository;

import com.simbersoft.project_jira.entity.Release;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepo extends JpaRepository<Release,Integer> {
}
