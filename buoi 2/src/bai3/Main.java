/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

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
        int a = 3000000;
        for(int i=0; i<30; i++){
            for(int j=0; j<15; j++){
                for(int k=0; k<6; k++){
                    if(a == 100000*i + 200000*j + 500000*k )
                        System.out.println("x =  " +i+ "  y = "+ j +"  z = " + k);
                }
            }
        }
            
    }
}
