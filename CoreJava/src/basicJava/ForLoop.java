package basicJava;

public class ForLoop {

	public static void main(String[] args) {
		int i;
		int[] arr= {1,2,3,4,5,6};
		for( i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		/**
		 * 
		 * syntax for each loop
		 * for(dataType variable:arrayOrCollection)
		 * {
		 * }
		 */
		int [][] ar= {
				{1,2},
				{3,4},
				{5,6}};
		int sum=0;
		int noOfElements=0;

		for(int[] singleDimArray:ar) {
			for(int value:singleDimArray) {
				sum +=value;
				noOfElements++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/noOfElements);

	}


}
