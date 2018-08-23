package teemak;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
			
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k.";
	}
	
	@Override
	public String getDailyFortune() {
		return "Just do it! " + fortuneService.getFortune();
	}

	//INIT method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	//DESTROY method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
	
}
