/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class HoaDon {
    private int id;
    private int user;
    private int address_id;
    private double into_money, total_cost;
    private Date created_at, update_at, delivery_at;
    private int voucher;
    private String status;

    public HoaDon() {
    }

    public HoaDon(int id, int user, int address_id, double into_money, double total_cost, Date created_at, Date update_at, Date delivery_at, int voucher, String status) {
        this.id = id;
        this.user = user;
        this.address_id = address_id;
        this.into_money = into_money;
        this.total_cost = total_cost;
        this.created_at = created_at;
        this.update_at = update_at;
        this.delivery_at = delivery_at;
        this.voucher = voucher;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public double getInto_money() {
        return into_money;
    }

    public void setInto_money(double into_money) {
        this.into_money = into_money;
    }

    public double getTotal_cost() {
        return total_cost;
    }

    public void setTotal_cost(double total_cost) {
        this.total_cost = total_cost;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Date getDelivery_at() {
        return delivery_at;
    }

    public void setDelivery_at(Date delivery_at) {
        this.delivery_at = delivery_at;
    }

    public int getVoucher() {
        return voucher;
    }

    public void setVoucher(int voucher) {
        this.voucher = voucher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

   
   

    
   
    
    
    
}
