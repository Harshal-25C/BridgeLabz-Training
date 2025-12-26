//Initialize java util package to access Scanner Class
import java.util.*;

public class ResultGenerator{

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;

        //Loop to take 5 subject marks
        for(int i=1; i<=5; i++){
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks = totalMarks + marks;
        }

        //Calculate average
        int average = totalMarks/5;

        System.out.println("\nAverage Marks: " + average);

        //Assign grade using switch
        switch(average/10){

            case 10:
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: Fail");
        }
    }
}
