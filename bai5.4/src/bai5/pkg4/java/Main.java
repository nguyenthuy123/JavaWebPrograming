/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg4.java;

/**
 *
 * @author thuynguyen
 */
import  java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int n; 
        n = input.nextInt();
        double tong = 0;
        for(int i = 1; i <= n; i++){
             tong +=(double) 1/(2*i);
        }
        System.out.println("S = " +tong);
    }
    
}
