/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.File;

/**
 *
 * @author thuynguyen
 */
public class FileUtil {
    
    public void folder(String link) {
        File f = new File(link);
        //1. Kiểm tra tồn tại
        if (f.exists()) {
            if (f.isFile()) {
                return;
            } else {
                File[] listFile = f.listFiles();
                for (int i = 0; i < listFile.length; i++) {
                    if (listFile[i].isFile()) {

                    } else {
                        System.out.println("Folder" + listFile[i].getName());
                    }
                }
            }
        }

        //1.1 Nếu tồn tại
        //1.1.1 Kiểm tra file  hay thu mục
        //1.2 nếu la thư mục lấy danh sách file
        //1.3 Duyệt mảng , kiểm tra phần tử nếu là thư mục lấy ra thư mục
    }

    public void file(String link) {
        File f = new File(link);
        if(!f.exists()){
            return;
        }else{
            if(f.isFile()){
                System.out.println("File"+f.getName());
            }else{
               
            }
        }
    }
    public void filePicture(String link){
        File f = new File(link);
        if(f.exists()){
            if(f.getName().endsWith(".png,.pjg,.jpeg")){
                System.out.println("FilePicture:"+f);
            }else{
                
            }
            return;
        }
    }
    public void fileWid(String ext, String path ){
        File f = new File(path);
        if(f.exists()){
            if(f.isFile()){
                if(f.getName().endsWith(".ext")){
                    System.out.println("File"+f);
                }
            }
        }
            
        }
    public void fileSize(double type){
        File f = new File("C:\\Users\\thuynguyen\\mytext.txt");
        if(f.exists()){
            double b = f.length();
            double Kb = b/1024;
            double Mb = Kb/1024;
            
            System.out.println("Mb:"+Mb);
            System.out.println("Kb:"+Kb);
        }
    }

}
