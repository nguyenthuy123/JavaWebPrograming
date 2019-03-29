/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.com.bt;

/**
 *
 * @author thuynguyen
 */
public class Employee extends Person {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }
    

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap salary:");
        salary = sc.nextDouble();
    }
    @Override
    public String toString(){
        return super.toString()+"salary="+salary;
    }
}
