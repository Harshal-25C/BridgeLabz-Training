import java.util.*;

public class PercentageOfSam{
    public static void main(String[] args){
	    int maths = 94;
		int physics = 95;
		int chemistry = 96;
		
		double percent = ((double)maths + (double)physics + (double)chemistry)/3;
		
		System.out.println("Sam’s average mark in PCM is : " + percent);
	}
}