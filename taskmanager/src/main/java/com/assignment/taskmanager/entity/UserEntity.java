package com.assignment.taskmanager.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String userName;
    @Column(name = "EMAIL", nullable = false)
    private String userEmail;
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(nullable = false, unique = false)
    private String password;
    private String role;
}
