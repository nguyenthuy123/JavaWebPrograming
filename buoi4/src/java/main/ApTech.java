/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.main;

/**
 *
 * @author thuynguyen
 */
public class ApTech {
    private String ten;
    private double diem;
    private String loi;
    private int lanThi;

    public ApTech() {
    }

    public ApTech(String ten, double diem, String loi, int lanThi) {
        this.ten = ten;
        this.diem = diem;
        this.loi = loi;
        this.lanThi = lanThi;
    }

    public String getTen() {
        return ten;
    }

    public double getDiem() {
        return diem;
    }

    public String getLoi() {
        return loi;
    }

    public int getLanThi() {
        return lanThi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setLoi(String loi) {
        this.loi = loi;
    }

    public void setLanThi(int lanThi) {
        this.lanThi = lanThi;
    }
    public void kiemTra(){
        
    }
}
