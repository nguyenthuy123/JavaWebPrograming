/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TGcan.java;

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
        int h = input.nextInt();
        for(int i=0; i<h; i++){            
            for(int j=0; j<=h-i-1; j++){
               System.out.print(" ");
             }  
            for(int k=i+1; k<=2*h-1; k++){
             System.out.print(" * ");
            }       
         System.out.println();   
        }
    }
}
    
