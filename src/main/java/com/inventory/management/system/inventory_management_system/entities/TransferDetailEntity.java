package com.inventory.management.system.inventory_management_system.entities;

import jakarta.persistence.Column;
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
@Table(name = "transfer_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transfer_detail")
    private int idTransferDetail;

    private String codeProduct;

    private int stockSent;

    @ManyToOne
    @JoinColumn(name = "transfer", referencedColumnName = "id_transfer")
    private TransferEntity transfer;

}
