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
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.add(new Student("Anh","anhact@gmail.com",18));
        manager.add(new Student("Bình","binhact@gmail.com", 19));
        manager.add(new Student("Hoàng","hoangact@gmail.com",20));
        Scanner sc = new Scanner(System.in);
        int choice ;
        do{
            System.out.println("---Student Manager---");
            System.out.println("1.  List");
            System.out.println("2.  Search");
            System.out.println("3.  Add");
            System.out.println("4.  Exit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
             
            switch(choice){
                case 1:
                    System.out.println("Choice: " +choice);
                    System.out.println("Order(Y/N):N");
                    System.out.println("+=====+=================+=======+");
                    System.out.println("|NAME | EMAIL           | AGE   |");
                    System.out.println("|ANH | ANH@GMAIL.COM   | 10    |");
                    System.out.println("+-----+-----------------+-------+"); 
                    break;
                case 2:
                    System.out.println("Choice: " +choice);  
                    System.out.println("NAME: ANH");
                    System.out.println("+=====+=================+=======+");
                    System.out.println("|NAME | EMAIL           | AGE   |");
                    System.out.println("|ANH | ANH@GMAIL.COM   | 10    |");
                    System.out.println("+-----+-----------------+-------+"); 
                    break;
                case 3:
                    System.out.println("Choice: " +choice);    
                    System.out.println("NAME: NEW STUDENT");
                    System.out.println("+=====+=================+=======+");
                    System.out.println("|NAME | EMAIL           | AGE   |");
                    System.out.println("|ANH | ANH@GMAIL.COM   | 10    |");
                    System.out.println("+-----+-----------------+-------+"); 
                    break;
            }
            
        }while(choice != 4);
    }
}
