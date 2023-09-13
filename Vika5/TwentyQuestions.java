import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac TwentyQuestions.java
 *  Execution:    java TwentyQuestions
 *  Dependencies  StdIn.java
 *
 *  % java TwentyQuestions
 *  I'm thinking of a number between 1 and 1,000,000
 *  What's your guess? 500000
 *  Too high
 *  What's your guess? 250000
 *  Too low
 *  What's your guess? 375000
 *  Too high
 *  What's your guess? 312500
 *  Too high
 *  What's your guess? 300500
 *  Too low
 *  ...
 *
 ******************************************************************************/

public class TwentyQuestions {

    public static void main(String[] args) {

        // Generate a number and answer questions
        // while the user tries to guess the value.
        int secret = 1 + (int) (Math.random() * 1000000);

        Scanner inntak = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.print("I'm thinking of a number ");
        System.out.println("between 1 and 1,000,000");
        int guess = 0;
        while (guess != secret) {
            // Solicit one guess and provide one answer
            System.out.print("What's your guess? ");
            guess = inntak.nextInt();
            if (guess < secret) System.out.println("Too low");
            else if (guess > secret) System.out.println("Too high");
            else System.out.println("You win!");
        }
    }
}
