/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyen.java;

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
        int n;
       do{
        n = input.nextInt();       
        }  while(n!=0);
        int max = 0 ;
        int min  = 0;
         if(n>max){
             System.out.println("Max = "+n);           
         }
         if(n<min){
             System.out.println("Min = "+n);
         }
    }
    
}
