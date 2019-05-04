/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;
/**
 *
 * @author thuynguyen
 */
public class Main {
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1.Load task");
        System.out.println("2.Add");
        System.out.println("3.Show all");
    }
    public static void main(String[] args) {
        String filePath = "C:\\Users\\thuynguyen\\Desktop\\mytext.txt";
        TaskManager myMan = new TaskManager(filePath);
        menu();
        while(true){
            int option = new Scanner(System.in).nextInt();
            switch(option){
                case 1:
                    myMan.loadTask();
                    break;
                case 2:
                    myMan.add(filePath);
                    break;
                case 3:
                    myMan.showAll(filePath);
                    break;
            }
        }
    }
}
