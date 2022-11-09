package com.advancedJava.coreFeatures.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order")

public class order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column
    private Timestamp orderDate;

    @Column
    private boolean orderRefundable;

    @Column
    private boolean orderReturned;

    @Column
    private paymentStatus orderPaymentStatus;

    @Column
    private Timestamp orderDueDate;

    @Column
    private long orderDueAmount;

    @Column
    private long orderTotalAmount;

    @Column
    private String orderBillingAddress;

    @Column
    private String orderShippingAddress;

    @Column
    private long orderDiscount;

    public long getOrderId() {
        return orderId;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public boolean isOrderRefundable() {
        return orderRefundable;
    }

    public boolean isOrderReturned() {
        return orderReturned;
    }

    public paymentStatus getPaymentStatus() {
        return orderPaymentStatus;
    }

    public Timestamp getOrderDueDate() {
        return orderDueDate;
    }

    public long getOrderDueAmount() {
        return orderDueAmount;
    }

    public long getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public String getOrderBillingAddress() {
        return orderBillingAddress;
    }

    public String getOrderShippingAddress() {
        return orderShippingAddress;
    }

    public long getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderRefundable(boolean orderRefundable) {
        this.orderRefundable = orderRefundable;
    }

    public void setOrderReturned(boolean orderReturned) {
        this.orderReturned = orderReturned;
    }

    public void setPaymentStatus(paymentStatus orderPaymentStatus) {
        this.orderPaymentStatus = orderPaymentStatus;
    }

    public void setOrderDueDate(Timestamp orderDueDate) {
        this.orderDueDate = orderDueDate;
    }

    public void setOrderDueAmount(long orderDueAmount) {
        this.orderDueAmount = orderDueAmount;
    }

    public void setOrderTotalAmount(long orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public void setOrderBillingAddress(String orderBillingAddress) {
        this.orderBillingAddress = orderBillingAddress;
    }

    public void setOrderShippingAddress(String orderShippingAddress) {
        this.orderShippingAddress = orderShippingAddress;
    }

    public void setOrderDiscount(long orderDiscount) {
        this.orderDiscount = orderDiscount;
    }
}

