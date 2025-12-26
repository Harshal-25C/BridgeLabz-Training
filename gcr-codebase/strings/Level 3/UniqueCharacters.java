//Import java util package to access Scanner Class
import java.util.*;

public class UniqueCharacters{
    //Method to find length without using length()
    public static int findLength(String text){
        int count=0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
        }
        return count;
    }

    //Method to find unique characters using charAt()
    public static char[] findUniqueCharacters(String text){
        int len = findLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for(int i=0; i<len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            //Check with previous characters
            for(int j=0; j<i; j++){
                if(current == text.charAt(j)){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                temp[uniqueCount++]=current;
            }
        }

        //Create exact size array
        char[] uniqueChars = new char[uniqueCount];
        for (int i=0; i<uniqueCount; i++){
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] result = findUniqueCharacters(text);

        System.out.print("Unique characters: ");
        for (int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
