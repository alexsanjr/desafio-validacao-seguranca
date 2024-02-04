package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.User;

import java.util.Set;
import java.util.stream.Collectors;

public record UserInsertDTO(Long id, String email, String password, Set<RoleDTO> roles) {
    public UserInsertDTO(User user) {
        this(user.getId(), user.getEmail(), user.getPassword(),
                user.getRoles().stream().map(RoleDTO::new).collect(Collectors.toSet()));
    }
}