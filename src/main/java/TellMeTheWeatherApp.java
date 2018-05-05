import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;


import org.apache.log4j.PropertyConfigurator;
@RestController
@EnableAutoConfiguration
public class TellMeTheWeatherApp {

	@RequestMapping("/")
	String home() throws Exception{

			// Retrieve Data
			InputStream dataIn = new YahooRetriever().retrieve("2502265");

			// Parse Data
			Weather weather = new YahooParser().parse(dataIn);


		return "The weather in Bucharest is!"+new WeatherFormatter().format( weather );
	}


	public static void main(String[] args) throws Exception {
		// Configure Log4J
		PropertyConfigurator
				.configure(TellMeTheWeatherApp.class.getClassLoader()
						.getResource("log4j.properties"));





		SpringApplication.run(TellMeTheWeatherApp.class, args);
	}


}