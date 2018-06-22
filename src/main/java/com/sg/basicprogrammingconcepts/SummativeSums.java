/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.basicprogrammingconcepts;

/**
 *
 * @author josesosa
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] test1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] test2 = { 999, -60, -77, 14, 160, 301 };
        int[] test3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99 };
       
        System.out.println("Sum of Array test1 is: " + addIndices(test1));
        System.out.println("Sum of Array test2 is: " + addIndices(test2));
        System.out.println("Sum of Array test3 is: " + addIndices(test3));
        
    }
    
    public static int addIndices(int[] arr){
        int a = 0;
        
        for (int i =0; i < arr.length; i++){
            a += arr[i];
        }
        return a;
    }
    
}
