//Import java util & java time package to access Scanner class and LocalDate class
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample{
    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Take date input from the user in yyyy-mm-dd format
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String inputDate = sc.nextLine();

        //Convert the input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        //Add 7 days, 1 month, and 2 years to the date
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        //Subtract 3 weeks from the updated date
        LocalDate finalDate = updatedDate.minusWeeks(3);

        //Display the final calculated date
        System.out.println("Final Date after calculations: " + finalDate);
    }
}
