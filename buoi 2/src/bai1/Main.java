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
    static String docHangChuc(int chuc){
        switch(chuc){
            case 1: return "Mười";
            case 2: return "Hai mươi";
            case 3: return "Ba mươi";
            case 4: return "Bốn mươi";
            case 5: return "Năm mươi";
            case 6: return "Sáu mươi";
            case 7: return "Bảy mươi";
            case 8: return "Tám mươi";
            case 9: return "Chín mươi";
            default:
                return "";
        }
    }
    static String docHangDonVi(int chuc, int donvi){
        switch(donvi){
            case 0: return"";
            case 1: return chuc==1 ? "một" : "mốt";
            case 2: return"hai";
            case 3: return"ba";
            case 4: return"bốn";
            case 5: return"năm";
            case 6: return"sáu";
            case 7: return"bảy";
            case 8: return"tám";
            case 9: return"chín";
            default:
                return "";
        }
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("So nhap vao>");
       int number = input.nextInt();
       System.out.println("cach doc so " + number + " la " + docHangChuc(number/10)+ " " + docHangDonVi(number/10, number%10));
        
        
    }
            
}
