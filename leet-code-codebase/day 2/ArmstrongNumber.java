import java.util.*;

public class ArmstrongNumber{
     public static int power(int x, int y){
        if(y==0)
            return 1;
        if (y%2==0)
            return power(x, y/2) * power(x, y / 2);
        return x*power(x, y/2) * power(x, y/2);
    }

    public static int order(int n){
        int t = 0;
        while(n != 0){
            t++;
            n /=10;
        }
        return t;
    }

    public static boolean armstrong(int n){
        int x = order(n);
        int temp = n, sum = 0;

        while(temp!=0){
            int r = temp%10;
            sum += power(r, x);
            temp /= 10;
        }

        return sum==n;
    }

    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of three digits: ");
        int n = sc.nextInt();
        if(armstrong(n)){
            System.out.println("It's an armstrong number");
        }else{
            System.out.println("It's not armstrong number");
        }
    }
    
}