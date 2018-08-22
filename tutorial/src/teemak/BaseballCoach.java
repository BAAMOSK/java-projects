package teemak;

public class BaseballCoach implements Coach {
	//DEPENDENCY
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		
	}
	
	//CONSTRUCTOR
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice.";		
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
