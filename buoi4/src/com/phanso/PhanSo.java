/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phanso;

/**
 *
 * @author thuynguyen
 */
public class PhanSo {
    private int a,b;

    public PhanSo() {
    }  

    public PhanSo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void nhapPhanSo(int a, int b) {
        System.out.println(" "+a/b);              
    }
    public int UCLN(int a, int b){
       while(a!=b){
           if(a>b){
               a = a-b;
           }else{
               b=b-a;
           }        
       }
       return a;
    }
    public int rutGon(int a, int b){
        int G ;
        G = (a/b)/(UCLN(a,b));
        return G;
    }   
    public int dao(int a, int b){
        int D;
        D = 1/(a/b);
        return D;
    }
    public void printInfo(){
        System.out.println("Rút gọn: "+rutGon(a,b));
        System.out.println("Phân số đảo: "+dao(a,b));
    }
    public void phepToan(int a, int b, int c, int d){
        int tong = 0;
        tong = (a*d + c*b)/b*d;
        int hieu = 0;
        hieu = (a*d - c*b)/b*d;
        int tich=1;
        tich = (a*c)/(b*d);
        int thuong = 1;
        thuong = (a/b)*(1/(c/d));
        System.out.println("Tổng: "+tong);
        System.out.println("Hiệu: "+hieu);
        System.out.println("Tích: "+tich);
        System.out.println("Thương: "+thuong);
        
    }
}
