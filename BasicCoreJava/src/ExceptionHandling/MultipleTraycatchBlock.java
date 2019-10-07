package ExceptionHandling;

import Functions.AccessModifiers;

public class MultipleTraycatchBlock {
	static AccessModifiers acc;

	public static void main(String[] args)

	{
		try {
			String[] str = new String[3];

			str[0] = "Anand";
			str[1] = "Bhayre";
			str[2] = "TechBodhi";

			// ArrayIndexOutOfBoundException
			System.out.println(str[2]);

			// ArithmeticException
			System.out.println(10 / 1);

			// NullPointerException
			acc.publicFunction();

			String add = "anand";
			//StringIndexOutOfBoundsException
			System.out.println(add.charAt(3));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("Finally block");
			System.out.println("Closin of data base connection");
			System.out.println("End Report");
			System.out.println("Clear Cache");
		}

	}

}
