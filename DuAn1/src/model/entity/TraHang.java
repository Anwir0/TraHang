/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thiet
 */
public class TraHang {
    private int id;
    private int id_bill;
    private Double tienTra;
    private String lyDo;

    public TraHang() {
    }

    public TraHang(int id, int id_bill, Double tienTra, String lyDo) {
        this.id = id;
        this.id_bill = id_bill;
        this.tienTra = tienTra;
        this.lyDo = lyDo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_bill() {
        return id_bill;
    }

    public void setId_bill(int id_bill) {
        this.id_bill = id_bill;
    }

    public Double getTienTra() {
        return tienTra;
    }

    public void setTienTra(Double tienTra) {
        this.tienTra = tienTra;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
    
}
