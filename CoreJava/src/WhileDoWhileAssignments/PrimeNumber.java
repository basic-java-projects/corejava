package WhileDoWhileAssignments;

import java.util.Scanner;

public class PrimeNumber {

	//print prime numbers 50 to 150
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the Second number");
		int num2=s.nextInt();
		//		int sum=0;
		//print 1 to 100 values
		//print even number from 150 to 200
		//print sum of even number 1 to 100 
		//print odd number from 200 to 25(reverse order)
		//
		while(num1<=num2) {
			boolean isPrime=true;
			if(num1!=1 && num1!=2) {
				int i=2;
				while(i<num1) {
					if(num1%2==0) {                    
						isPrime =false;
						break;
					}
					i++;
				}
			}

			else 
				isPrime=false;
				
				if(isPrime)
					System.out.println("Given number is prime number : "+num1);
			num1++;
		}

	}


}
//		while (num1>=num2) {
//			if(num1%2!=0) 				
//				//sum +=num1;
//			//num1++;
//				System.out.println("odd number in reverse order : "+num1);
//				num1--;			
//		}

//System.out.println("sum of even numbers : " +sum);




