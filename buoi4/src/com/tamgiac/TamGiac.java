/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tamgiac;

/**
 *
 * @author thuynguyen
 */
public class TamGiac {

    private double a, b, c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void kiemTra() {
        if (a == b) {
            if (b == c || a == c) {
                System.out.println("Tam giác đều");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Tam giác vuông cân");
            } else {
                System.out.println("Tam giác cân");
            }
        } else {
            System.out.println("Tam giác thường");
        }
    }

    public double chuVi(double a, double b, double c) {
        double C = 0;
        C = a+b+c;      
        return C;
    }
    public double dienTich(double a, double b, double c){
        double S = 1;
       double p =  chuVi(a,b,c);
       double p1 = p/2;
       S=Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
       return S;
    }
    public void printInfo(){
        System.out.println("Chu vi: "+chuVi(a,b,c));
        System.out.println("Diện tích: "+dienTich(a,b,c));
    }

}
