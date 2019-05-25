/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com;
import java.util.Scanner;


/**
 *
 * @author thuynguyen
 */
public class Main {
    public static void main(String[] args) throws Exception {
        DBConection dbconection = new DBConection();
        dbconection.getConnect();
        Check c = new Check();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        String name = sc.nextLine();
        System.out.println("Nhap ngay muon: ");
        String date = sc.nextLine();
        
        c.showData(c.ex3());
        c.showData(c.ex6(name, date));
    }
}
