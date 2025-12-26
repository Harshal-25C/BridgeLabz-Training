public class DayOfWeek{
    public static void main(String[] args){
		
		if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }

        //Take month, day, and year from command line
        int m = Integer.parseInt(args[0]); //Month
        int d = Integer.parseInt(args[1]); //Date
        int y = Integer.parseInt(args[2]); //Year

        //Adjust year value based on month
        int y0 = y - (14 - m)/12;

        //Calculate extra days from leap years
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        //Adjust month value
        int m0 = m + 12 * ((14 - m)/12) - 2;

        //Final formula to get day of week (0 = Sunday, 1 = Monday, etc.)
        int d0 = (d + x + (31 * m0)/12) % 7;

        System.out.println(d0);
		
/*  Output meaning:        Compile: javac DayOfWeek.java
        0 → Sunday            Run:  java DayOfWeek 12 18 2025     then the out is: 4 , means Thursday
		1 → Monday                             <Month Date year>
		2 → Tuesday
		3 → Wednesday
		4 → Thursday
		5 → Friday
		6 → Saturday
*/
    }
}
