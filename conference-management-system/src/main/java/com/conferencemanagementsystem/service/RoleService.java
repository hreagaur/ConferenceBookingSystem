package com.conferencemanagementsystem.service;

import java.util.List;

import com.conferencemanagementsystem.model.Role;

public interface RoleService {

    Role saveRole(Role role);

    List<Role> getAllRoles();

    Role updateRole(Role role, Long id);
    
    Role getRoleById(Long id);

    void deleteRole(Long id);
}

