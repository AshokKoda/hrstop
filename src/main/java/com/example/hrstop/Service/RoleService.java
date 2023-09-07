package com.example.hrstop.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrstop.Entity.Role;
import com.example.hrstop.Repository.RoleRepository;

@Service
public class RoleService {
    
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public void save(Role role) {
        roleRepository.save(role);
    }

    public Role update(Role role) {
        Role role_id = roleRepository.findById(role.getRole_id()).orElse(null);
        role_id.setRole_name(role.getRole_name());
        return roleRepository.save(role_id);
    }

    public String delete(int role_id) {
        roleRepository.deleteById(role_id);
        return "Role is deleted " + role_id;
    }

    public Role getRoleById(int role_id) {
        return roleRepository.findById(role_id).get();
    }
}
