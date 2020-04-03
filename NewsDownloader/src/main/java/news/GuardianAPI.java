package news;

import org.json.JSONObject;

import java.io.IOException;

public class GuardianAPI extends NewsAPI {
    private static final String API_Key = "6877a15d-2e15-4a67-8f36-6a7de599ff55";
    private static final String DATE_FROMAT="yyyy-MM-dd";

    public JSONObject getArticleInformation() throws IOException {
        String date =DateWrapper.getDate(DATE_FROMAT);
        String url = "https://content.guardianapis.com/search?from-date="+date+"&api-key="+API_Key;
        return super.getArticleInformation(url);
    }


}
