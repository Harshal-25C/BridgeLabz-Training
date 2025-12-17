import java.util.*;

public class DividePens{
    public static void main(String[] args){
        int total_pens = 14;
		int students = 3;
		
		int stu_pens = total_pens/students;
		int remaining = total_pens%students;

        System.out.println("The Pen Per Student is "+ stu_pens +" and the remaining pen not distributed is "+ remaining);
    }
}