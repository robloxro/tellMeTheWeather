import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class TellMeTheWeatherApp {

	@RequestMapping("/")
	String home() {
		return "The weather in Bucharest is!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TellMeTheWeatherApp.class, args);
	}

}