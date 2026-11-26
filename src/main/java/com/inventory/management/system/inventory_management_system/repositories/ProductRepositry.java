package com.inventory.management.system.inventory_management_system.repositories;

import com.inventory.management.system.inventory_management_system.entities.ProductCategory;
import com.inventory.management.system.inventory_management_system.entities.ProductEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepositry extends JpaRepository<ProductEntity, String> {

    @Query("SELECT ProductEntity p FROM ProductEntity p" +
            " JOIN p.inventories inv" +
            " WHERE inv.idWarehouse.idWarehouse = :idWarehouse")
    List<ProductEntity> findAllByWarehouse(String idWarehouse);

    @Query("SELECT ProductEntity p FROM ProductEntity p" +
            " JOIN p.inventories inv" +
            " WHERE inv.idWarehouse.idWarehouse = :idWarehouse AND p.productCategory = :productCategory")
    List<ProductEntity> findAllByWarehouseAndCategory(String idWarehouse, ProductCategory productCategory);

    @Query("SELECT ProductEntity p FROM ProductEntity p" +
            " JOIN p.inventories inv" +
            " WHERE inv.idWarehouse.idWarehouse = :idWarehouse AND p.stock <= :stock")
    List<ProductEntity> findAllByWarehouseAndStockLessThan(String idWarehouse, int stock);
}
