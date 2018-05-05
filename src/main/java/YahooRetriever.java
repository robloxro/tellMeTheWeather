import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;

import org.apache.log4j.*;

public class YahooRetriever {



    public InputStream retrieve(String zipcode) throws Exception {

       /* String url = "https://weather-ydn-yql.media.yahoo.com/forecastrss?w="
                + zipcode;*/
      /* String url="http://weather.yahoo.com/united-states/california/los-angeles-2442047";*/
        String url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)&format=xml&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
        URLConnection conn = new URL(url).openConnection();
        return conn.getInputStream();
    }
}