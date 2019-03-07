/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hinhChuNhat;

/**
 *
 * @author thuynguyen
 */
public class HinhChuNhat {
    private int a;
    private int b;
    HinhChuNhat(){
        
    }

    public HinhChuNhat(int a, int b) {
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
    public int chuVi(int a, int b){
        int C = 0;
        C = (a + b)*2;
        return C;
    }
    public int dienTich(int a, int b){
        int S;
        S = a*b;
        return S;
    }
    public void printInfo(){
        System.out.println("Chu Vi: "+ chuVi(a,b));
        System.out.println("Diện tích: "+ dienTich(a,b));
    }
}
