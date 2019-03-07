/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author thuynguyen
 */
public class NhanVien {
    private String ten, diaChi;
    private int tuoi;
    private double luong;
    private int gio;

    public NhanVien() {
    }

    public NhanVien(String ten, String diaChi, int tuoi, double luong, int gio) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.luong = luong;
        this.gio = gio;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public int getGio() {
        return gio;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }
    public void printInfo(){
        System.out.println("Tên: "+ten);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Địa chỉ: "+diaChi);
        System.out.println("Tiền lương: "+luong);
        System.out.println("Số giờ: "+gio); 
        double t = tinhThuong(gio, luong);
        System.out.println("Thưởng = "+ t);
        
    }
    public double tinhThuong( int gio, double luong){
        double t = 0;
        if(gio>=200){
           t = luong*0.2;
        }
        else if(gio < 200 && gio >= 100){
           t = luong*0.1;
        }
        else if(gio < 100){
            t = 0;
        
        }
        return t;
    }
    

    
}
