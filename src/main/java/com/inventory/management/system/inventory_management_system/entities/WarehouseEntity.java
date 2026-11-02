package com.inventory.management.system.inventory_management_system.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "warehouse")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WarehouseEntity {

    @Id
    @Column(name = "id_warehouse")
    private String idWarehouse;

    private String name;

    private String contact;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "idWarehouse", fetch = FetchType.LAZY)
    private List<InventoryEntity> inventories;

    @OneToMany(mappedBy = "idWarehouse", fetch = FetchType.LAZY)
    private List<BuyingEntity> buyers;

    @OneToMany(mappedBy = "workingAt", fetch = FetchType.LAZY)
    private List<EmployeeEntity> workers;

    @OneToMany(mappedBy = "warehouse", fetch = FetchType.LAZY)
    private List<SellingEntity> seller;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "warehouse_transfer", joinColumns = @JoinColumn(name = "id_transfer"), inverseJoinColumns = @JoinColumn(name = "id_warehouse"))
    private List<TransferEntity> transfers;
}
