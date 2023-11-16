/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entity;

import java.util.Date;

/**
 *
 * @author TgNam
 */
public class Bill {
    private double intoMoney;
    private double totalCost;
    private Address addressId;
    private Date createdAt;
    private Date deliveryDate;
    private String id;
    private Date updatedAt;
    private User userId;
    private Voucher voucherId;
    private String status;

    public Bill() {
    }

    public Bill(double intoMoney, double totalCost, Address addressId, Date createdAt, Date deliveryDate, String id, Date updatedAt, User userId, Voucher voucherId, String status) {
        this.intoMoney = intoMoney;
        this.totalCost = totalCost;
        this.addressId = addressId;
        this.createdAt = createdAt;
        this.deliveryDate = deliveryDate;
        this.id = id;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.voucherId = voucherId;
        this.status = status;
    }

    public double getIntoMoney() {
        return intoMoney;
    }

    public void setIntoMoney(double intoMoney) {
        this.intoMoney = intoMoney;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Voucher getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Voucher voucherId) {
        this.voucherId = voucherId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
