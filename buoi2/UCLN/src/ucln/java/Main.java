/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucln.java;

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
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        int k = a*b;
        while(b!=0)
        {
            int tg = b;
            b = a%b;
            a = tg;
        }
        System.out.println("UCLN = "+a);
        System.out.println("BCNN = "+k/a);
    }
    
}
