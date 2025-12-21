//import java util package to access Random class
import java.util.Random;

public class EmployeeBonusCalculator{
    //This method generates salary and years of service for employees
    public static int[][] generateEmployeeData(){
        int[][] data = new int[10][2];
        Random rd = new Random();
		
        for(int i=0; i<10; i++){
            //Salary between 20000 and 60000
            data[i][0] = rd.nextInt(40001)+20000;

            //Years of service between 1 and 10
            data[i][1] = rd.nextInt(10)+1;
        }
        return data;
    }

    // This method calculates new salary and bonus for employees
    public static double[][] calculateNewSalaryAndBonus(int[][] data){
        double[][] result = new double[10][2];

        for(int i=0; i<10; i++){
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            //Employees with more than 5 years get 5% bonus
            if(years>5){
                bonus = salary*0.05;
            }else{
                bonus = salary*0.02;
            }

            result[i][0] = salary+bonus; // new salary
            result[i][1] = bonus;          // bonus amount
        }
        return result;
    }

    //This method calculates total old salary
    public static int totalOldSalary(int[][] data){
        int sum = 0;
        for (int i=0; i<10; i++){
            sum+=data[i][0];
        }
        return sum;
    }

    //This method calculates total new salary
    public static double totalNewSalary(double[][] result){
        double sum = 0;
        for (int i=0; i<10; i++){
            sum += result[i][0];
        }
        return sum;
    }

    public static void main(String[] args){

        //Generate employee salary and service data
        int[][] employeeData = generateEmployeeData();

        //Calculate new salary and bonus
        double[][] result = calculateNewSalaryAndBonus(employeeData);

        //Display employee details
        System.out.println("Emp\tSalary\tYears\tBonus\tNew Salary");
        for (int i=0; i<10; i++){
            System.out.println((i + 1) + "\t" +
                    employeeData[i][0] + "\t" +
                    employeeData[i][1] + "\t" +
                    result[i][1] + "\t" +
                    result[i][0]);
        }
        //Display total salaries
        System.out.println("\nTotal Old Salary: " + totalOldSalary(employeeData));
        System.out.println("Total New Salary: " + totalNewSalary(result));
    }
}
