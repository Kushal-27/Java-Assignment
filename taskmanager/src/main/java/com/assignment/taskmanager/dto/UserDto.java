package com.assignment.taskmanager.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
@Setter
public class UserDto {
    private Long id;

    private String userName;
    @NotNull(message = "Email is mandatory")
    @NotEmpty(message = "Email cannot be empty")
    private String userEmail;

    private String phone;
    @NotNull(message = "Password is mandatory")
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    private String role;
}
