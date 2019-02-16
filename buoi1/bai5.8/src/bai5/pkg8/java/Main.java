/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg8.java;

/**
 *
 * @author thuynguyen
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int tong = 0;
        int gt = 1;
        for(int i=1; i<=n; i++)
        {
            gt *= i;
            tong += gt;
        }
        System.out.println("S = "+tong);
    }
    
}
