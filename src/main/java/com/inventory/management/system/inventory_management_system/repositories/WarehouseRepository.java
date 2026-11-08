package com.inventory.management.system.inventory_management_system.repositories;

import com.inventory.management.system.inventory_management_system.entities.WarehouseEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<WarehouseEntity, String> {

}
