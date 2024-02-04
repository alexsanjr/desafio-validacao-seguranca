package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Role;

public record RoleDTO(Long id, String authority) {
    public RoleDTO(Role role) {
        this(role.getId(), role.getAuthority());
    }
}