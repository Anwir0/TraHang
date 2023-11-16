/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.imple;


import Model.TraHangChiTiet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.DBconnection;

/**
 *
 * @author thiet
 */
public class TraHangChiTietDAO {
    Connection con = DBconnection.getConnection();
    private ArrayList<TraHangChiTiet> listTH;
    
    public TraHangChiTietDAO() {
        this.listTH = new ArrayList<>();
    }
    
    public ArrayList<TraHangChiTiet> getAll() {
        this.listTH = new ArrayList<>();
        try {
            String sql = "select id, return_bill_id, product_detail_id, quanttity_of_product_returned  from return_bill_detail";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TraHangChiTiet thct;
                int id = rs.getInt(1);
                int return_bill_id = rs.getInt(2);
                int product_detail_id = rs.getInt(3);
                int quanttity_of_product_returned = rs.getInt(4); 
                thct  = new TraHangChiTiet(id, id, id, return_bill_id, id, sql);
                

            this.listTH.add (thct);
        }
        } catch (Exception e) {
                    e.printStackTrace();
                }
        return listTH;
    }
}
