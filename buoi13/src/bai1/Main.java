/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import java.util.Scanner;
/**
 *
 * @author thuynguyen
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        
        while(true){
            System.out.println("a.Thêm mới");
            System.out.println("b.Tìm kiếm theo tên");
            System.out.println("c.Cập nhật");
            System.out.println("d.Xóa");
            System.out.println("e.Lưu vào file");
            System.out.println("f.Đọc dữ liệu vào file");
            int c = Integer.parseInt(input.nextLine());
                          
            switch (c){
                case 1:
                    System.out.println("File path:");
                    String path = input.nextLine();
                    if(manager.load(path)){
                        System.out.println("Successful");
                    }else{
                         System.out.println("Error");
                    }  
                    break;
                case 2:
                    manager.add();
                    break;
                case 3:
                    if(manager.save()){
                        System.out.println("Successful");
                    }else{
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    System.out.println("Name>");
                    String name = input.nextLine();
                    Student st = manager.search(name);
                    if(st!=null){
                        System.out.println("st");
                    }else{
                        System.out.println("Not found");
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not valid");
            }
        }
    }
}
        

