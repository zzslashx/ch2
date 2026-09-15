import java.util.Scanner;

public class time {
public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("What hour is it? (use 24 hour clock)");
	int hour = scanner.nextInt(); 
	System.out.println("What minute is it?");
	int minute = scanner.nextInt();
	System.out.println("What second is it?");
	int second = scanner.nextInt();
	
	//int hour = 16;
	//int minute = 3;
	//int second = 15;
	
	
	int secondsInDay=86400; //24*60*60 =86400
	
	
	int secondsSinceMidnight = hour * 3600 + minute * 60 + second; //just convert the time into seconds

	double percentageDayPassed = secondsSinceMidnight*100.0 / secondsInDay; 
	
	
	System.out.println("Seconds since midnight: " + secondsSinceMidnight); //seconds since midnight
	System.out.println("Seconds left in day: " +(secondsInDay-secondsSinceMidnight)); //seconds left in day 
	System.out.println("Percentage of day passed: " +percentageDayPassed); //percentage of days passed
	
	//time passed
	final int minuteFinal = 12;
	final int hourFinal = 16;
	final int secondFinal = 22;
	
	System.out.println("\n\n\nSeconds spent making this project: " + ((12*60+16*3600+22-16*3600+15+3*60)));
	
	}
}
