package ExceptionHandling;

import Functions.AccessModifiers;

public class ExceptionType1 {

	static AccessModifiers acc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[3];

		str[0] = "Anand";
		str[1] = "Bhayre";
		str[2] = "TechBodhi";

		// ArrayIndexOutOfBoundException
		// System.out.println(str[3]);

		// ArithmeticException
		// System.out.println(10/0);

		// NullPointerException
		// acc.publicFunction();

		String add="anand";
		System.out.println(add.charAt(5));
		
	}

}
