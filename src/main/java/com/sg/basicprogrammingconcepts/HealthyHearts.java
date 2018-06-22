/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.basicprogrammingconcepts;

import java.util.Scanner;

/**
 *
 * @author josesosa
 */
public class HealthyHearts {
     public static void main(String[] args) {
        int a;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("How old are you?");
        a =myScanner.nextInt();
        
        System.out.println("Your maximum heart rate should be " + (220 - a) + ".");
        System.out.println("Your target HR Zone is " + .5*(220 - a) + " to " + .85*(220 - a) + " beats per minute.");
    }
    
}
