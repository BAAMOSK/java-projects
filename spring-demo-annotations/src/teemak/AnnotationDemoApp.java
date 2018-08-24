package teemak;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//READ spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//GET  bean
		Coach theCoach = context.getBean("myTennisCoach", Coach.class);
		
		//CALL method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//CLOSE context
		context.close();
	}

}
