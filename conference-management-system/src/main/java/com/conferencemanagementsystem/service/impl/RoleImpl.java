package com.conferencemanagementsystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conferencemanagementsystem.model.Role;
import com.conferencemanagementsystem.repository.RoleRepository;
import com.conferencemanagementsystem.service.RoleService;

@Service
public class RoleImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }
    
    @Override
    public Role updateRole(Role role, Long id) {
        Role existingRole = getRoleById(id);
        if (existingRole!= null) {
            existingRole.setRole(role.getRole());
            return roleRepository.save(existingRole);
        } else {
            return null;
        }
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

	

	
	}


