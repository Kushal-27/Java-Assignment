package com.assignment.taskmanager.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UserDto {
    private Long id;
    @NotNull(message = "Username is mandatory")
    @NotEmpty(message = "Username Email cannot be empty")
    private String userName;
    @NotNull(message = "Email is mandatory")
    @NotEmpty(message = "Email cannot be empty")
    private String userEmail;
    @NotNull(message = "Phone is mandatory")
    @NotEmpty(message = "Phone cannot be empty")
    private String phone;
    @NotNull(message = "Password is mandatory")
    @NotEmpty(message = "Password cannot be empty")
    private String password;
}
