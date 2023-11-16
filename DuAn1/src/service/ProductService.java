/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Date;
import model.entity.Product;

/**
 *
 * @author TgNam
 */
public interface ProductService {
    ArrayList<Product> getList_sale();
    String updateSale_ID_created_at(Date created_at, String id);
    void updateSale_ID(String id);
}
