package news;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateWrapper {

    public static String getDateTime(String format){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static String getDate(String format){
        return getDateTime(format);
    }

    public static String getTime(){
        String format = "HH:mm";
        return getDateTime(format);

    }
}
