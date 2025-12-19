//Import java util package for scanner class
import java.util.*;

public class YoungestAndTallest{
    public static void main(String[] args){
	    //Create Scanner for taking user inputs
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        //take user input from array
        for(int i=0; i<3; i++){
            System.out.println("Enter the age of " +names[i]+ ": ");
            age[i] = sc.nextInt();

            System.out.println("Enter height of " +names[i]+ " (in cm): ");
            height[i] = sc.nextDouble();
        }

        //initialize youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        //find youngest and tallest using loop
        for (int i=1; i<3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        //display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex]+ " (Age: " +age[youngestIndex]+ ")");

        System.out.println("Tallest Friend: " +names[tallestIndex]+" (Height: " +height[tallestIndex]+ " cm)");
    }
}
