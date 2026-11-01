package com.inventory.management.system.inventory_management_system.entities;

import jakarta.persistence.Embedded;
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
@Table(name = "employee")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    private String idEmployee;

    private String name;

    @Enumerated(EnumType.STRING)
    private EmployeeRole role;

    private String contact;

    private String email;

    private String password;

    @Embedded
    private Address address;

    @ManyToOne
    @JoinColumn(name = "working_at", referencedColumnName = "workers")
    private WarehouseEntity workingAt;

}
