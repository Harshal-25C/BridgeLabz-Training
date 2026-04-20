//Import java util package to access Scanner Class
import java.util.*;

public class LibraryFineCalculator{

    //Method to calculate fine
    static int calculateFine(int dueDate, int returnDate){
        int fine = 0;

        //Check if book is returned late
        if(returnDate > dueDate){
            int lateDays = returnDate-dueDate;
            fine = lateDays*5;
        }
        return fine;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        //Loop for 5 books
        for(int i=1; i<=5; i++){
            System.out.println("\nBook " + i);

            System.out.print("Enter due date (day number): ");
            int dueDate = scanner.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = scanner.nextInt();

            int fine = calculateFine(dueDate, returnDate);
            totalFine += fine;

            if(fine>0){
                System.out.println("Late return fine: ₹" + fine);
            }else{
                System.out.println("Returned on time. No fine.");
            }
        }
        System.out.println("\nTotal Fine for all books: ₹" + totalFine);
    }
}
