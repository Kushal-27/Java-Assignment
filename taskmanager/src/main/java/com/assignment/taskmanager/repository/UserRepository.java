package com.assignment.taskmanager.repository;

import com.assignment.taskmanager.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    boolean existsByUserEmail(String userEmail);
    UserEntity findByUserEmail(String userEmail);
}
