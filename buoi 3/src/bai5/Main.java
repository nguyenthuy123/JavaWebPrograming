/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

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
        Scanner input = new Scanner(System.in);
        int n = 3;
        int ax=input.nextInt();
        int ay=input.nextInt();
        int az=input.nextInt();
        int bx=input.nextInt();
        int by=input.nextInt();
        int bz=input.nextInt();
        int tong1=ax+bx;
        int tong2=ay+by;
        int tong3=az+bz;
        System.out.printf("(%d, %d, %d)",tong1,tong2,tong3);
    }
}
