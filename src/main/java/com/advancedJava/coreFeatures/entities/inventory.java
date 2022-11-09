package com.advancedJava.coreFeatures.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "inventory")
public class inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INVENTORY_ID")
    private long inventoryId;

    @Column
    private long totalQuantity;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private long pricePerUnit;

    @Column
    private boolean ifDeleted;

    public long getInventoryId() {
        return inventoryId;
    }

    public long getTotalQuantity() {
        return totalQuantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getPricePerUnit() {
        return pricePerUnit;
    }

    public boolean isIfDeleted() {
        return ifDeleted;
    }

    public void setTotalQuantity(long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPricePerUnit(long pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public void setIfDeleted(boolean ifDeleted) {
        this.ifDeleted = ifDeleted;
    }
}


