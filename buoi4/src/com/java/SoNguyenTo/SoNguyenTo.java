/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.SoNguyenTo;

/**
 *
 * @author thuynguyen
 */
public class SoNguyenTo {
    private int a;
    public SoNguyenTo(){       
    }       
    public SoNguyenTo(int x){
       for(int i=2; i<x; i++){                            
           if(x%i!=0){
              x = a; 
           }
           else{
               System.out.println("x không là số nguyên tố");
           }
       }
    }
    public boolean isSoNguyenTo(int x){
        for(int i=2; i<x; i++){
           if(x%i!=0){
               System.out.println("true");
           }
           else{
                System.out.println("false");   
                   }
        }
        
    }
    public int getA(){
        return a;
    }
    public void get(){
        this.a=a;
    }
    
    
}
