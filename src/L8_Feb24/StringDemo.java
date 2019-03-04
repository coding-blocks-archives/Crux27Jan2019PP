package L8_Feb24;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 24-Feb-2019
 *
 */

public class StringDemo {

	public static void main(String[] args) {

		String str = "hello";
		// String s1 = "hello" ;
		//
		// String s2 = new String("hello") ;
		// String s3 = new String("hello") ;

		// length
		System.out.println(str.length());

		// charAt
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(str.length() - 1));

		// substring
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(0, 4)); // hell
		System.out.println(str.substring(0, 5)); // hello
		System.out.println(str.substring(5, 5)); // ""
		System.out.println(str.substring(2));

		// concatenate
		String s1 = "hello";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s3);
		String s4 = s1.concat(s2);
		System.out.println(s4);

		// indexOf
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("eL"));

		// startsWith
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("he"));

		// equals and ==
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");

		System.out.println((s1 == s2) + ", " + s1.equals(s2)); // true true
		System.out.println((s1 == s3) + ", " + s1.equals(s3)); // true true
		System.out.println((s1 == s4) + ", " + s1.equals(s4)); // false true

		str = str.replace('l', 'b');
		System.out.println(str);

		long start = System.currentTimeMillis();
		appendString();
		long end = System.currentTimeMillis();

		System.out.println(end - start);
	}

	public static void appendString() {

		int n = 1_00_00_0;
		
		// String str = "";
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			// str += i ;
			sb.append(i);
		}

	}

}
