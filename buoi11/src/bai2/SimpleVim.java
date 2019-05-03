/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author thuynguyen
 */
public class SimpleVim {
    public static boolean TestFile(String data, String path){ 
      try {
          FileOutputStream fos = new FileOutputStream(path);
          OutputStreamWriter osw = new OutputStreamWriter(fos,"C:\\Users\\thuynguyen\\mytext.txt");
          BufferedWriter bw = new BufferedWriter(osw);
          bw.write(data);
          bw.newLine();
          bw.close();
          osw.close();
          fos.close();
          return true;
      }catch(Exception e){
          e.printStackTrace();
          return false;
      }
      
    }
}
