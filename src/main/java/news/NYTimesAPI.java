package news;

import org.json.JSONObject;

import java.io.IOException;

public class NYTimesAPI extends NewsAPI {
    private static final String API_Key = "97lz4UXCPieZ1cLzXWyT0HrPyaJW16l0";
    private static final String DATE_FROMAT="yyyyMMdd";

    public JSONObject getArticleInformation() throws IOException {
        String date =DateWrapper.getDate(DATE_FROMAT);
        String url = "https://api.nytimes.com/svc/search/v2/articlesearch.json?begin_date="+date+"&api-key="+API_Key;
        return super.getArticleInformation(url);
    }
}
