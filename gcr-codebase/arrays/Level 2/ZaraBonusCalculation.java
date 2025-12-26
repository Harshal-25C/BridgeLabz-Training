//Import java util package for Scanner
import java.util.*;

public class ZaraBonusCalculation{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        int n = 10;

        //Arrays to store data
        double[] salary = new double[n];
        double[] yearsOfService = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        //Input loop
        for(int i=0; i<n; i++){
            System.out.println("Enter details for Employee "+(i+1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = sc.nextDouble();

            //Validation
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid salary and years of service.");
                i--; 
                continue;
            }
        }

        //Calculation loop
        for(int i=0; i<n; i++){

            if(yearsOfService[i] > 5){
                bonus[i] = salary[i] * 0.05;
            }else{
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n ----- Zara Bonus Summary -----");
        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

    }
}
