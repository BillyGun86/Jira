package com.simbersoft.project_jira.repository;

import com.simbersoft.project_jira.entity.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepo extends JpaRepository<Dashboard,Integer> {
}
