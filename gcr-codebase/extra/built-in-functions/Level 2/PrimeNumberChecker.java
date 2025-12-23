//Import java util package to access Scanner Class
import java.util.Scanner;

public class PrimeNumberChecker{
    //Method to check whether number is prime
    public static boolean isPrime(int num){

        if(num <= 1){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Take number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //Check and display result
        if(isPrime(num)){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is Not a Prime Number");
        }
    }
}
