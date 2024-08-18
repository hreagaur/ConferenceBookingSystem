package com.conferencemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conferencemanagementsystem.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
