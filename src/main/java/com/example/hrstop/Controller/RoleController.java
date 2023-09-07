package com.example.hrstop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrstop.Entity.Role;
import com.example.hrstop.Service.RoleService;

@RestController
@RequestMapping("api/v1/roles")
public class RoleController {
    
    @Autowired
    public RoleService roleService;

    @GetMapping("/getAllRoles")
    public List<Role> getAllRolesList() {
        return roleService.getAllRoles();
    }

    @PostMapping("/save")
    public void saveRole(@RequestBody Role role) {
        roleService.save(role);
    }

    @PutMapping("/update")
    public Role updateRole(@RequestBody Role role) {
        return roleService.update(role);
    }

    @DeleteMapping("/delete/{role_id}")
    public String deleteRoleById(@PathVariable int role_id) {
        return roleService.delete(role_id);
    }

    @GetMapping("/getByRoleId/{role_id}")
    public Role getRoleById(@PathVariable int role_id) {
        return roleService.getRoleById(role_id);
    }
}
