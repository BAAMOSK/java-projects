package teemak;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		//READ spring
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//GET BEAN args => id, class //SAME as getting from a xml file
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//BEAN METHOD
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//CLOSE CONTEXT
		context.close();		
	}
}
