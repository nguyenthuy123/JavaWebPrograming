/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4.b;

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
        System.out.print("h = ");
        int h = input.nextInt();
        
        for (int i = 0; i < h; i++) {
            // in khoảng trắng
            for (int k = 0; k < h - i - 1; k++) {
                System.out.print(" ");
            }
            // in dấu *
            for (int j = 0; j < 2*i+1; j++) {
                // nếu là dòng đầu tiên hoac dòng cuối cùng
                if ( i == 0 || i == (h-1) ) {
                    System.out.print("*");
                // nếu không 
                } else {
                    // --- nếu là vị trí đầu tiên hoặc vị trí cuối cùng thì
                    if (j == 0 || j == (2*i) ) {
                    // ---   in ra dấu *
                        System.out.print("*");
                    }// --- nếu không
                    else {
                    // ---   in ra khoảng trắng
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
