package news;

import org.json.JSONObject;

import java.io.IOException;

public class GuardianAPI extends NewsAPI {
    private static final String API_Key = "6877a15d-2e15-4a67-8f36-6a7de599ff55";

    public JSONObject getArticleInformation() throws IOException {
        String url = "https://content.guardianapis.com/search?from-date=2020-04-01&api-key=6877a15d-2e15-4a67-8f36-6a7de599ff55";
        return super.getArticleInformation(url);
    }


}
