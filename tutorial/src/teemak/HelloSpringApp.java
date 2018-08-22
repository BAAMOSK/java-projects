package teemak;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		//LOAD spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//GET bean from spring -- id from xml file, interface
		//Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//System.out.println(theCoach.getDailyWorkout());
		//context.close();
		System.out.println(context);
	}
}
