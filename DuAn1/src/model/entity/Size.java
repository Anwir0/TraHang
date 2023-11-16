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

public class Size {
    // private fields
    private Date createdAt;
    private String id;
    private Date updatedAt;
    private String nameSize;

    public Size() {
    }

    public Size(Date createdAt, String id, Date updatedAt, String nameSize) {
        this.createdAt = createdAt;
        this.id = id;
        this.updatedAt = updatedAt;
        this.nameSize = nameSize;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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

    public String getNameSize() {
        return nameSize;
    }

    public void setNameSize(String nameSize) {
        this.nameSize = nameSize;
    }
    
}

