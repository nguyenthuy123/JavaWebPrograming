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
public class StudentManager {
    private static final int MAX_STUDENT = 20;
    private Student[] listStudent;
    private int curQuantity;
    
    public StudentManager(){
        this.listStudent = new Student[20];
        this.curQuantity = 0;
    }
        public boolean add(Student std){
           if(curQuantity < MAX_STUDENT){
               this.listStudent[this.curQuantity] = std;
               this.curQuantity++; 
               return true;
           }else{
               return false;
           }
        }
        public void search(String name){
            boolean found = false;
            for(int i=0; i<listStudent.length; i++){
                Student temp = this.listStudent[i];
                if(temp == null) continue;
                if(temp.getName().equals(name)){
                    System.out.println(temp);
                    found = true;
                }               
            }
            if(!found){
                System.out.println("không tìm thấy");
            }
        }
        public void list(){
            for(Student student: listStudent){
                if(student == null) continue;
                System.out.println(student);
            }
        }
    public void list(boolean order){
        if(order){
            for(int i=0; i<this.listStudent.length - 1; i++){
                for(int j=0; j<this.listStudent.length; j++){
                    if(this.listStudent[i] == null || this.listStudent[j] == null) continue;
                    if(this.listStudent[i].getName().compareTo(this.listStudent[j].getName()) > 0){
                        Student temp = this.listStudent[i];
                        this.listStudent[i] = this.listStudent[j];
                        this.listStudent[j] = temp;
                    }
                }
            }
        }else{
           for(int i=0; i<this.listStudent.length - 1; i++){
                for(int j=0; j<this.listStudent.length; j++){
                     if(this.listStudent[i] == null || this.listStudent[j] == null) continue;
                    if(this.listStudent[i].getName().compareTo(this.listStudent[j].getName()) < 0){
                        Student temp = this.listStudent[i];
                        this.listStudent[i] = this.listStudent[j];
                        this.listStudent[j] = temp; 
                    }
                }
           }
        }
    }
}
