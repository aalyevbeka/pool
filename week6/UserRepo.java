package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findById(int id);
    
    User findByNameContaining(String name);
}
