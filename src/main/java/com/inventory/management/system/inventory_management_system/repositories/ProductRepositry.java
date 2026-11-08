package com.inventory.management.system.inventory_management_system.repositories;

import com.inventory.management.system.inventory_management_system.entities.ProductEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositry extends JpaRepository<ProductEntity, String> {

}
