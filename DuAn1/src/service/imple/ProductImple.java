/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.imple;

import java.util.ArrayList;
import java.util.Date;
import model.entity.Product;
import repository.ProductRepository;
import service.ProductService;

/**
 *
 * @author TgNam
 */
public class ProductImple implements ProductService{
    ProductRepository pr = new ProductRepository();
    @Override
    public ArrayList<Product> getList_sale() {
        return pr.getAll_sale();
    }

    @Override
    public String updateSale_ID_created_at(Date created_at, String id) {
        if (pr.updateSale_ID_created_at(created_at, id)) {
            return "Thêm sản phẩm sale thành công!";
        }
        else{
            return "Thêm sản phẩm sale thất bại!";
        }
    }

    @Override
    public void updateSale_ID(String id) {
        pr.updateSale_ID(id);       
    }
    
}
