package teemak;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//READ spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//GET  bean -- id must match class name
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//CALL method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//CLOSE context
		context.close();
	}

}
