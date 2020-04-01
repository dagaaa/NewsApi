package news;

import org.json.JSONObject;

import java.io.IOException;

public class NYTimesAPI extends NewsAPI {
    private static final String API_Key = "97lz4UXCPieZ1cLzXWyT0HrPyaJW16l0";

    public JSONObject getArticleInformation() throws IOException {
        String url = "https://api.nytimes.com/svc/search/v2/articlesearch.json?begin_date=20200401&api-key=97lz4UXCPieZ1cLzXWyT0HrPyaJW16l0";
        return super.getArticleInformation(url);
    }
}
