//Import java util package to access Scanner and Random classes
import java.util.*;

public class StudentMarksCalculator{
    //This method generates random 2-digit marks for PCM subjects
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        Random rand = new Random();

        for (int i=0; i<students; i++) {
            marks[i][0] = rand.nextInt(90) +10; // Physics
            marks[i][1] = rand.nextInt(90) + 10; // Chemistry
            marks[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return marks;
    }

    //This method calculates total, average, and percentage
    public static double[][] calculateResults(int[][] marks){
        double[][] result = new double[marks.length][3];

        for(int i=0; i<marks.length; i++){
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total/3.0;
            double percentage = (total/ 300.0)*100;

            //Round values to 2 decimal places
            result[i][0] = Math.round(total*100.0)/100.0;
            result[i][1] = Math.round(average*100.0)/100.0;
            result[i][2] = Math.round(percentage*100.0)/100.0;
        }
        return result;
    }

    //This method displays student data in tabular format
    public static void displayResults(int[][] marks, double[][] result){
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercent");

        for(int i=0; i<marks.length; i++){
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2]);
        }
    }

    public static void main(String[] args){
	    //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Take number of students from the user
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        //Generate marks and calculate results
        int[][] marks = generateMarks(students);
        double[][] result = calculateResults(marks);

        //Display final output
        displayResults(marks, result);
    }
}
