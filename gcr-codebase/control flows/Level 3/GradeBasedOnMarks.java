//Import java util package for Scanner
import java.util.*;

public class GradeBasedOnMarks{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize three variables for taking user input to store marks
		System.out.println("Enter the marks of physics: ");
		double physics_marks = sc.nextInt();
		System.out.println("Enter the marks of chemistry: ");
		double chemistry_marks = sc.nextInt();
		System.out.println("Enter the marks of maths: ");
		double maths_marks = sc.nextInt();
		
		//Calculate percentage (Average)
		double average = (physics_marks+chemistry_marks+maths_marks)/3;

        char grade;
        String remarks;

        // Determine grade and remarks
        if (average>=80) {
            grade='A';
            remarks= "Level 4, above agency-normalized standards";
        }else if(average>=70){
            grade='B';
            remarks= "Level 3, at agency-normalized standards";
        }else if(average>=60){
            grade='C';
            remarks ="Level 2, below but approaching agency-normalized standards";
        }else if(average>=50){
            grade= 'D';
            remarks ="Level 1, well below agency-normalized standards";
        }else if(average>=40){
            grade='E';
            remarks ="Level 1-, too below agency-normalized standards";
        }else{
            grade='R';
            remarks = "Remedial standards";
        }

        System.out.println("\n----- Result -----");
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
	}
}
