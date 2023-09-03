package Assignments;

import java.util.Scanner;

public class EvenOrOdd {

	static int x;
	public static void main(String[] args){

		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int x=s.nextInt();
		if(x%2!=0) {
			System.out.println("Given number is odd");
		}
		else {
			System.out.println("Given number  is even ");
		}
		s.close();
	}
}
