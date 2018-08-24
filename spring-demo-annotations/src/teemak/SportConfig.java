package teemak;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;

//THIS file is the JAVA version of XML

@Configuration
//@ComponentScan("teemak")
@PropertySource("classpath:sport.properties") //This line now makes properties file data available
public class SportConfig {
	//DEFINE bean for sad fortune -- METHOD name is *Bean ID*
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//DEFINE bean for swim coach and inject dependency  *class-instance*
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
