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
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//CLOSE context
		context.close();
	}

}
