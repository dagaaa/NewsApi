package news;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONObject;

import java.io.IOException;

public class GuardianAPI implements NewsAPI {
    private static final String API_Key = "6877a15d-2e15-4a67-8f36-6a7de599ff55";

    public JSONObject getArticleInformation() throws IOException {
        OkHttpClient client = new OkHttpClient();

        String url = "https://content.guardianapis.com/search?from-date=2020-04-01&api-key=test";
        Request request = new Request.Builder()
                .url(url)
                .build();


        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
        return new JSONObject(response);


    }


}
