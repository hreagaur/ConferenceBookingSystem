package com.conferencemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.conferencemanagementsystem.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
