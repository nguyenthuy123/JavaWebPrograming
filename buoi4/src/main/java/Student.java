/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

/**
 *
 * @author thuynguyen
 */
public class Student {
    private String ma;
    private double diem;
    private int tuoi;
    private String lop;

    public Student() {
    }

    public Student(String ma, double diem, int tuoi, String lop) {
        this.ma = ma;
        this.diem = diem;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMa() {
        return ma;
    }

    public double getDiem() {
        return diem;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void showInfo(){
        System.out.println("mã: "+ma);
        System.out.println("Điểm: "+diem);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Lớp: "+lop);
    }
    public void kiemTra(double diem){
        if(diem > 8.0){
            System.out.println("Được học bổng");
        }
        else
            System.out.println("Không được học bổng");
    }
}
