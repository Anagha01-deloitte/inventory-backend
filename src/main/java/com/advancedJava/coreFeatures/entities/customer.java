package com.advancedJava.coreFeatures.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CUSTOMER_ID")
    private long customerId;

    @Column
    private String customerName;

    @Column
    private String customerAddress;

    @Column
    private gender customerGender;

    @Column
    private long loyaltyPoints;

    public long getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public gender isCustomerGender() {
        return customerGender;
    }

    public long getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerGender(gender customerGender) {
        this.customerGender = customerGender;
    }

    public void setLoyaltyPoints(long loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
}
