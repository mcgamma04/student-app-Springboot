package com.stringcodeltd.studentapp.dao;

import com.stringcodeltd.studentapp.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
