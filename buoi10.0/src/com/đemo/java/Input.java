/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.đemo.java;

/**
 *
 * @author thuynguyen
 */
import java.util.Scanner;
public class Input {
    private Scanner scanner;
    
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String inputId(){
       String tempId = this.scanner.nextLine();
       try {
      // if(tempId.startsWith("HV"))throw new Exception("Phai bat dau bang HV");
       //String sub = tempId.substring(2);
       //int parseInt = Integer.parseInt(sub);
       if(!tempId.matches("HV[0-9]{3}"))
           throw new Exception("Phai bat dau bang HV va 3 so");
    }catch (Exception e){
           System.out.println("Sai dinh dang");
           System.out.println(e.getMessage());
           return this.inputId();
    }
       return tempId;
    }
    public String inputName(){
        String tempName = this.scanner.nextLine();
        try {
            if(tempName.length()<8) 
                throw new Exception("ten phai lon hon 8 ki tu");
        }catch(Exception e){
            System.out.println("Sai dinh dang");
            System.out.println("e.getMessage");
            return inputName();
        }
        return tempName;
        
    }
    public double inputMark(){
        double tempMark = Double.parseDouble(this.scanner.nextLine());
        try{
            if(tempMark<1 && tempMark>10) throw new Exception("Ban nhap khong dung");
        }catch(Exception e){
            System.out.println("Sai  dinh dang");
            System.out.println("e.getMessage");
            return inputMark();
        }
        return tempMark;
    }
}
