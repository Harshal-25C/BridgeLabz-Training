//Import java util package to access Scanner Class
import java.util.*;

public class CalendarDisplay{
    //Method to get month name
    public static String getMonthName(int month){
        String[] months ={
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    //Method to check leap year
    public static boolean isLeapYear(int year){
        if(year%400 == 0)
            return true;
        if(year%100 == 0)
            return false;
        return year%4 == 0;
    }

    //Method to get number of days in a month
    public static int getDaysInMonth(int month, int year){
        int[] days ={
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        if(month==2 && isLeapYear(year)){
            return 29;
        }
        return days[month-1];
    }

    // Method to get first day of month using Gregorian algorithm
    public static int getFirstDay(int month, int year){

        int d=1;
        int y0 = year-(14-month)/12;
        int x = y0+y0/4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        //First loop for indentation
        for(int i=0; i<firstDay; i++){
            System.out.print("    ");
        }

        //Second loop to display days
        for(int day=1; day<=daysInMonth; day++){
            System.out.printf("%3d ", day);

            if((day+firstDay)%7 == 0){
                System.out.println();
            }
        }
    }
}
