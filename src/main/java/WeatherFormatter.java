import org.apache.log4j.Logger;

public class WeatherFormatter {

    private static Logger log = Logger.getLogger(WeatherFormatter.class);

    public String format(Weather weather) throws Exception {
       /* log.info( "Formatting Weather Data" );
        Reader reader =
                new InputStreamReader( getClass().getClassLoader()
                        .getResourceAsStream("output.vm"));
        VelocityContext context = new VelocityContext();
        context.put("weather", weather );
        StringWriter writer = new StringWriter();
        Velocity.evaluate(context, writer, "", reader);
        return writer.toString();*/
        return weather.toString();
    }
}