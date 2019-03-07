/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.vecto;

/**
 *
 * @author thuynguyen
 */
public class Vecto {
    private int x1, y1;
    private int x2, y2;
    public Vecto(){
        
    }
    public Vecto(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public int getA1(){
        return x1;
    }
    public int getA2(){
        return y1;
    }
    public int getB1(){
        return x2;
    }
    public int getB2(){
        return y2;
    }
    public void setA1(){
        this.x1 = x1;
    }
    public void setA2(){
        this.y1 = y1;
    }
    public void setB1(){
        this.x2 = x2;
    }
    public void setB2(){
        this.y2 = y2;
    }
    public void vectoBangNhau(int x1, int y1, int x2, int y2){
        double t1 = Math.sqrt(x1*x1 + y1*y1);
        double t2 = Math.sqrt(x2*x2 + y2*y2);
        if(x1==x2 && y1==y2 && t1==t2){
            System.out.println("Hai vecto bằng nhau");                  
        }
        else{
            System.out.println("Hai vecto không bằng nhau");
        }
    }
    public void tinhCos(int x1, int y1, int x2, int y2){
        double t1 = Math.sqrt(x1*x1 + y1*y1);
        double t2 = Math.sqrt(x2*x2 + y2*y2);
        double t3 = x1*x2 + y1*y2;
        double cos = t3/(t1*t2);
        System.out.println("Cos "+" ="+cos);      
    }
    public void cungPhuong(int x1, int y1, int x2, int y2){
        for(int i=1; i<100; i++){
            if(x1==i*x2 && y1==i*y2){
                System.out.println("Hai vecto cùng phương");
            }
            else{
                System.out.println("Haiveto không cùng phương");
            }
        }
    }
    public void printInfo(){
        vectoBangNhau(x1,y1,x2,y2);
        tinhCos(x1,y1,x2,y2);
        cungPhuong(x1,y1,x2,y2);
    }
}
