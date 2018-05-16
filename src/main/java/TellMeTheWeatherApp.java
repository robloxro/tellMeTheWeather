import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;

@RestController
@EnableAutoConfiguration
public class TellMeTheWeatherApp {

    public static void main(String[] args) throws Exception {
        // Configure Log4J
        PropertyConfigurator
                .configure(TellMeTheWeatherApp.class.getClassLoader()
                        .getResource("log4j.properties"));


        SpringApplication.run(TellMeTheWeatherApp.class, args);
    }

    @RequestMapping("/")
    String home() throws Exception {

        // Retrieve Data
       // InputStream dataIn = new YahooRetriever().retrieve("2502265");
        InputStream dataIn = new YahooRetriever().retrieve("010164");
        //010164

        // Parse Data
        Weather weather = new YahooParser().parse(dataIn);


        return "The weather in Bucharest is!" + new WeatherFormatter().format(weather);
    }


}