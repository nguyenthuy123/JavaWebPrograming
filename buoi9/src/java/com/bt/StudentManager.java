/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.bt;

/**
 *
 * @author thuynguyen
 */
import java.util.Scanner;
public class StudentManager extends Manager {
   private Student[] listStudent;
   
   int number=0;
  
    @Override
    public void add() {
       for(number = 0; number<listStudent.length; number++){
           listStudent[number].input();
       }
        
    }

    @Override
    public void show() {
        for(int number=0; number < listStudent.length; number++){
            System.out.println(" "+ listStudent[number]);
        }
                
    }

    @Override
    public void search(String name) {
        for(int number=0; number < listStudent.length; number++){
            if(listStudent[number].getName().equals(name)){
                System.out.println("Da tim thay");
            }else{
                System.out.println("Khong tim thay");
            }
        }
    }
} 