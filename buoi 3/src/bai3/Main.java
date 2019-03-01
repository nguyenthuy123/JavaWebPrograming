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
        int n = 5;
        int a;
        a = input.nextInt();
        int[] A = new int[n];
        for(int i=0; i<n; i++){           
            A[i] = input.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a==A[i]){
                System.out.println("Vị trí của a: "+i);
            }                     
                
        }
    }
}
