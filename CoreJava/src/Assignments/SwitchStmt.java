package Assignments;

import java.util.Scanner;

public class SwitchStmt {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int num1=s.nextInt();
		System.out.println("enter the second number");
		int num2=s.nextInt();
		System.out.println("enter the operation");
		String op=s.next();
		int result=0;
		switch(op) {

		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1+num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "%":
			result=num1%num2;
			break;
		default:
			System.err.println("invalid operator");
			break;
		}
		System.out.println(result);
		s.close();
	}

}
