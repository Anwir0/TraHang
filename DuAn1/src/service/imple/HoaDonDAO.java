/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.imple;

import Model.HoaDon;
import java.sql.*;
import java.util.ArrayList;
import repository.DBconnection;

/**
 *
 * @author DELL
 */
public class HoaDonDAO {

    Connection con = DBconnection.getConnection();
    private ArrayList<HoaDon> listTH;

    public HoaDonDAO() {
        this.listTH = new ArrayList<>();
    }

    public ArrayList<HoaDon> getAll() {
        this.listTH = new ArrayList<>();
        try {
            String sql = "select id, user_id, address_id, into_money, total_cost, created_at, updated_at, delivery_date, voucher_id, status from bill";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd;
                int id = rs.getInt(1);
                int user = rs.getInt(2);
                int address_id = rs.getInt(3);
                double into_money = rs.getDouble(4); 
                double total_cost = rs.getDouble(5);
                Date created_at = rs.getDate(6);
                Date update_at = rs.getDate(7);
                Date delivery_at = rs.getDate(8);
                int voucher = rs.getInt(9);
                String status = rs.getString(10);
                hd  = new HoaDon(id, user, address_id, into_money, total_cost, created_at, update_at, delivery_at, voucher, status);
                


            this.listTH.add (hd);
        }
        } catch (Exception e) {
                    e.printStackTrace();
                }
        return listTH;
    }
    
       
}
