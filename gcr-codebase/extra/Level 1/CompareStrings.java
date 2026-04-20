//Import java util package to access Scanner class
import java.util.*;

public class CompareStrings{
    public static void compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());

        //Compare character by character
        for(int i=0; i<minLength; i++){
            if(s1.charAt(i)<s2.charAt(i)){
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                return;
            }else if(s1.charAt(i) > s2.charAt(i)){
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                return;
            }
        }

        //If all characters are same till shorter length
        if(s1.length() < s2.length()){
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        }else if(s1.length() > s2.length()){
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
        }else{
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {
	    //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        compareStrings(s1, s2);
    }
}
