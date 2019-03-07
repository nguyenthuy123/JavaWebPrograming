v/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

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
        int[][] matrix = new int[3][3];   
        int[] matrix1 = new int[3];  
        System.out.println("Nhập ma trận:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){            
                matrix[i][j] = input.nextInt();            
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){            
               System.out.println(matrix[i][j]);   
            }
        }
        int tong = 0;
        for(int i=0; i<3; i++){         
           tong = tong + matrix[i];
           System.out.println("Tổng hàng: " + tong);                  
        }
        int tong1 = 0;
        for(int j=0; j<3; j++) {         
            tong1 = tong1 + matrix[j];
            System.out.println("Tổng cột: " + tong1);
        }         
        
    }
}
