/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;

/**
 *
 * @author thuynguyen
 */
public class Task {

   private int id;
   private String title;
   private String content;
   private boolean done;
   public Scanner myScan = new Scanner(System.in);
   
   public Task(){
       
   }

    public Task(int id, String title, String content, boolean done) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done= done;
    }
    
    public void inputTask(){
        System.out.println("Nhap id>");
        id = Integer.parseInt(myScan.nextLine());
        this.setId(id);
        System.out.println("Nhap title>");
        title = myScan.nextLine();
        this.setTitle(title);
        System.out.println("Nhap content>");
        content = myScan.nextLine();
        this.setContent(content);
        System.out.println("Done?!!! 1:true 0:false");
        int done = Integer.parseInt(myScan.nextLine());
        this.setDone(done==1?true:false);
         
    }
    @Override
    public String toString(){
        return this.id+"|"+this.title+"|"+this.content+"|"+this.done;
    }
    
}
