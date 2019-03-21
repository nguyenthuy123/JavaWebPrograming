/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author thuynguyen
 */
public class MyDate {
    int d, m, y;
    
    public MyDate(int d, int m, int y){
        this.d = d;
        this.m = m;
        this.y = y;
    }
    public boolean NamNhuan(int y){
        if(y%400==0 || (y%4==0 && y%100!=0)){
            return true;
        }
        else{
            return false;
        }
    }
    public int  KiemTra2(int d, int m, int y){
        if(NamNhuan(y)){
            if(d>0 && d<=28 && m==2){
                return 1;
            }
            else{
                 if(d>0 && d<=29 && m==2){
                     return 1;
                 }else{
                     return 0;
                 }              
            }
                    }
        else{
            return 0;
        }
    }
    public int KiemTra(int d, int m, int y){
        if(m==1 || m==3 || m==5 || m==7 || m==8 ||m==10 ||m==12){
            if(d>0 && d<=31){
                return 1;              
            }
            else{
                return 0;
            }
        }
        else{
            if(m==4 || m==6 || m==9 || m==11){
                if(d>0 && d<30){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        }
        return 0;
    }
   
    public void printInfo(){
        if(KiemTra(d,m,y)==1){
            System.out.printf("%d/%d/%d", d,m,y);
            System.out.println("");
        }else{
            System.out.println("Ngày tháng không hợp lệ");
        }
        if(KiemTra2(d,m,y)==1){
            System.out.printf("%d/%d/%d", d,m,y);
            System.out.println("");
        }else{
            System.out.println("Ngày tháng không hợp lệ");
        }
        
    }
}
