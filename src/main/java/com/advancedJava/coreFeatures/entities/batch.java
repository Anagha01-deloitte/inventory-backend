package com.advancedJava.coreFeatures.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Batch")
public class batch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BATCH_ID")
    private long batchId;

    @Column
    private String productName;

    @Column
    private Timestamp expiryDate;

    @Column
    private Timestamp manufactureDate;

    @Column
    private boolean ifDeleted;

    public long getBatchId() {
        return batchId;
    }

    public String getProductName() {
        return productName;
    }

    public Timestamp getExpiryDate() {
        return expiryDate;
    }

    public Timestamp getManufactureDate() {
        return manufactureDate;
    }

    public boolean isIfDeleted() {
        return ifDeleted;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setExpiryDate(Timestamp expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setManufactureDate(Timestamp manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setIfDeleted(boolean ifDeleted) {
        this.ifDeleted = ifDeleted;
    }
}