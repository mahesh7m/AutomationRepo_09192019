package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		String[] str = new String[3];

		str[0] = "Anand";
		str[1] = "Bhayre";
		str[2] = "TechBodhi";

		try {
		// ArrayIndexOutOfBoundException
		System.out.println(str[3]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			
		}
		try {
		// ArithmeticException
	 System.out.println(10/0);
		}catch(ArithmeticException e) 
		{
			System.out.println(e.getMessage());
			
		}
		// NullPointerException
		// acc.publicFunction();

		String add = "anand";
		try {
		//StringIndexOutOfBoundsException
		System.out.println(add.charAt(5));
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			
		}
		System.out.println("Testing completed");

	}

}
