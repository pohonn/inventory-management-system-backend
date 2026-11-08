package com.inventory.management.system.inventory_management_system.repositories;

import com.inventory.management.system.inventory_management_system.entities.SellingEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellingRepository extends JpaRepository<SellingEntity, Integer> {

}