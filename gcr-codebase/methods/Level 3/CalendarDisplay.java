//import java util package to access Scanner class
import java.util.*;

public class CalendarDisplay{

    //This method returns the name of the month
    public static String getMonthName(int month){
        String[] months={
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month-1];
    }

    //This method checks whether the year is a leap year
    public static boolean isLeapYear(int year){
        return (year%400 == 0 || (year%4 == 0 && year%100 != 0));
    }

    //This method returns the number of days in a given month
    public static int getDaysInMonth(int month, int year){
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(month==2 && isLeapYear(year)){
            return 29;
        }
        return days[month - 1];
    }

    //This method calculates the first day of the month using Gregorian formula
    public static int getFirstDay(int d, int m, int y){
        int y0 = y-(14-m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14 - m)/12)-2;
        int d0 = (d + x + (31*m0)/12)%7;
        return d0;
    }

    public static void main(String[] args){
	    //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        //Take month and year input from the user
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        //Display month name and year
        System.out.println("\n   " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(1, month, year);
        int daysInMonth = getDaysInMonth(month, year);

        for(int i=0; i<firstDay; i++){
            System.out.print("    ");
        }

        //Print all days of the month in calendar format
        for(int day=1; day<=daysInMonth; day++){
            System.out.printf("%3d ", day);
            if((day + firstDay)%7==0){
                System.out.println();
            }
        }
    }
}
