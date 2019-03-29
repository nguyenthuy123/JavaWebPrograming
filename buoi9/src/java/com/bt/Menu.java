/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.bt;

/**
 *
 * @author thuynguyen
 */
import java.util.Scanner;
public class Menu {
    private Manager manager = null;
    public Menu(Manager manager){
        this.manager = manager;
    }
    public void display(){
        int c=0;
        do{
        System.out.println("1. Add");
        System.out.println("2. Show");
        System.out.println("3. Search");
        System.out.println("4. Exit");
        System.out.println("Chose:");
        Scanner sc = new Scanner(System.in);
        c = Integer.parseInt(sc.nextLine());
        switch(c){
            case 1:
                this.manager.add();
                break;
            case 2:
                this.manager.show();
                break;
            case 3:
                System.out.println("Name:");
                String name = sc.nextLine();
                this.manager.search(name);
                break;
                 
            }
        }while(c>0&&c<4);
       
    }   
}
