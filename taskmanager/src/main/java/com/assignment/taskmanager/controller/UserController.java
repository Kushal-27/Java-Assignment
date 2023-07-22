package com.assignment.taskmanager.controller;

import com.assignment.taskmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.assignment.taskmanager.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/signin")
    public String signin(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto",userDto);
        return "login_page";
    }
    @PostMapping("/signin")
    public String signin(@ModelAttribute("userDto") UserDto userDto) {

        return "login_page";
    }

    @GetMapping("/register")
    public String register(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto",userDto);
        return "register_user";

    }
    @PostMapping("/register")
    public String register(@ModelAttribute("userDto") UserDto userDto) {
            userService.saveStudent(userDto);
        return "redirect:/register";

    }
}