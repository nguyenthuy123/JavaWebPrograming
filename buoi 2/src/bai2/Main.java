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
    static String docHangTram(int tram){
        switch(tram){
            case 1: return "Một trăm";
            case 2: return "Hai trăm";
            case 3: return "Ba trăm";
            case 4: return "Bốn trăm";
            case 5: return "Năm trăm";
            case 6: return "Sáu trăm";
            case 7: return "Bảy trăm";
            case 8: return "Tám trăm";
            case 9: return "Chín trăm";
            default:
                return "";
        }
    }
    static String docHangChuc(int chuc){
       switch(chuc){ 
           case 0: return "linh";
           case 1: return "mười";
           case 2: return "hai";
           case 3: return "ba";
           case 4: return "bốn";
           case 5: return "năm";
           case 6: return "sáu";
           case 7: return "bảy";
           case 8: return "tám";
           case 9: return "chín";
           default:
               return "";
       }
    }
    static String docHangDonVi(int chuc, int donvi){
        switch(donvi){
             case 0: return "";
             case 1: return chuc==0 ? "một": "mốt";
             case 2: return "hai";
             case 3: return "ba";
             case 4: return "bốn";
             case 5: return "năm";
             case 6: return "sáu";
             case 7: return "bảy";
             case 8: return "tám";
             case 9: return "chín";
             default:
                 return "";
        } 
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("nhap so>");
       int number = input.nextInt();
       System.out.println("cach doc so " + number + " la " + docHangTram(number/100) + "  " + docHangChuc((number/10)%10) + docHangDonVi((number/10)%10,(number%100)%10));
       
    }
}
