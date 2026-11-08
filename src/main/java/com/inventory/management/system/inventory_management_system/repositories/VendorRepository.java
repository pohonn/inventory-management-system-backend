package com.inventory.management.system.inventory_management_system.repositories;

import com.inventory.management.system.inventory_management_system.entities.VendorEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<VendorEntity, String> {

}
