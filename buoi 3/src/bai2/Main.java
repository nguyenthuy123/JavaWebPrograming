/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

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
        int temp = 0;
        System.out.println("Nhập mảng: ");
        for(int i=0; i<n; i++){
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = input.nextInt();
        }
        int max = A[0];
        int min = A[0];
        for(int i=0; i<n; i++){
            if(max>A[i]){
                max = A[i];                      
            }      
        }
         System.out.println("Phần tử lớn nhất trong mảng: " + max);  
        for(int i=0; i<n; i++){
            if(min<A[i]){
                min = A[i];             
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);  
        //System.out.print(" phần tử chia hết cho 3: ");
        for(int i=0; i<n; i++){
            if(A[i]%3==0){ 
                //System.out.print(" " + A[i]);
                temp = A[i];
            }            
        }
         System.out.print(" phần tử chia hết cho 3: " + temp);
        
    }
}
