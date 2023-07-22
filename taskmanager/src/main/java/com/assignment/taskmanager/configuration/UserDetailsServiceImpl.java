package com.assignment.taskmanager.configuration;

import com.assignment.taskmanager.configuration.CustomUserDetails;
import com.assignment.taskmanager.entity.UserEntity;
import com.assignment.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userEmail) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUserEmail(userEmail);
        if (userEntity!=null){
            return new CustomUserDetails(userEntity);
        }
        throw new UsernameNotFoundException("User Not Available");
    }
}
