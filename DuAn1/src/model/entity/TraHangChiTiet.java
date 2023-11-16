/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author thiet
 */
public class TraHangChiTiet {
    private int id;
    private int idTH;
    private int idSPCT;
    private int soLuongSPTra;
    private double gia;
    private String trangThai;

    public TraHangChiTiet() {
    }

    public TraHangChiTiet(int id, int idTH, int idSPCT, int soLuongSPTra, double gia, String trangThai) {
        this.id = id;
        this.idTH = idTH;
        this.idSPCT = idSPCT;
        this.soLuongSPTra = soLuongSPTra;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTH() {
        return idTH;
    }

    public void setIdTH(int idTH) {
        this.idTH = idTH;
    }

    public int getIdSPCT() {
        return idSPCT;
    }

    public void setIdSPCT(int idSPCT) {
        this.idSPCT = idSPCT;
    }

    public int getSoLuongSPTra() {
        return soLuongSPTra;
    }

    public void setSoLuongSPTra(int soLuongSPTra) {
        this.soLuongSPTra = soLuongSPTra;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
