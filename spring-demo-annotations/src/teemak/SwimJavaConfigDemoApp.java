package teemak;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {
		//READ spring config from java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		//GET bean
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Coach's email => " + theCoach.getEmail());
		System.out.println("Coach's team => " + theCoach.getTeam());
		
		context.close();
	}
}
