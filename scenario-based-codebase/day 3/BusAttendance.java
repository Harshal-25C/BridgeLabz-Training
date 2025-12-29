//import java util package to access Scanner Class
import java.util.*;

public class BusAttendance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] students = {"Amit", "Riya", "Karan", "Neha", "Rahul", "Sneha", "Vikas", "Pooja", "Ankit", "Priya"};

        int present = 0, absent = 0;

        //for-each loop to check attendance
        for(String name : students){
            System.out.print(name + " (P/A): ");
            char status = sc.next().charAt(0);

            //Check presence using condition
            if(status== 'P' || status == 'p'){
                present++;
            }else{
                absent++;
            }
        }

        //Display attendance summary
        System.out.println("Total Present: " + present);
        System.out.println("Total Absent: " + absent);
    }
}
