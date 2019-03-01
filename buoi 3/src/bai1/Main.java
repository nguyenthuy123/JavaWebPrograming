/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

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
        int[] A = new int[n];
        int tong = 0;
        for(int i=0; i<n; i++){ 
            System.out.print("Nhập phần tử thứ " + i +": ");
           A[i] = input.nextInt();
        }
        for(int i=0; i<n; i++){
            tong = tong + A[i];
            System.out.println(" Tổng là: " + tong);
        }
        for(int i=0; i<n; i++){
            if(A[i]%2!=0){
                tong = tong + A[i];
                System.out.println("Tổng số lẻ: " + tong);
            }
            else{
                System.out.println("Tổng số chẵn: " + tong);
            }
        }
    }
}
