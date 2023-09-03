package MultiThreading;

public class TestMultiThreading {

	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.start();
		System.out.println(e1.activeCount());
	}
}
	 class Employee extends Thread{
		
		@Override
		public void run() {
			System.out.println("Hello");
		}
	}


