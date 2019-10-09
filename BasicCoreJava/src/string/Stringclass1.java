package string;

public class Stringclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "anand";

		String str2 = "anand";
		// 1
		System.out.println(str.length());
		// 2
		System.out.println(str.charAt(3));
		// 3
		System.out.println(str.toUpperCase());
		// 4
		System.out.println(str.toLowerCase());
		// 5
		System.out.println(str.trim());
		// 6
		System.out.println(str.equals(str2));
		//7
		System.out.println(str.equalsIgnoreCase(str2));
		//8
		System.out.println(str.replace("n", "a"));
		//9
		String[] temp=str.split("n");
		for(String s:temp)
		{
			System.out.println(s);
		}
		//10
		System.out.println(str.substring(3));
		
		//11
		System.out.println(str.substring(2, 4));
		//collection is interface and collections is class.
		//collection is interfaces which gives of interfaces and classes to deal with the data which is growing and shrink 

	}

}
