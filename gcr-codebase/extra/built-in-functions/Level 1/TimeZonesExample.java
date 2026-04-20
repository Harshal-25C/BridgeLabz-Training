//Import java time package
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesExample{
    //Main Method
    public static void main(String[] args) {

        //Get current date and time in GMT time zone
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        //Get current date and time in Indian Standard Time
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        //Get current date and time in Pacific Standard Time
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        //Display current time in GMT
        System.out.println("Current Time in GMT: " + gmtTime);

        //Display current time in IST
        System.out.println("Current Time in IST: " + istTime);

        //Display current time in PST
        System.out.println("Current Time in PST: " + pstTime);
    }
}
