package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello");
	System.out.println("This is the number guessing game!");
	int guess;
	int answer;
	answer = (int) (Math.random() * 100);
	String playagain;
    playagain = "yes";
    playagain = null;
    guess = 5;
    Scanner keyboard;
    keyboard = new Scanner(System.in);
    guess = keyboard.nextInt();

    do (
        System.out.println("Guess a number");
        guess = keyboard.nextInt();
        if (guess>answer){
            System.out.println("Too high, go again.");
        }
            else if (guess <answer){
            System.out.println("Too low, go again.");
        }
            else if (guess == answer){
            System.out.println("That is correct!");
        }
            )



    }
}
