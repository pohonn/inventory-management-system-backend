package com.inventory.management.system.inventory_management_system.repositories;

import java.util.Optional;

import com.inventory.management.system.inventory_management_system.entities.EmployeeEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {

    Optional<EmployeeEntity> findByEmailAndPassword(String email, String password);

}
