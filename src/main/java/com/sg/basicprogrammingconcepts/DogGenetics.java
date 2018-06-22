/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.basicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author josesosa
 */
public class DogGenetics {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random myRandomizer = new Random();
        
        String dogName = "none";
        String[] dogBreeds = {
        "Japanese Chin",
        "Otterhound",
        "Sussex Spaniel",
        "English Foxhound",
        "Saluki"
        };
        int a = myRandomizer.nextInt(101);
        int b = myRandomizer.nextInt(101-a);
        int c = myRandomizer.nextInt(101-a-b);
        int d = myRandomizer.nextInt(101-a-b-c);
        int e = 100-a-b-c-d;
        
        int[] randomPercentages = {a, b, c, d, e};
       
        System.out.println("What is your dog name?");
        dogName = myScanner.nextLine();
        
        for (int i=0; i<5;i++){
            System.out.println(dogName + " is " + randomPercentages[i] + "% " + dogBreeds[i] + ".");
        
        }
        
    }
    
}
