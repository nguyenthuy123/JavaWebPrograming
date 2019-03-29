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
public class Square extends Rect{
    private int edge;
    public int getEdge(){
        return edge;
    }
    public void setEdge(int shortEdge){
        this.edge = edge;
    }
    @Override
    public void inputEdge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh:");
        edge = sc.nextInt();
    }
    @Override
    public int areaCacul(){
        return edge*edge;
    }
    @Override
    public int groundCacul(){
        return 4*edge;
    }
    @Override
    public void showInfo(){
        System.out.println("Diện tích:" + areaCacul());
        System.out.println("Chu vi:" + groundCacul());
    }
}
