package com.example.hrstop.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrstop.Entity.Role;
import com.example.hrstop.Enums.ERole;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
    Optional<Role> findByName(ERole name);
}
