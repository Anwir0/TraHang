/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import java.util.ArrayList;
import model.entity.Product;
import java.util.Date;
import model.entity.SaleProduct;

/**
 *
 * @author TgNam
 */
public class ProductRepository {

    //select lấy toàn bộ dữ liệu của product
    public ArrayList<Product> getAll_sale() {
        ArrayList<Product> list = new ArrayList<>();
        try {
            String sql = "select \n"
                    + "product.product_price,\n"
                    + "product.created_at,\n"
                    + "product.id, \n"
                    + "sale_product.sale,\n"
                    + "product.updated_at,\n"
                    + "product.name_product,\n"
                    + "product.status,product.sale_id  \n"
                    + "from db_levents.product \n"
                    + "LEFT join db_levents.sale_product on sale_product.id = product.sale_id;";
            ResultSet rs = JDBCHelped.executeQuery(sql);
            while (rs.next()) {
                list.add(new Product(rs.getDouble(1), rs.getDate(2), rs.getString(3), new SaleProduct(rs.getString(8), rs.getDouble(4)), rs.getDate(5), rs.getString(6), rs.getString(7))
                );
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean updateSale_ID_created_at(Date created_at, String id) {
        try {
            String sql = "Update product set sale_id = (select id from sale_product where created_at = ?) where id = ?";
            JDBCHelped.excuteUpdate(sql, created_at, id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean updateSale_ID(String id) {
        try {
            String sql = "Update product set sale_id = null where sale_id = ?";
            JDBCHelped.excuteUpdate(sql,id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
