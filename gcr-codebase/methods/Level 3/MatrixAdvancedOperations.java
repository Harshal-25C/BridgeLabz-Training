//Import java util package to access Random class
import java.util.*;

public class MatrixAdvancedOperations{
    //This method creates a random matrix
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

    //This method finds the transpose of a matrix
    public static int[][] transpose(int[][] matrix){
        int[][] result = new int[matrix[0].length][matrix.length];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    //This method finds determinant of a 2x2 matrix
    public static int determinant2x2(int[][] m){
        return (m[0][0] *m[1][1])-(m[0][1] * m[1][0]);
    }

    //This method finds determinant of a 3x3 matrix
    public static int determinant3x3(int[][] m){
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    //This method finds inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] m){
        int det = determinant2x2(m);
        double[][] inv = new double[2][2];

        inv[0][0] = m[1][1]/(double) det;
        inv[0][1] = -m[0][1]/(double) det;
        inv[1][0] = -m[1][0]/(double) det;
        inv[1][1] = m[0][0]/(double) det;

        return inv;
    }

    //This method displays an integer matrix
    public static void displayIntMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    //This method displays a double matrix
    public static void displayDoubleMatrix(double[][] matrix){
        for(double[] row : matrix){
            for(double val : row){
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] matrix = createMatrix(2, 2);

        System.out.println("Original Matrix:");
        displayIntMatrix(matrix);

        System.out.println("Transpose:");
        displayIntMatrix(transpose(matrix));

        System.out.println("Determinant:");
        System.out.println(determinant2x2(matrix));

        System.out.println("Inverse:");
        displayDoubleMatrix(inverse2x2(matrix));
    }
}
