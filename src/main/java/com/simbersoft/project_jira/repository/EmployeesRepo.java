package com.simbersoft.project_jira.repository;

import com.simbersoft.project_jira.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<Employees,Integer> {
}
