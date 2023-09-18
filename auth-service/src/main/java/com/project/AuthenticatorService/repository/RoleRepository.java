package com.project.AuthenticatorService.repository;

import java.util.Optional;

import com.project.AuthenticatorService.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.AuthenticatorService.model.Role;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

