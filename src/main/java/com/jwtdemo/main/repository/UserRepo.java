package com.jwtdemo.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jwtdemo.main.entity.User;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}
