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
public class Main {
    public static void main(String[] args) {
        System.out.println("Student? Employee? (S/E)");
        String c = new Scanner(System.in).nextLine();
        Manager instance = null;
        if(c.toUpperCase().equals("S")){
            instance = new StudentManager();
        }else if(c.toUpperCase().equals("E"));
        else{
            System.out.println("Not valid");
        }
    if(instance != null){
        Menu menu = new Menu(instance);
        menu.display();
        }
    }
}