/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.demo;

/**
 *
 * @author thuynguyen
 */
public class Main {
    public static void main(String[] args) {
        try {
            MyDate d = new MyDate(1, 1, 2019);
            d.addDay(66);
             d.print(0);
    }catch (Exception ex){
        ex.printStackTrace();
        }
    }
}
