/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author thuynguyen
 */
import java.util.Scanner;
public class Dathuc {

    int a[];
    int b[];
    int n;
    int m;
    Scanner sc = new Scanner(System.in);
    public Dathuc(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n];
        this.b = new int[m];
    }
    
    public void nhapHeSo() {
        
        for (int i = 0; i < a.length; i++) {        
            System.out.printf("a[%d] = ",i);
            a[i] = sc.nextInt();
            System.out.println("");
            System.out.printf("a[%d]*x^[%d] +", i,i);         
        }
        for(int j = 0; j <b.length; j++){
             System.out.printf("b[%d] = ",j);
            b[j] = sc.nextInt();
            System.out.println("");
            System.out.printf("b[%d]*x^[%d] +", j,j);   
        }
    }
    public void daoSo1(int a[], int n){
        for(int i=n; i>0; i--){
            System.out.printf("%d",a[i]);
        }
    }
    public void daoSo2(int b[], int m){
        for(int j=m; j>0; j--){
            System.out.printf("%d",b[j]);
        }
    }
    public void tich(int a[],int b[], int c[]){
        int t = n + m - 1;
        for(int i=0; i<t; i++){
            for(int j=i; j>=0; j--){
                c[i] += a[j] * b[j-i];
            }
        }
    }
    public void printInfo(){
        System.out.println("Tích = "+tich(a,b,c));
    }
}
