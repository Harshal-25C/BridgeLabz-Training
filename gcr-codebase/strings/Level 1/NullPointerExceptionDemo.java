public class NullPointerExceptionDemo{
    //Method to generate NullPointerException
    public static void generateException(){
        //text is initialized to null
        String text = null;

        //Calling a String method on null reference
        //This will generate NullPointerException
        System.out.println(text.length());
    }

    //Method to handle NullPointerException using try-catch
    public static void handleException(){
        //text is initialized to null
        String text = null;

        try{
            //Risky code that may cause exception
            System.out.println(text.length());
        }catch(NullPointerException e){
            //Exception is handled here
            System.out.println("NullPointerException caught successfully.");
            System.out.println("Reason: Attempted to access a method on a null object.");
        }
    }

    public static void main(String[] args){

        //First, call method that generates exception
        System.out.println("Generating NullPointerException:");
        try{
            generateException();
        }catch(NullPointerException e){
            System.out.println("Exception occurred in generateException() method.");
        }

        //Refactored code to handle the exception
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
