package com.inventory.management.system.inventory_management_system.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "transfer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferEntity {

    // TODO: warehousefrom dan warehouseDestination perlu ditambah ke List
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transfer")
    private int idTransfer;

    @Column(name = "warehouse_from", nullable = false)
    private int warehouseFrom;

    @Column(name = "warehouse_destination", nullable = false)
    private int warehouseDestination;

    @Column(name = "id_employee", nullable = false)
    private int idEmployee;

    @Enumerated(value = EnumType.STRING)
    private ProcessType status;

    @ManyToMany(mappedBy = "transfers")
    @Column(name = "warehouses")
    private List<WarehouseEntity> warehouseEntities;

    @OneToMany(mappedBy = "transfer", fetch = FetchType.LAZY)
    private List<TransferDetailEntity> transferDetail;

}
