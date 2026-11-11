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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transfer")
    private int idTransfer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_from", nullable = false)
    private WarehouseEntity warehouseFrom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_destination", nullable = false)
    private WarehouseEntity warehouseDestination;

    @Column(name = "id_employee", nullable = false)
    private int idEmployee;

    @Enumerated(value = EnumType.STRING)
    private ProcessType status;

    @OneToMany(mappedBy = "transfer", fetch = FetchType.LAZY)
    private List<TransferDetailEntity> transferDetail;

}
