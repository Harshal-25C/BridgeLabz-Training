//import java util package to access Scanner Class
import java.util.*;

public class DigitalWatchSimulation{ 
    public static void main(String[] args){
	    //Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//i = hour, j= minutes
		for(int i=0; i<24; i++){
            for(int j=0; j<60; j++){

                //Power cut simulation at 13:00
                if(i==13 && j==0) {
                    System.out.println("Power cut at 13:00. Watch stopped.");
                    break;
                }

                //Display time in HH:MM format
                System.out.printf("%02d:%02d%n", i, j);
            }

            //Exit outer loop when power cut occurs
            if(i==13){
                break;
            }
        }        
	}
}