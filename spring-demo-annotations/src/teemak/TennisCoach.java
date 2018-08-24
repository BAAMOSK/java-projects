package teemak;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> inside constructor method");
	}
	
	//SETTER method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> inside setFortuneService setter method");
		fortuneService = theFortuneService;		
	}
	/*Constructor
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
