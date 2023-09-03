package Assignments;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the student marks");
		int marks=s.nextInt();

		if(marks>85) {
			System.out.println("first class");
		}
		else if(marks>70 && marks<80) {
			System.out.println("second class");
		}else if(marks>35 && marks<70) {
			System.out.println("third class");
		}else if(marks==35) {
			System.out.println("pass");
		}else{
			System.out.println("Fail");
		}
		s.close();

	}

}
