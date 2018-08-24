package teemak;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
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
	
	
}
