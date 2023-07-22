package com.assignment.taskmanager.dto;

import com.assignment.taskmanager.entity.UserEntity;


import java.time.LocalDateTime;

public class TaskDto {

    private Long id;



    private String taskName;

    private String taskDescription;

    private String taskStatus;

    private LocalDateTime taskDeadline;

    private String taskPriority;
    private Long userId;
}
