package com.stringcodeltd.studentapp.project.model;


import com.stringcodeltd.studentapp.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;
    @NotNull(message = "project name cannot be empty")
    private String projecctName;
    @ManyToMany(mappedBy = "project")
    private Set<Student> student=new HashSet<>();


}