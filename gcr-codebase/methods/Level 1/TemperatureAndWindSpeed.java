//Imported java util package to access Scanner class
import java.util.*;

public class TemperatureAndWindSpeed{
    //Method to find quotient and remainder
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 *temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
    }

    public static void main(String[] args) {
        //Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature and windSpeed:");
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();
		
		//Create a Object of class TemperatureAndWindSpeed
		TemperatureAndWindSpeed tws = new TemperatureAndWindSpeed();

        //Access the method calculateWindChill
        double result = tws.calculateWindChill(temperature, windSpeed);
        System.out.println("The windChill temperature is : "+ result);

    }
}