/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author thuynguyen
 */
public class Main {
    public static void main(String[] args) {
         FileUtil file = new FileUtil();
        file.folder("C:\\Users\\thuynguyen\\mytext.txt");
        file.file("C:\\Users\\thuynguyen\\mytext.txt");
        file.filePicture("C:\\Users\\thuynguyen\\mytext.txt");
        file.fileWid("ext", "C:\\Users\\thuynguyen\\mytext.txt");
        file.fileSize(300858);
    }
}
