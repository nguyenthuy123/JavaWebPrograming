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
public class Employeemanager extends Manager {
    private Person[] listPerson;
    int i = 0;
    @Override
    public void add() {
        for(i=0; i<listPerson.length; i++){
            listPerson[i].input();
        }
    }

    @Override
    public void show() {
        for(i=0; i<listPerson.length; i++ ){
            System.out.println(" "+listPerson[i]);
        }
    }

    @Override
    public void search(String name) {
        for(i=0; i<listPerson.length; i++ ){
            if(listPerson[i].getName().equals(name)){
                System.out.println("Da tim thay");
            }else{
                System.out.println("Khong tim thay");
            }
        }
    }
    
}
