/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author thuynguyen
 */
public class StudentManager {
    String path = "mytext.txt";
    private List<Student> list;
    
    public StudentManager(){
        this.list = new ArrayList<>();
    }
    public void add(){
        Scanner input = new Scanner(System.in);
        Student st = new Student();
        this.list.add(st);
    }
    public boolean save(){
        try{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(this.list);
        oos.flush();
        oos.close();
        }catch(Exception e){
            e.printStackTrace();
            return false;           
        }
        return true;
    }
    public boolean load(String file){
        try{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        List<Student> std = (List<Student>)ois.readObject();
        this.list = std;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public Student search(String name){
        for(Student sd: list){
            if(sd.getName() == name){
                return sd;
            }
        }
        return null;
    }
}


