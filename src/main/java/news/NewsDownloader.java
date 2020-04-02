package news;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class NewsDownloader {
    public static void main(String[] args) throws IOException {
//        2020-04-01 guardian
//        20200401 nyt
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        dtf.format(now);
        GuardianAPI guardianAPI = new GuardianAPI();
//        guardianAPI.getArticleInformation();
//        NYTimesAPI nyTimesAPI = new NYTimesAPI();
//        nyTimesAPI.getArticleInformation();
    }
}
