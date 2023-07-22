package com.assignment.taskmanager.converter;

import com.assignment.taskmanager.dto.UserDto;
import com.assignment.taskmanager.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public UserEntity convertDTOtoEntity(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userDto.getUserName());
        userEntity.setUserEmail(userDto.getUserEmail());
        userEntity.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        userEntity.setPhone(userDto.getPhone());
        userEntity.setRole("ROLE_USER");
        return userEntity;
    }
    public UserDto convertEntityToDTO(UserEntity userEntity){
        UserDto userDTO = new UserDto();
        userDTO.setId(userEntity.getId());
        userDTO.setUserName(userEntity.getUserName());
        userDTO.setUserEmail(userEntity.getUserEmail());
        userDTO.setPhone(userEntity.getPhone());
        userDTO.setRole(userEntity.getRole());
        return userDTO;
    }
}
