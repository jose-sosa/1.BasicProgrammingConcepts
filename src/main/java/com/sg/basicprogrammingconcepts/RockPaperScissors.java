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
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int numberOfRounds;
        int currentRound=1;
        boolean invalidResponse = false;
        int playerSelection;
        int compSelection;
        int winCounter = 0;
        int lossCounter=0;
        int tieCounter=0;
        String roundResult;
        String playAgainResponse = "y";
        boolean playAgain = false;
        
        
        System.out.println("Hello Human, you are brave to challenge me to a game of RPS \n These are the rules:");
        System.out.println("");
        System.out.println("First, you wil choose how many rounds you wish to play (1-10).");
        System.out.println("An invalid response here will results in an error message and I will exit the program.");
        System.out.println("");
        System.out.println("Then you will choose Rock, paper or scissors.");
        System.out.println(" 1 for Rock");
        System.out.println(" 2 for Paper");
        System.out.println(" 3 for Scissors");
        System.out.println("");
        System.out.println("Afterwards I will randomly choose Rock, Paper or Scissors.");
        System.out.println("");
        System.out.println("I will record the results. Print the match statistics and proceed.");
        System.out.println("");
        System.out.println("When the rounds are up I will let you know how you did.");
        System.out.println("You will have the option to play again or end our session.");
        System.out.println("");
        System.out.println("");
        
        do{ 
            System.out.println("How many rounds will you like to play? (1-10)");
            numberOfRounds = Integer.parseInt(myScanner.nextLine());
            if (numberOfRounds > 10 || numberOfRounds<1){ //Invalid response, not playing the game
                System.out.println("You've entered an invalid response. Goodbye!");
                System.out.println("");
                System.out.println("");
                

            } else { // Valid Response, playing the game
                while(currentRound < numberOfRounds +1 ){
                    
                    System.out.println("What is your selection?");
                    System.out.println(" 1 for Rock");
                    System.out.println(" 2 for Paper");
                    System.out.println(" 3 for Scissors");
                    playerSelection = Integer.parseInt(myScanner.nextLine());
                    compSelection = randomlyChosenRPS();
                    
                    if (playerSelection == 1 || playerSelection == 2 || playerSelection == 3){
                        
                        roundResult = determineWinner(playerSelection,compSelection); // 
                        
                        if (roundResult.equals("win")){
                            winCounter++;
                        }else if(roundResult.equals("loss")){
                            lossCounter++;
                        }else{
                            tieCounter++;
                        }
                        currentRound++; 
                     
                    } else {
                        System.out.println("You've entered an invalid response.");
                        System.out.println("");
                        System.out.println("");
                        
                    }     
                } 
                // After the Rounds Are over we want to display the results
                // and determine if the player would like to play again
                
                System.out.println("*****************************");
                System.out.println("**     THE RESULTS         **");
                System.out.println("**       ARE IN!           **");
                System.out.println("*****************************");
                System.out.println("");
                if (winCounter>lossCounter) {
                    System.out.println("You Win!!!!");
                } else if (winCounter < lossCounter){
                    System.out.println("You Lose!!!");
                }else{
                    System.out.println("You Tied!!!");
                }
                System.out.println("");
                System.out.println("You tied in " + tieCounter + " rounds!");
                System.out.println("You won in " + winCounter + " rounds!");
                System.out.println("You lost in " + lossCounter + " rounds!");
                System.out.println("");
                System.out.println("");
                
                do{ 
                    System.out.println("Would you like to play again? (y/n)");
                    playAgainResponse = myScanner.nextLine();
                    if(playAgainResponse.equals("y")){
                        System.out.println("You are a trooper, let's go!");
                        playAgain = true;
                        currentRound =1;
                        winCounter=0;
                        lossCounter=0;
                        tieCounter=0;
                        invalidResponse = false;
                    } else if (playAgainResponse.equals("n")){ // not necessary just have it in there so that the reader can follow
                        playAgain = false;
                        invalidResponse = false;
                        System.out.println("Thank you for Playing. It has been real. It has been fun. It has been real fun. ");
                    } else {
                        System.out.println("You entered an invaid response. Please try again.");
                        invalidResponse = true;
                    }
                }while(invalidResponse);    
                
            }
        }while (playAgain == true);
   
    }
    
    public static int randomlyChosenRPS(){
        Random myRandomizer = new Random();
        
        int a = myRandomizer.nextInt(3) + 1;
       
        return a;
    }
    
    public static String determineWinner(int player, int computer){
        String a = "tie";
        if (player == computer){
            System.out.println("");
            System.out.println("It is a tie!");
        } 
        if (player == 1 && computer == 2){ // 1 corresponds to Rock and 2 to paper
            System.out.println("");
            System.out.println("You Lose");
            System.out.println("Your Rock got engulfed by Paper!");
            System.out.println("");
            a = "loss";   
        }
        if (player == 1 && computer == 3){
            System.out.println("");
            System.out.println("You win");
            System.out.println("Your Rock obliterated those Scissors!");
            System.out.println("");
            a = "win";   
        }
        if (player == 2 && computer == 1){
             System.out.println("");
             System.out.println(" You Win");
             System.out.println("Your Paper engulfed that rock!");
             System.out.println("");
             a = "win";  
        }
        if (player == 2 && computer == 3){
            System.out.println("");
            System.out.println("You Lose");
            System.out.println("Your Paper got diced and sliced by those Scissors!");
            System.out.println("");
            a = "loss";   
        }
        if (player == 3 && computer == 1){
             System.out.println("");
             System.out.println("You lose");
            System.out.println("Your Scissors got oliterated by that Rock");
            System.out.println("");
            a = "loss"; 
        }
        if (player == 3 && computer == 2){
            System.out.println("");
            System.out.println("You win");
            System.out.println("Your Scissors diced and sliced that Paper.");
            System.out.println("");
            a= "win";
        } 
        return a;
    }  
    
}
