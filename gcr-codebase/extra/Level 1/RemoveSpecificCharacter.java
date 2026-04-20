//Import java util package to access Scanner class
import java.util.*;

public class RemoveSpecificCharacter{
    //Initialize method removeCharacter
    public static String removeCharacter(String str, char ch){
        String result = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args){
	    //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String modified = removeCharacter(str, ch);

        System.out.println("Modified String: \"" + modified + "\"");
    }
}
