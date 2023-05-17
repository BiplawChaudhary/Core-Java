package com.security.BaseforProject.repo;

import com.security.BaseforProject.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {
}
