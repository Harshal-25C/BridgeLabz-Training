//Import java.util package to access Scanner Class
import java.util.*;

public class FitnessChallengeTracker{
    public static void main(String[] args){

        //Push-ups done each day (0 means rest day)
        int[] pushUps = { 30, 0, 40, 50, 0, 60, 45 };

        int totalPushUps = 0;
        int workoutDays = 0;

        //for-each loop to calculate total and average
        for(int count : pushUps){

            //Skip rest days
            if(count == 0){
                continue;
            }

            totalPushUps+= count;
            workoutDays++;
        }

        double average = (double) totalPushUps/workoutDays;

        //Display result
        System.out.println("Total Push-ups in the week: " + totalPushUps);
        System.out.println("Average Push-ups per workout day: " + average);
    }
}
