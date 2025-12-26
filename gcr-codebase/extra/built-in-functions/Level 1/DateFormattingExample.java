//Import java time package to access LocalDate and DateTimeFormatter Classes
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormattingExample{
    public static void main(String[] args){

        //Get the current date from the system
        LocalDate currentDate = LocalDate.now();

        //Create formatter for dd/MM/yyyy format
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Create formatter for yyyy-MM-dd format
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //Create formatter for EEE, MMM dd, yyyy format
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        //Display the date in dd/MM/yyyy format
        System.out.println("Date in dd/MM/yyyy format: " + currentDate.format(format1));

        //Display the date in yyyy-MM-dd format
        System.out.println("Date in yyyy-MM-dd format: " + currentDate.format(format2));

        //Display the date in EEE, MMM dd, yyyy format
        System.out.println("Date in EEE, MMM dd, yyyy format: " + currentDate.format(format3));
    }
}
