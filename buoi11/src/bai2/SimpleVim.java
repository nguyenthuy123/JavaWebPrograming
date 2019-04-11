/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author thuynguyen
 */
public class SimpleVim {
    public void CreatFile(String link){
       // Tạo file
       File f = new File(link);
       //ghi file và lưu file
       if(f.exists()){
           if(f.isFile()){
             try{
                FileWriter fw = new FileWriter(link);
                fw.write("text");
                fw.close();
           }catch(Exception e){
               System.out.println("e");
                }
            }else{
               File[] listFiles = f.listFiles();
               for(int i=0; i<listFiles.length; i++){
                   System.out.println(listFiles[i].getName());
               }
           }
       
        }else{
           return;
       }
    }
}
