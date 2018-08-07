package com.sw.project.service;

import java.util.Optional;

import com.sw.project.domain.Project;

public interface ProjectService {

	String saveProject(Project project);
	Optional<Project> findProjectByCode(String code);
	
}
