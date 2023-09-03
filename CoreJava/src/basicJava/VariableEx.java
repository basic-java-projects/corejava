package basicJava;
public class VariableEx {
	//Global Variable
	//instance variable
	//to access these variables we need to create a object for that class
	public String name="Siva"; 
	
	//class variable or static variable
	static int age=26;
	
	public static void main(String[] args) {
		
		VariableEx v=new VariableEx();
		System.out.println(v.name);
		System.out.println(age);
		
		qualification(23);

	}
	//Local variables
	//parameters
	public static void qualification(int year)
	{
		year=2019;
		
		//method variable
		String degree="B.tech";
		
		System.out.println(year);
		System.out.println(degree);
		
	}

}
