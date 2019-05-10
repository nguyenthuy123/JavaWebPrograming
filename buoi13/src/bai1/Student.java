/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author thuynguyen
 */
    public class Student {
    private String rollnubmber,name;
    private Date doll;
    private String email;

    public Student(){
    
    }

    public Student(String rollnubmber, String name, Date doll, String email) {
        this.rollnubmber = rollnubmber;
        this.name = name;
        this.doll = doll;
        this.email = email;
    }

    public String getRollnubmber() {
        return rollnubmber;
    }

    public void setRollnubmber(String rollnubmber) {
        this.rollnubmber = rollnubmber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDoll() {
        return doll;
    }

    public void setDoll(Date doll) {
        this.doll = doll;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap rollnumber:");
        String rollnumber = input.nextLine();
        System.out.println("Nhap name:");
        name = input.nextLine();
        System.out.println("Nhap date:");
        String doll = input.nextLine();
        System.out.println("Nhap email:");
        email = input.nextLine();
    }
    public boolean equal(Object obj){
        if(this==obj){
            return true;
        }
        if(this!=obj){
            return false;
        }
        if(getClass()!=obj.getClass()){
            return false;
        }
        final Student other = (Student)obj;
        if(this.name != other.name){
            return false;
        }
        return false;
    }
    @Override
    public String toString(){
     String rollnumber = null;
     return "Student{" + "rollnumber=" +rollnumber+ "name=" +name+ "dob=" +doll+ "email=" +email+ '}';   
    }
}
    
        


