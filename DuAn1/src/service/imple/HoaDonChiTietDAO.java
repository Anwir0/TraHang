/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.imple;


import Model.HoaDonChiTiet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.DBconnection;

/**
 *
 * @author thiet
 */
public class HoaDonChiTietDAO {
    Connection con = DBconnection.getConnection();
    private ArrayList<HoaDonChiTiet> listTH;
    
    public HoaDonChiTietDAO() {
        this.listTH = new ArrayList<>();
    }
    
    public ArrayList<HoaDonChiTiet> getAll() {
        this.listTH = new ArrayList<>();
        try {
            String sql = "select id, bill_id, product_detail_id, quanttity_urchased, price_now  from bill_detail";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonChiTiet hdct;
                int id = rs.getInt(1);
                int bill_id = rs.getInt(2);
                int product_detail_id = rs.getInt(3);
                int quanttity_urchased = rs.getInt(4); 
                double price_now = rs.getDouble(5);
                String status = rs.getString(10);
                hdct  = new HoaDonChiTiet(id, id, id, id, price_now);
                

            this.listTH.add (hdct);
        }
        } catch (Exception e) {
                    e.printStackTrace();
                }
        return listTH;
    }
    
    public Integer delete(String id){
        try {
            String sql = "delete from bill_detail WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,id);
            int row = ps.executeUpdate();
            if(row > 0){
                return row;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
