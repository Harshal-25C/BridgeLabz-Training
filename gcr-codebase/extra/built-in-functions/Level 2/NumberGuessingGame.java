import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
    //Method to generate a random guess between given range
    public static int generateGuess(int low, int high){
        Random rd = new Random();
        return rd.nextInt(high - low + 1)+low;
    }

    //Method to take feedback from the user
    public static String getFeedback(Scanner sc){
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.nextLine();
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100.");

        while(!guessed){
            //Computer generates a guess
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            //User gives feedback
            String feedback = getFeedback(sc);

            //Adjust the range based on feedback
            if(feedback.equalsIgnoreCase("high")){
                high = guess-1;
            } 
            else if(feedback.equalsIgnoreCase("low")){
                low = guess + 1;
            } 
            else if(feedback.equalsIgnoreCase("correct")){
                System.out.println("Computer guessed the correct number!");
                guessed = true;
            }
        }
    }
}
