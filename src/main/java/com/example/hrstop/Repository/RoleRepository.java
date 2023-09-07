package com.example.hrstop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrstop.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
