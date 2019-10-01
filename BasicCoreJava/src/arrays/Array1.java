package arrays;

public class Array1 {

	public static void main(String[] args) {

		String[] str = new String[10];
		str[0] = "Animesh";
		str[1] = "mahesh";
		str[2] = "Babasaheb";
		str[3] = "shubhada";
		str[4] = "aishwarya";
		str[5] = "anand";
		str[6] = "amit";
		str[7] = "shubhangee";
		str[8] = "bhushan";
		str[9] = "nikhil";
		// System.out.println(str.length);
		// for (int i = 0; i <str.length; i++)
		// System.out.println(str[i]);
		for (String s : str) {
			System.out.println(s);
		}

	}

}
