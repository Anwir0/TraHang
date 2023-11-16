/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entity;

/**
 *
 * @author TgNam
 */
import java.util.Date;

public class User {
    // private fields
    private Address addressId;
    private Date createdAt;
    private Date dateOfBirth;
    private String id;
    private Token tokenId;
    private Date updatedAt;
    private String account;
    private String email;
    private String fullName;
    private String numberPhone;
    private String password;
    private String status;

    public User() {
    }

    public User(Address addressId, Date createdAt, Date dateOfBirth, String id, Token tokenId, Date updatedAt, String account, String email, String fullName, String numberPhone, String password, String status) {
        this.addressId = addressId;
        this.createdAt = createdAt;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.tokenId = tokenId;
        this.updatedAt = updatedAt;
        this.account = account;
        this.email = email;
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.password = password;
        this.status = status;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Token getTokenId() {
        return tokenId;
    }

    public void setTokenId(Token tokenId) {
        this.tokenId = tokenId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}

