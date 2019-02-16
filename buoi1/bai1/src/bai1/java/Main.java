/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.java;

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
        int a;
        int temp;
        a = input.nextInt();
       int dem =0 ;
       while(a!=0){
         temp = a%10;
         temp = a/10;
          dem++;
       }     
       System.out.print("hangChuc(a),donvi(a)");
        
    }
   
    public static String donvi(int n){
        switch (n){
            case 0:return "Không";      
            case 1: return "Một";
            case 2: return "Hai";
            case 3: return "Ba";
            case 4: return "Bốn";
            case 5: return "Năm";
            case 6: return "Sáu";
            case 7: return "Bảy";
            case 8: return "Tám";
            default: return "Chin";
        }
    }
    public static String hangChuc(int n){
        switch (n){
            case 0: return "Linh";
            case 1: return "Mười";
            case 2: return "Hai Mươi";
            case 3: return "Ba Mươi";
            case 4: return "Bốn Mươi";
            case 5: return "Năm Mươi";
            case 6: return "Sáu Mươi";
            case 7: return "Bảy Mươi";
            case 8: return "Tám Mươi";
            default: return "Chín Mươi";
        }
   }  
    
}
