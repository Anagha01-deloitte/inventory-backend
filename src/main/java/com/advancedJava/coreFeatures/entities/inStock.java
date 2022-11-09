package com.advancedJava.coreFeatures.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "inStock")
public class inStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IN_STOCK_ID")
    private long inStockId;

    @Column
    private long quantity;

    @Column
    private Timestamp DOA;


    @Column
    private boolean ifDeleted;

    public long getInStockId() {
        return inStockId;
    }

    public long getQuantity() {
        return quantity;
    }

    public Timestamp getDOA() {
        return DOA;
    }

    public boolean isIfDeleted() {
        return ifDeleted;
    }


    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void setDOA(Timestamp DOA) {
        this.DOA = DOA;
    }

    public void setIfDeleted(boolean ifDeleted) {
        this.ifDeleted = ifDeleted;
    }
}