/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sin.x.java;

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
        int x;
        n = input.nextInt();
        x = input.nextInt();
        double tong = 0;
        int gt =1;
        for(int i=0; i<=n; i++)
        {
            gt *=(2*i+1);
            tong = tong + Math.(pow(-1,i)*(pow(x,(2*i+1))/gt));
        }
    }
    
}
