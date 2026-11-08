package com.inventory.management.system.inventory_management_system.repositories;

import com.inventory.management.system.inventory_management_system.entities.InventoryEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryEntity, Integer> {

}
