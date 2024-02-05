
//
// Name: Julianna Arzola
// Project: #2
// Due: 3-10-2023
// Course: cs-1400-02-f23
//
// Description: 
//              This project prompts users to guess a randomly-generated number while providing hints and means of quitting the program.
//

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) 
    {
        Random rand = new Random();

         if (args.length > 0) {
            rand.setSeed(Long.valueOf(args[0]));
        }

        int secretNumber = rand.nextInt(100) + 1;

        Scanner keyboard = new Scanner(System.in);
        int guessCounter = 1;
        final int QUIT = -1;

        System.out.println("Guess My Number Game by J. Arzola");
        System.out.println();
        System.out.println("A secret number between 1-100 has been generated...");
        System.out.println("Enter guess -1 to quit.");
        System.out.println();
        System.out.print("Enter your guess? ");
        int userGuess = keyboard.nextInt();
        
        System.out.println();

        while (userGuess != secretNumber && userGuess != QUIT) {
            if (userGuess < secretNumber) {
                System.out.println("Guess is low, try again.");
            } else {
                System.out.println("Guess is high, try again.");
            }
            guessCounter++;
            System.out.print("Enter your guess? ");
            userGuess = keyboard.nextInt();
            System.out.println();   
        }
        
        if (userGuess == secretNumber) {
            if (guessCounter == 1) {
                System.out.println("Congratulations, you got it in 1 guess!");
            } else {
                System.out.println("Correct in " + guessCounter + " guesses.");
            }
        } else {
            System.out.println("The secret number is: " + secretNumber + ".");
        }
    }
}
