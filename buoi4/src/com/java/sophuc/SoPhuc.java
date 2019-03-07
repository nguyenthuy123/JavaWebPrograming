/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.sophuc;

/**
 *
 * @author thuynguyen
 */
public class SoPhuc {
    private int a1;
    private int b1;
    private int a2;
    private int b2;
    public SoPhuc(){ 
}
    public SoPhuc(int a1, int b1, int a2, int b2){
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
    }
    public int getA1(){
        return a1;
    }
    public int getB1(){
        return b1;
    }
    public int getA2(){
        return a2;
    }
    public int getB2(){
        return b2;
    }
    public void setA1(){
        this.a1 = a1;
    }
    public void setB1(){
        this.b1 = b1;
    }
    public void setA2(){
        this.a2 = a2;
    }
    public void setB2(){
        this.b2 = b2;
    }
    public void tong(int a1, int b1, int a2, int b2){
        int tong1 = a1 + a2;
        int tong2 = b1 + b2;
        System.out.println("Tổng: "+tong1+" + "+tong2+"i");
    }
    public void hieu(int a1, int b1, int a2, int b2){
        int tru1 = a1 - a2;
        int tru2 = b1 - b2;
        System.out.println("Hiệu: "+tru1+" - "+tru2+"i");
    }
    public void tich(int a1, int b1, int a2, int b2){
        int tich1 = a1*a2 + b1*b2*(-1);
        int tich2 = a1*b2 + a2*b1;
        System.out.println("Tích: "+tich1+" + "+tich2+"i");
    }
    public void chia(int a1, int b1, int a2, int b2){
        double thuong1 = (a2*a1 + b1*b2)/(a1*a1 + b1*b1);
        double thuong2 = (a1*b2 - a2*b1)/(a1*a1 + b1*b1);
        System.out.println("Z2/Z1 = "+thuong1+" +  "+thuong2+"i");
    }
    public void printInfo(){
        tong(a1,b1,a2,b2);
        hieu(a1,b1,a2,b2);
        tich(a1,b1,a2,b2);
        chia(a1,b1,a2,b2);        
    }                
}
