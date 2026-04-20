//Import java util package for Scanner
import java.util.*;

public class MeanHeightOfPlayers{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

		//Initialize an array of 11 index
		double[] heights = new double[11];
		
		//Initialize sum_of_elements for adding heights elements
		double sum_of_elements = 0.0;
		
		System.out.println("Enter the height of 11 players: ");
		for(int i=0; i<11; i++){
		    heights[i] = sc.nextDouble();
			
			//Adding the heights of players in sum_of_elements
			sum_of_elements += heights[i];
		}
		
		//mean = sum of all elements / number of elements
		double mean = sum_of_elements/11;
		
		System.out.println("The mean height of the football team is : "+ mean);
    }
}