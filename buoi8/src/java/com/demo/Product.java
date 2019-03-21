/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.demo;

/**
 *
 * @author thuynguyen
 */
import java.util.Scanner;
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    Scanner sc = new Scanner(System.in);
    public void addNew(){
        System.out.println("Nhập id:");
        id = sc.nextInt();
        System.out.println("Nhập name:");
        name = sc.nextLine();
        System.out.println("Nhập price:");
        price = sc.nextDouble();
        System.out.println("Nhập quantity:");
        quantity = sc.nextInt();
    }
    @Override
    public String toString(){
        return " "+id+" "+name+""+price+""+quantity;
    }
    public Product(){
        
    }
    public Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
