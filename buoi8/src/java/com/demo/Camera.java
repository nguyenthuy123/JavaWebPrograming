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
public class Camera extends Product {
    boolean hasWifi;
    
    @Override
    public void addNew(){
        int choice = sc.nextInt();
        System.out.println("Có Wifi hay không(1/0");
        if(choice == 1){
            hasWifi = true;
        }else{
            hasWifi = false;
        }
    }
    @Override
    public String toString(){
        return super.toString()+",hasWifi = "+hasWifi;
    }
    public Camera(){
        super();
    }
    public Camera(boolean hasWifi, int id, String name, double price, int quantity){
        super(id,name,price,quantity);
        this.hasWifi = hasWifi;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
}
