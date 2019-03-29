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
public class Parallelogram extends Polyon {
    private int edge1, edge2, highLine;

    public Parallelogram() {
    }

    public Parallelogram(int edge1, int edge2, int highLine) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.highLine = highLine;
    }

    public int getEdge1() {
        return edge1;
    }

    public void setEdge1(int edge1) {
        this.edge1 = edge1;
    }

    public int getEdge2() {
        return edge2;
    }

    public void setEdge2(int edge2) {
        this.edge2 = edge2;
    }

    public int getHighLine() {
        return highLine;
    }

    public void setHighLine(int highLine) {
        this.highLine = highLine;
    }
    @Override
    public void inputEdge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh:");
        edge1 = sc.nextInt();
        edge2 = sc.nextInt();
        highLine = sc.nextInt();
    }
    @Override
    public int groundCacul(){
        return 2*(this.edge1 + this.edge2);
    }
    @Override
    public int areaCacul(){
        return (this.edge2 * this.highLine);
    }
    @Override
    public void showInfo(){
        System.out.println("Kết quả:");
        System.out.println("Diện tích:"+this.areaCacul());
        System.out.println("Chu vi:"+this.groundCacul());
    }
    
}
