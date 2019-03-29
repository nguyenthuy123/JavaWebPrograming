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
import java.util.Scanner;
public class Rect extends Parallelogram {
    private int shortEdge, longEdge;
    public int getShortEdge(){
        return shortEdge;
    }
    public void setShortEdge(int edge1, int highLine){
        this.shortEdge = shortEdge;
        this.shortEdge = highLine;
    }
    public int getLongEdge(){
        return longEdge;
    }
    public void setLongEdge(int edge2){
        this.longEdge = longEdge;
    }
    @Override
    public void inputEdge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        shortEdge = sc.nextInt();
        System.out.println("Nhập chiều dài:");
        longEdge = sc.nextInt();
    }
    @Override
    public int areaCacul(){
        return shortEdge * longEdge;
    }
    @Override
    public int groundCacul(){
        return 2*(shortEdge + longEdge);
    }
    @Override
    public void showInfo(){
        System.out.println("Diện tích: " + areaCacul());
        System.out.println("Chu vi: " + groundCacul());
        
    }
}