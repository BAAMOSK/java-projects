package teemak;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//LOAD the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//RETRIEVE bean args=>id,class
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//CALL methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("CricketCoach's luck today: " + theCoach.getDailyFortune());
		//CLOSE context
		context.close();
	}

}
