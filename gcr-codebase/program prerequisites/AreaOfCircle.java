import java.util.*;

public class AreaOfCircle{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		double red = sc.nextDouble();
		
		double area = Math.pi * Math.pow(red , 2);
		System.out.println(area);
	}
}