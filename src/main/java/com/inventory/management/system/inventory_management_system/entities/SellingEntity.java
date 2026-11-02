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
@Table(name = "selling")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int totalSales;

    private ProcessType status;

    @ManyToOne
    @JoinColumn(name = "warehouse", referencedColumnName = "id")
    private WarehouseEntity warehouse;

    @ManyToOne
    @JoinColumn(name = "customer", referencedColumnName = "code")
    private CustomerEntity customer;

}
