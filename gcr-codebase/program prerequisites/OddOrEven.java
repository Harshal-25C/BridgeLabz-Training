import java.util.*;

public class OddOrEven{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		int hk = sc.nextInt();
		
		if(hk%2 == 0){
		    System.out.println("Number is Even");
		}else{
		    System.out.println("Number is Odd");
		}
    }	
}