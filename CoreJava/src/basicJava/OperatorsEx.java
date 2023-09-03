package basicJava;

public class OperatorsEx {

	//Addition ,Subtraction ,Multiplication,Division and Modulus
	public static void Arthimetic(){
		int x=5;
		int y=5;
		
		System.out.println("x+y is :"+(x+y));
		System.out.println("x+y is :"+(x-y));
		System.out.println("x+y is :"+(x*y));
		System.out.println("x+y is :"+(x%y));
		System.out.println("x+y is :"+(x/y));
	
		
	}
	//Increment and Decrement
	public static void unary() {
		int x=10;
		System.out.println(x);//10
		System.out.println(x++);//10
		System.out.println(++x);//12
		System.out.println(x);//12
		
		System.out.println(x--);//12
		System.out.println(--x);//10
		System.out.println(x);//10
	}
	// > < >= <= == !=
	public static void  Relational() {
		int i=10;
		int j=20;
		System.out.println(i>j);
		System.out.println(i<j);
		System.out.println(i>=j);
		System.out.println(i<=j);
		System.out.println(i==j);
		System.out.println(i!=j);
		
	}
	// && or ||
	public static void Conditional() {
		int i=10;
		int j=20;
		System.out.println(i>j &&i==j);
		System.out.println(i>j || i<j);
	}
	// = += -= *= /= %=
	public static void Assignment() {
		int i=10;
		
		i +=5;
		System.out.println(i);
		i -=5;
		System.out.println(i);
		i *=5;
		System.out.println(i);
		i /=5;
		System.out.println(i);
		i %=5;
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arthimetic();
		unary();
		Relational();
		Conditional();
		Assignment();
		

	}

}
