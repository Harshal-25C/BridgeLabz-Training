//Import java util package to access Scanner Class
import java.util.*;

public class CharacterTypeTable{

    //Method to check character type
    public static String checkCharacter(char ch){
        if(ch>='A' && ch<='Z'){
            ch = (char) (ch + 32);
        }
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return "Vowel";
        }
        if(ch>='a' && ch<='z'){
            return "Consonant";
        }
        return "Not a Letter";
    }

    //Method to store characters and their type in 2D array
    public static String[][] classifyCharacters(String text){

        String[][] data = new String[text.length()][2];

        for(int i=0; i<text.length(); i++){
            data[i][0] = String.valueOf(text.charAt(i));
            data[i][1] = checkCharacter(text.charAt(i));
        }
        return data;
    }

    //Method to display 2D array in tabular format
    public static void displayTable(String[][] table){

        System.out.println("\nCharacter\tType");
        System.out.println("----------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = classifyCharacters(text);
        displayTable(result);
    }
}
