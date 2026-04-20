//Import java util package for scanner class
import java.util.*;

public class CopyTwoDInToOneDArray{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Take user input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        //Initialize 2-D array
        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements of the matrix:");
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] arr = new int[rows * columns];
        int index = 0;

        //Copy elements from 2D array to 1D array
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }

        //Display 1D array
        System.out.println("Elements of 1D array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
		}
	}
}
