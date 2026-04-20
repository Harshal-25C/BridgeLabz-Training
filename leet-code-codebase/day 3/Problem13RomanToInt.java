import java.util.*;

class Problem13RomanToInt{
    public static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if(4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }
	
	public static void main(String[] args){
	    //Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roman number: ");
		String s = sc.next();
		
		//Access method romanToInt
		int result = romanToInt(s);
		System.out.println("The mathematical number of "+s+" is: " + result);
	}
}