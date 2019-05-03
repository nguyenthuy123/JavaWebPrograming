/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author thuynguyen
 */

public class Main {
    public static void main(String[] args) {
        String data = new String();
        data = "text";
        boolean kq = SimpleVim.TestFile(data, "C:\\Users\\thuynguyen\\mytext.txt");
        if(kq == true){
            System.out.println("Lưu file thành công");
        }else{
            System.out.println("File không được lưu");
        }
    }
}
