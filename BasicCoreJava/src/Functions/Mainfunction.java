package Functions;

public class Mainfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * sum(10,20); sum(381,471); sum(345,458); sum(856,56982365);
		 */
		int add = sum1(10, 20);
		System.out.println(add);
		int add2 = sum1(10, 20, 30);
		System.out.println(add2);

	}

//type 1
	public static void sum(int a, int b) {
		int add = a + b;
		System.out.println(add);

	}

//type2
	public static int sum1(int a, int b) {
		return a + b;

	}

//type3
	public static int sum1(int a, int b, int c) {
		return a + b + c;
	}
}
