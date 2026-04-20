//Imported java util package to access Scanner Class
import java.util.*;

public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
        //Fixed number for simplicity
        int secretNumber = 42;
        int guess;
        int attempts = 0;

        //do-while ensures at least one guess
        do{
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            attempts++; // Count number of attempts

            //Check if guess is too high or too low
            if(guess > secretNumber){
                System.out.println("Too high!");
            }else if(guess < secretNumber){
                System.out.println("Too low!");
            }else{
                //Correct guess
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        //Limit attempts to 5
        }while(attempts < 5);

        //If user fails in 5 attempts
        if(attempts == 5 && guess != secretNumber){
            System.out.println("Game Over! Maximum attempts reached.");
        }

    }
}
