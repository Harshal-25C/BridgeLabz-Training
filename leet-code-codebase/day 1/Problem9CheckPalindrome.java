import java.util.*;

class Problem9CheckPalindrome{
    public static boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int n = s.length();

        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args){
	    //Initialize Scanner Class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number: ");
		int x = sc.nextInt();
		
		//Access method isPalindrome
		boolean hk = isPalindrome(x);
		if(hk == true){
		    System.out.println("The number is palindrome!");
		}else{
		    System.out.println("The number is not a palindrome!");
		}
	}
}