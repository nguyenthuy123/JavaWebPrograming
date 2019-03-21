/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.demo;

/**
 *
 * @author thuynguyen
 **/
import java.awt.Choice;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  
    Product product[] = new Product[20];
    Store s = new Store(product);
    Scanner sc = new Scanner(System.in);
    int choice = 0;
    do {
            System.out.println("1. Add Product");
            System.out.println("2. List Product");
            System.out.println("3. Search ");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    s.addProduct();
                    break;
                case 2:
                    s.listProduct();
                    break;
                case 3:
                    System.out.println("Nhập name:");
                    s.search(sc.nextLine());
            }
        }while (choice != 4);
    }

}