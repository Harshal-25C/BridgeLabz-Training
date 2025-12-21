//Import java util package to access Random class
import java.util.*;

public class MatrixOperations{
    // This method creates a random matrix of given rows and columns
    public static int[][] createMatrix(int rows, int cols){
        int[][] matrix = new int[rows][cols];
        Random rd = new Random();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = rd.nextInt(10);
            }
        }
        return matrix;
    }

    //This method adds two matrices
    public static int[][] addMatrices(int[][] A, int[][] B){
        int[][] result = new int[A.length][A[0].length];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    //This method subtracts two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B){
        int[][] result = new int[A.length][A[0].length];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                result[i][j] = A[i][j]-B[i][j];
            }
        }
        return result;
    }

    //This method multiplies two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B){
        int[][] result = new int[A.length][B[0].length];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<B[0].length; j++){
                for(int k=0; k<A[0].length; k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    //This method displays a matrix
    public static void displayMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] A = createMatrix(2, 2);
        int[][] B = createMatrix(2, 2);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("Matrix B:");
        displayMatrix(B);

        System.out.println("Addition:");
        displayMatrix(addMatrices(A, B));

        System.out.println("Subtraction:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("Multiplication:");
        displayMatrix(multiplyMatrices(A, B));
    }
}