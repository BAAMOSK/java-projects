package teemak;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	@Value("${coach.email}")
	private String email;
	@Value("${coach.team}")
	private String team;
	
	//CLASS is being initialized with sadFortuneService
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 10 meter laps.";
	}
	
	//This is where sadFortune is being passed to -- because sadfortune is called getFortune()
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	
}
