/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.imple;

import Model.TraHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.DBconnection;

/**
 *
 * @author thiet
 */
public class TraHangDAO {
    Connection con = DBconnection.getConnection();
    private ArrayList<TraHang> listTH;
    
    public TraHangDAO() {
        this.listTH = new ArrayList<>();
    }
    
    public ArrayList<TraHang> getAll() {
        this.listTH = new ArrayList<>();
        try {
            String sql = "select id, bill_id, total_cost, reason_description  from return_bill";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TraHang th;
                int id = rs.getInt(1);
                int bill_id = rs.getInt(2);
                double total_cost = rs.getDouble(3);
                String quanttity_urchased = rs.getString(4); 
                th  = new TraHang(id, id, total_cost, sql);
                

            this.listTH.add (th);
        }
        } catch (Exception e) {
                    e.printStackTrace();
                }
        return listTH;
    }
}
