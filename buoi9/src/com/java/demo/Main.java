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
public class Main {
    public static void menu(){
        System.out.println("---Menu---");
        System.out.println("Hình bình hành");
        System.out.println("Hình chữ nhật");
        System.out.println("Hình vuông");
        System.out.println("Thoát");
        System.out.println("Chọn:");
    }
    public static void run(){
        Scanner sc = new Scanner(System.in);
        Polyon shape = new Rect();
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                shape = new Parallelogram();
                break;
            case 2:
                shape = new Rect();
                break;
            case 3:
                shape = new Square();
                break;
            case 4:
                System.exit(0);
            default:
                run();              
        }
        shape.inputEdge();
        shape.showInfo();
    }
    public static void main(String[] args) {
        run();
    }
}
