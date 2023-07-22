package com.assignment.taskmanager.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Task_Table")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String taskName;
    @Column(nullable = false)
    private String taskDescription;
    @Column(nullable = false)
    private String taskStatus;
    @Column(nullable = false)
    private LocalDateTime taskDeadline;
    @Column(nullable = false)
    private String taskPriority;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserEntity userEntity;
}
