package com.inventory.management.system.inventory_management_system.entities;

import java.util.List;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vendor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VendorEntity {

    @Id
    private String code;

    private String name;

    private String contact;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "codeVendor")
    private List<BuyingEntity> buy;

}