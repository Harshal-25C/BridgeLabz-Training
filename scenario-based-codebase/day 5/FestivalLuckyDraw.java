//Import java util package to access java util package
import java.util.*;

public class FestivalLuckyDraw{
    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for(int i=1; i<=visitors; i++){
            System.out.print("Visitor " + i + ", enter your lucky number: ");
            int number = sc.nextInt();

            if(number<=0){
                System.out.println("Invalid number. Try next visitor.");
                continue;
            }

            if(number%3 == 0 && number%5 == 0){
                System.out.println("Congratulations! You won a gift");
            }else{
                System.out.println("Better luck next time.");
            }
        }
    }
}
