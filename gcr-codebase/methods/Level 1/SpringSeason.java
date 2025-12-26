//Imported java util package to access scanner class
import java.util.*;

public class SpringSeason{
    //Initialize a method checkSpringSeason
    public int checkSpringSeason(int month, int day){
	    //Check is the month is march and day are between 20 to 31
		if((month == 3) && (day >= 20 && day <= 31)){
		    return 1; 
		}else if((month == 4) && (day >= 1 && day <= 30)){
		    return 1; 
		}else if((month == 5) && (day >= 1 && day <= 31)){
		    return 1; 
		}else if((month == 6) && (day >= 1 && day <= 20)){
		    return 1; 
		}
		//Or the season is not a SpringSeason
		return -1;
	}
	
    public static void main(String[] args){
		//Initialize Scanner 
	    Scanner sc = new Scanner(System.in);
		
		//Check is the length is 2 or not
		if(args.length != 2){
            System.out.println("Usage: java DayOfWeek <month> <day>");
            return;
        }
		
		//Initialize month and day as a command-line inputs
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		//Create an object of class SpringSeason
		SpringSeason ss = new SpringSeason();
		
		//Access the method checkSpringSeason through object ss
		int checkSeason = ss.checkSpringSeason(month, day);
		
		if(checkSeason == 1){
		    System.out.println("It's a Spring Season!");
		}else{
		    System.out.println("Not a Spring Season!");
		}
	}
}