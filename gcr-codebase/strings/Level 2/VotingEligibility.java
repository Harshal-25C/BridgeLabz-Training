//Import java util package to access Scanner Class
import java.util.*;

public class VotingEligibility{
    //Method to generate ages of n students
    public static int[] generateAges(int n, Scanner sc){
        int[] ages = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    //Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages){
        String[][] result = new String[ages.length][2];

        for(int i=0; i<ages.length; i++){
            result[i][0] = String.valueOf(ages[i]);

            if(ages[i]<0){
                result[i][1] = "false";
            }else if(ages[i] >= 18){
                result[i][1] = "true";
            }else{
                result[i][1] = "false";
            }
        }
        return result;
    }

    //Method to display 2D array in tabular format
    public static void displayTable(String[][] table){

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for(int i=0; i<table.length; i++){
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        int[] ages = generateAges(10, sc);
        String[][] votingResult = checkVotingEligibility(ages);

        displayTable(votingResult);
    }
}
