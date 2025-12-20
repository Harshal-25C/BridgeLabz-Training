//import java util package to access Scanner class
import java.util.*;

public class StudentVoteChecker{
    //Method to check voting eligibility
    public boolean canStudentVote(int age){
        if(age<0){
            return false;
        }
        if(age >= 18){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        //Taking input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("Voting Eligibility Results:");

        //Checking voting eligibility
        for (int i=0; i<ages.length; i++) {
            boolean canVote = checker.canStudentVote(ages[i]);

            if(canVote){
                System.out.println("Student " + (i+1) + " can vote.");
            } else {
                System.out.println("Student " + (i+1) + " cannot vote.");
            }
        }
    }
}
