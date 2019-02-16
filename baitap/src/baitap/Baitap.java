/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author thuynguyen
 */
import java.util.Scanner;
public class Baitap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        for(int i=0; i<h; i++){ 
            for(int j=0; j<h-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                if(i==0 && i==h-1){
                    System.out.print(" * ");
                }
                else{
                    if(k==0 &&k==2*i)
                        System.out.print(" * ");
                    else 
                        System.out.print(" ");
                }                                 
            }
            System.out.println();
        }
    }
    
}
