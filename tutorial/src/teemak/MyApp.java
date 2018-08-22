package teemak;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach trackCoach = new TrackCoach();
		Coach baseballCoach = new BaseballCoach();
		
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
	}

}
