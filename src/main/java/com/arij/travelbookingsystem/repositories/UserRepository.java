package com.arij.travelbookingsystem.repositories;

import com.arij.travelbookingsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
