//Import java util package to access Scanner class
import java.util.*;

public class LeapYear{
    //Initialize checkIfYearLeapOrNot method to find year is leap or not
    public static int checkIfYearLeapOrNot(int year){
        if(year >= 1582){
		    if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)){
			    return 1;
			}else{
			    return -1;
			}
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
         
		//Access checkIfYearLeapOrNot method
		int result = checkIfYearLeapOrNot(year);
		
		//Check if year is equal to 1 or not
		if(result == 1){
		    System.out.println("It's a Leap Year!");
		}else{
		    System.out.println("Not a Leap Year!");
		}
        
    }
}
