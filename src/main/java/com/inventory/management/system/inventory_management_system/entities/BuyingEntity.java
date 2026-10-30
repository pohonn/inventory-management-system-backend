package com.inventory.management.system.inventory_management_system.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "buying")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BuyingEntity {

    @Id
    private int id;

    @Column(name = "total_purchase")
    private int totalPurchase;

    @Column(name = "process_type")
    @Enumerated(EnumType.STRING)
    private ProcessType processType;

    @ManyToOne
    @JoinColumn(name = "code_vendor", referencedColumnName = "code")
    private VendorEntity codeVendor;

    @ManyToOne
    @JoinColumn(name = "id_warehouse", referencedColumnName = "idWarehouse")
    private WarehouseEntity idWarehouse;

}
