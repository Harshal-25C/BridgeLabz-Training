//Import java util package to access Scanner Class
import java.util.Scanner;

public class ElectionBoothManager{
    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Loop for multiple voters
        while(true){

            System.out.print("\nEnter age (Enter -1 to exit): ");
            int age = sc.nextInt();

            //Exit condition
            if(age == -1){
                System.out.println("Election booth closed.");
                break;
            }

            //Check voting eligibility
            if(age >= 18){
                System.out.println("You are eligible to vote.");
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate A");
                System.out.println("2. Candidate B");
                System.out.println("3. Candidate C");

                System.out.print("Enter your vote (1/2/3): ");
                int vote = sc.nextInt();

                //Record vote using switch
                switch(vote){
                    case 1:
                        System.out.println("You voted for Candidate A");
                        break;
                    case 2:
                        System.out.println("You voted for Candidate B");
                        break;
                    case 3:
                        System.out.println("You voted for Candidate C");
                        break;
                    default:
                        System.out.println("Invalid vote");
                }
            }else{
                System.out.println("You are NOT eligible to vote.");
            }
        }
    }
}
