package com.assignment.taskmanager.repository;

import com.assignment.taskmanager.entity.TaskEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
}
