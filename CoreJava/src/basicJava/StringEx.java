package basicJava;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Siva";
		String s2="teja";
		String s3="siva";
		System.out.println(s1.startsWith("s"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.contains("i"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.toCharArray());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.indexOf(0));
		System.out.println(s2.lastIndexOf(0));
		System.out.println(s1.substring(1,2));
		System.out.println(s2.split("// "));
		System.out.println(Array.(s1.charAt(0)));
	}

}
