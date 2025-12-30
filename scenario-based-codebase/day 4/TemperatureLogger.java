//Import java.util package to access Scanner Class
import java.util.*;

public class TemperatureLogger{
    //Method to calculate average temperature
    public static double calculateAverage(int[] temperatures){
        int sum = 0;
        for(int temp:temperatures){
            sum +=temp;
        }
        return (double) sum/temperatures.length;
    }

    //Method to find maximum temperature
    public static int findMax(int[] temperatures){
        int max = temperatures[0];
        for(int temp:temperatures){
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args){
        //Access Scanner Class
        Scanner sc = new Scanner(System.in);
        int[] temperatures = new int[7];

        //Take temperature for 7 days
        for(int i=0; i<temperatures.length; i++){
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = sc.nextInt();
        }

        //Call methods
        double average = calculateAverage(temperatures);
        int maxTemperature = findMax(temperatures);

        //Display results
        System.out.println("\nAverage Temperature: " + average);
        System.out.println("Maximum Temperature: " + maxTemperature);
    }
}
