package basicJava;


/*
 * An Array is a container object that  holds the fixed number of values of a single type
 * 
 * Single Dimensional Array
 * Multi-Dimensional Array
 * i)Two Dimensional Array
 * ii)Jagged Array
 */
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//multi Dimensional array
		int[][] i=new int[][] {{5,0},{0,2},{4,0},{0,3},{1,0}};
		//single array
		int[] k= {2,5,3,9,6};

		//jagged Array
		int [][] arr= {
				{1,2},
				{3,4,5,6},
				{7,8,9}};
		int m=0;
		for(int j=0;j<i.length;j++) {
			int[] singleRow=i[j];
			for(m=0;m<singleRow.length;m++) {
				System.out.print(i[j][m] + " ");
			}
			System.out.println();
		}
		int sum=0;
		int l=0;
		int a=k.length;
		while(l<a) {
			sum +=k[l];
			l++;
		}

		System.out.println(sum/a);

		String[] s= {"chai","coffee"};
		String[] p= {"milk","water","coke"};
		String[] t=new String[5];

		//		for(int x=0;x<s.length;x++) {
		//
		//			String t +=s[x];
		//		}

		//System.out.println(s.);
	}

}
