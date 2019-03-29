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
public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public MyDate(int day, int month, int year) throws Exception{
        if(day < 0 || day > 31){
            throw new Exception("Lỗi nhập ngày không hợp lệ");
        }
        if(month < 0 || month  > 12){
            throw new Exception("Lõi nhập tháng không hợp lệ");
        }
        if(year < 0){
            throw new Exception("Lỗi nhập năm không hợp lệ");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day) throws Exception{
        if(day < 0 || day > 31){
            throw new Exception("Lỗi nhập ngày không hợp lệ");
        }
        this.day = day;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(int month) throws Exception{
        if(month < 0  || month > 12){
            throw new Exception("Lỗi nhập tháng không hợp lệ");
        }
        this.month = month;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year) throws Exception{
        if(year < 0){
            throw new Exception("Lỗi nhập năm không hợp lệ");
        }
        this.year = year;
    }
    public void addYear(int year){
        this.year += year;
    }
    public void addMonth(int month){
        this.month += month;
        if(this.month > 12){
            int years = this.month % 12;
            this.addYear(years);
            this.month = this.month/12;
        }
    }
    public void addDay(int day ){
        this.day += day;
        switch(this.month){
            case 2:
                if(this.isLeapYear()){
                    if(this.day >=29){
                        this.addMonth(1);
                        int diff = this.day - 29;
                        this.day = 0;
                        this.addDay(diff);
                    }
                }else{
                    if(this.day >=28){
                        this.addMonth(1);
                        int diff = this.day - 28;
                        this.day = 0;
                        this.addDay(diff);
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
                if(this.day > 31){
                    this.addMonth(1);
                    int diff = this.day - 31;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 12:
                if(this.day >30){
                    this.addMonth(1);
                    int diff = this.day - 31;
                    this.day = 0;
                    this.addDay(diff);
                }
                break;
        }
    }
    
    public boolean isLeapYear(){
       if(year %4 ==0){
           if(year %100 ==0){
               if(year %400 ==0){
                   return true;
               }else{
                   return false;
               }
           }
           else{
               return true;
                }
       }
        else{
                return false;
                }
           }
    public void print(int type){
        if(type == 0){
            System.out.printf("%d/%d/%d",this.day,this.month,this.year);
        }else{
            System.out.printf("Ngày %d tháng %d năm %d",this.day,this.month,this.year);
        }
    }
}
