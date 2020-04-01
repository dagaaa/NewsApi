package news;

import org.json.JSONObject;

import java.io.IOException;

public interface NewsAPI {

     JSONObject getArticleInformation() throws IOException;
}
