package com.inventory.management.system.inventory_management_system.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

    @Id
    private String code;

    private String name;

    @Column(name = "selling_price")
    private double sellingPrice;

    @Column(name = "buying_price")
    private double buyingPrice;

    private int stock;

    @Column(name = "product_category")
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;

    @OneToMany(mappedBy = "codeProduct", fetch = FetchType.LAZY)
    private List<InventoryEntity> inventories;

}
