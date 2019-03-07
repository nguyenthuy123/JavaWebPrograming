/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phanso;

/**
 *
 * @author thuynguyen
 */
public class Main {
    public static void main(String[] args) {
        PhanSo ph = new PhanSo(7, 4);
        PhanSo ph1=new PhanSo(3,8);
        ph.printInfo();
        ph.phepToan(7, 4, 3, 8);
    }
}
