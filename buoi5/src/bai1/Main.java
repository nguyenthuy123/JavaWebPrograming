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
        switch (chuc){
            case 1: return "Muoi";
            case 2: return "Hai";
            case 3: return "Ba";
            case 4: return "Bon";
            case 5: return "Nam";
            case 6: return "Sau";
            case 7: return "Bay";
            case 8: return "Tam";
            case 9: return "Chin";
            default:
                return "";
        }
       }
        static String docHangDonVi(int chuc, int donvi){
            switch (donvi){
                case 0: return chuc==1 ? "" : " muoi";
                case 1: return chuc==1 ? "mot" :  "mươi mốt";
                case 2: return chuc==1 ? "hai" : "mươi hai";
                case 3: return chuc==1 ? "ba" : "mươi ba";
                case 4: return chuc==1 ? "bốn" : "mươi bốn";
                case 5: return chuc==1 ? "năm" : "mươi năm";
                case 6: return chuc==1 ? "sáu" : "mươi sáu";
                case 7: return chuc==1 ? "bảy" : "mươi bảy";
                case 8: return chuc==1 ? "tám" : "mươi tám";
                case 9: return chuc==1 ? "chín": "mươi chín";
                default:
                    return"";
            }
        }
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        System.out.println("nhap 1 so>");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        System.out.println("cách đọc của số " + number "là" + docHangChuc(number/10) + " " + docHangDonVi(number/10,number%10));
    }
}
