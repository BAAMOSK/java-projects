package teemak;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component //@Scope("prototype") //Default is singleton scope
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> inside constructor method");
	}
	
	//DEFINE init method
	@PostConstruct //Code will execute after constructor and dependency injection
	public void doMyStartupStuff() {
		System.out.println("POST-CONSTRUCT");
	}
	//DEFINE destroy method
	@PreDestroy //Code will execute BEFORE bean is destroyed
	public void doMyCleanupStuff() {
		System.out.println("PRE-DESTROY");
	}
	
	//SETTER method
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> inside doSomeCrazyStuff setter method");
		fortuneService = theFortuneService;		
	}*/
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
