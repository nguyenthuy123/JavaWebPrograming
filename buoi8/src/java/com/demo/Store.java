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
public class Store {
    Product[] products;
    Scanner sc = new Scanner(System.in);
    int number = 0;
    void addProduct(){
        Product p;
        System.out.println("Thêm Camera hay SmartPhone(1/0)");
        int choice = sc.nextInt();
        if(choice == 1){
            p = new Camera();
        }else{
            p = new SmartPhone();
        }
        p.addNew();
        if(number > products.length){
            System.out.println("không thêm được");
            return;
        }
        products[number] = p;
        number++;
    }
    void listProduct(){
        System.out.println("====Danh sách====");
        for(Product p: products){
            if(p == null)
                break;
            System.out.println(p);
        }     
    }
    void search(String name){
        for(Product p: products){
            if(p == null)
                break;
            if(p.getName().equals(name)){
                System.out.println(p);
                return;
            }
        }
        System.out.println("không tìm thấy");
    }

    public Store() {
    }

    public Store(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
}
