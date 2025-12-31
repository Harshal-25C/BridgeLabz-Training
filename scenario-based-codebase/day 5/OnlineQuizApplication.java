//import java util package to access Scanner Class
import java.util.*;

public class OnlineQuizApplication{ 
    public static void main(String[] args){
	    //Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		int count = 0;
		
		for(int i=0; i<5; i++){
            if(i == 0){
                System.out.println("Q.1 Who is the father of java: ");
                System.out.println("1. Harshal Choudhary");
                System.out.println("2. James Gosling");
                System.out.println("3. Devarshi Mishra");
                System.out.println("4. Ayush Mishra\n");
                arr[i] = sc.nextInt();
                switch(arr[0]){
                    case 2:
                        count+=2;
                        break;
                    default:
					System.out.println("Wrong Answer!");
                        break;
                }
            }
            if(i == 1){
                System.out.println("Q.2 What was the first name of Java? ");
                System.out.println("1. Green Language");
                System.out.println("2. hypen language");
                System.out.println("3. oak");
                System.out.println("4. java\n");
                arr[i] = sc.nextInt();
                switch(arr[1]){
                    case 3:
                        count+=2;
                        break;
                    default:
					    System.out.println("Wrong Answer!");
                        break;
                }
            }
            if(i == 2){
                System.out.println("Q.3 In which year was Java introduced publicly? \n");
                System.out.println("1. 2025");
                System.out.println("2. 1955");
                System.out.println("3. 1995");
                System.out.println("4. 2000\n");
                arr[i] = sc.nextInt();
                switch(arr[2]){
                    case 3:
                        count+=2;
                        break;
                    default:
					    System.out.println("Wrong Answer!");
                        break;
                }
            }
            if(i == 3){
                System.out.println("Q.4 Which company developed Java? \n");
                System.out.println("1. Oracle");
                System.out.println("2. Capgemini");
                System.out.println("3. Google");
                System.out.println("4. Sun Microsystem\n");
                arr[i] = sc.nextInt();
                switch(arr[3]){
                    case 4:
                        count+=2;
                        break;
                    default:
					    System.out.println("Wrong Answer!");
                        break;
                }
            }
            if(i == 4){
                System.out.println("Q.5 Is Java 100% Object-Oriented? \n");
                System.out.println("1. Yes");
                System.out.println("2. No\n");
                arr[i] = sc.nextInt();
                switch(arr[4]){
                    case 2:
                        count+=2;
                        break;
                    default:
					    System.out.println("Wrong Answer!");
                        break;
                }
            }
        }

        System.out.println("You scored " + count + " out of 10.");
	}
}