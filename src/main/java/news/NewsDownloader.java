package news;

import java.io.IOException;

public class NewsDownloader {
    public static void main(String[] args) throws IOException {
        GuardianAPI guardianAPI = new GuardianAPI();
        guardianAPI.getArticleInformation();
    }
}
