package com.inventory.management.system.inventory_management_system.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "inventory")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "code_product", referencedColumnName = "code")
    private ProductEntity codeProduct;

    @ManyToOne
    @JoinColumn(name = "id_warehouse", referencedColumnName = "idWarehouse")
    private WarehouseEntity idWarehouse;

    private int stock;

}
