/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gptbac2.java;

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
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double x;
        double delta;
        double x1, x2, x3;
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trih vo so nghiem");}
                else{
                    System.out.println("Phuong trinh vo nghiem");}
                    
                   }
            else{           
               x = -(c/b);
               System.out.println("Phuong trinh co mot nghiem:");
               System.out.println("x = " +x);
                }
        }
        else{                                      
          delta = b*b - 4*a*c;
          if(delta > 0){
               x1 = (-b + Math.sqrt(delta))/2;
               x2 = (-b - Math.sqrt(delta))/2;
               System.out.println("Phuong trinh co hai nghiem phan biet:" );
               System.out.println("x1 = " +x1);
               System.out.println("x2 = " +x2);
          }
          else if(delta == 0){
              x3 = (-b + Math.sqrt(delta))/(2*a);
              System.out.println("Phuongn trinh co nghiem kep:");
              System.out.println("x = "+x3);             
          }
          else
              System.out.println("Phuong trinh vo nghiem");
               
          }
              
            
     }
    
    
}
