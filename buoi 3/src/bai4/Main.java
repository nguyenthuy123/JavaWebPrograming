/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author thuynguyen
 */
import java.util.Random;
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        int n = 15;
        int[] A = new int[n];
        int temp;
        int count = 0, count1=0;
        System.out.println("Mảng đã nhập: ");
        for(int i=0; i<n; i++){
            A[i] = input.nextInt(100);
            System.out.printf("%d ", A[i]);
        }
        System.out.println();
        System.out.println("Mảng sắp xếp tăng dần: ");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(A[j]<A[i]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
            System.out.printf("%d ",A[i]);
        }
        System.out.println();
        System.out.print("Mảng sắp xếp giảm dần: ");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(A[j]>A[i]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;                    
                }
            }
            System.out.printf("%d ",A[i]);
        }
        for(int i=0; i<n; i++){
            if(A[i]%2==0){
                count ++;
            }
        }
        System.out.println("Có " + count + " phần tử chẵn");
        for(int i=0; i<n; i++){
            if(A[i]%2!=0){
                count1++;
            }
        }
        System.out.println("Có " + count1 + " phần tử lẻ");
    }
}
