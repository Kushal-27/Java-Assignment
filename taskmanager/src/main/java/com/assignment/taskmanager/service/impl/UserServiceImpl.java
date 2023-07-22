package com.assignment.taskmanager.service.impl;

import com.assignment.taskmanager.converter.UserConverter;
import com.assignment.taskmanager.dto.UserDto;
import com.assignment.taskmanager.entity.UserEntity;
import com.assignment.taskmanager.repository.UserRepository;
import com.assignment.taskmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;
    @Override
    public UserDto saveStudent(UserDto userDto) {
        UserEntity userEntity = userConverter.convertDTOtoEntity(userDto);
        userRepository.save(userEntity);
        return userConverter.convertEntityToDTO(userEntity);
    }
}
