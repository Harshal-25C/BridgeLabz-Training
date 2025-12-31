//import java util package to access Scanner Class
import java.util.*;

public class OnlineQuizApplication{ 
    public static void main(String[] args){
	    //Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		String[] arr = new String[5];
		
		int count = 0;
		
		for(int i=0; i<5; i++){
            switch(i){
                case 0:
                    System.out.print("Who is the father of Java? ");
                    arr[i] = sc.nextLine();
                    break;

                case 1:
                    System.out.print("What was the first name of Java? ");
                    arr[i] = sc.nextLine();
                    break;

                case 2:
                    System.out.print("In which year was Java introduced publicly? ");
                    arr[i] = sc.nextLine();
                    break;

                case 3:
                    System.out.print("Which company developed Java? ");
                    arr[i] = sc.nextLine();
                    break;

                case 4:
                    System.out.print("Is Java 100% Object-Oriented? (Yes/No): ");
                    arr[i] = sc.nextLine();
                    break;
            }
        }

        //Answer Checking
        if(arr[0].equalsIgnoreCase("James Gosling")) count += 2;
        if(arr[1].equalsIgnoreCase("Oak")) count += 2;
        if(arr[2].equals("1995")) count += 2;
        if(arr[3].equalsIgnoreCase("Sun Microsystems")) count += 2;
        if(arr[4].equalsIgnoreCase("No")) count += 2;

        System.out.println("You scored " + count + " out of 10.");
	}
}