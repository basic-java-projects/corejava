package Assignments;

import java.util.Scanner;

public class StmtBasedOnDay {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day name");
		String day=s.nextLine();
		if(day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")) {
			System.out.println("uff, its a weekday");
		}else {
			System.out.println("yayy, its a weekend");
		}
		s.close();
	}

}
