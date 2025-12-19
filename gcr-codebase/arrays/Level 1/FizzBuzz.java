import java.util.*;

public class FizzBuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        
		String[] res = new String[number+1];

        //Loop from 0 to the number
        for (int i = 0; i <= number; i++) {
		    //Check for multiples of both 3 and 5 first
            if(i%15 == 0){
                res[i] = "FizzBuzz";
            }else if(i%3 == 0){
                res[i] = "Fizz";
            }else if(i%5 == 0){ 
                res[i] = "Buzz";
            } else { 
			    res[i] = String.valueOf(i);
            }
        }

        //show the results of the array based on the index position
        for (int i=1; i<=number; i++) {
            System.out.println("Position: " +i+ " = " + res[i]);
        }
    }
}
