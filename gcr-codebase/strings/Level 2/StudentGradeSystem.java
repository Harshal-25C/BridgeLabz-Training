//Import java util package to access Scanner Class
import java.util.*;

public class StudentGradeSystem{
    //Method to generate random 2-digit PCM scores
    public static int[][] generateScores(int students){

        int[][] scores = new int[students][3];

        for(int i=0; i<students; i++){
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }
        return scores;
    }

    //Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] scores){

        double[][] result = new double[scores.length][3];
        for(int i=0; i<scores.length; i++){

            int total = scores[i][0] + scores[i][1]+scores[i][2];
            double average = total/3.0;
            double percentage=(total/300.0)*100;

            //Rounding to 2 decimal places
            average = Math.round(average*100.0)/100.0;
            percentage = Math.round(percentage*100.0)/100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    //Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results){

        String[][] grades = new String[results.length][1];

        for(int i=0; i<results.length; i++){
            double percent = results[i][2];

            if (percent >= 80)
                grades[i][0] = "A";
            else if (percent >= 70)
                grades[i][0] = "B";
            else if (percent >= 60)
                grades[i][0] = "C";
            else if (percent >= 50)
                grades[i][0] = "D";
            else if (percent >= 40)
                grades[i][0] = "E";
            else
                grades[i][0] = "R";
        }
        return grades;
    }

    //Method to display scorecard in tabular format
    public static void displayScoreCard(
            int[][] scores, double[][] results, String[][] grades) {

        System.out.println("\nScorecard");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println( (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t\t" +
                results[i][2] + "\t\t" +
                grades[i][0]
            );
        }
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);

        displayScoreCard(scores, results, grades);
    }
}
