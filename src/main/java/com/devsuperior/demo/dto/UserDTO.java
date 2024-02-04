package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.User;

import java.util.Set;
import java.util.stream.Collectors;

public record UserDTO(Long id, String email, Set<RoleDTO> roles) {

    public UserDTO(User user) {
        this(user.getId(), user.getEmail(),
                user.getRoles().stream().map(RoleDTO::new).collect(Collectors.toSet()));
    }
}