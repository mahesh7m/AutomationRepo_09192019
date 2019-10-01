package arrays;

public class Twodimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] str = new String[4][2];
//Row 1
		str[0][0] = "Username1";
		str[0][1] = "Password1";

//Row 2
		str[1][0] = "Username2";
		str[1][1] = "Password2";

//Row 3
		str[2][0] = "Username3";
		str[2][1] = "Password3";

//Row 4
		str[3][0] = "Username4";
		str[3][1] = "Password4";

		for (int r = 0; r <str.length; r++) {

			for (int c = 0; c <str[r].length; c++) {
				System.out.println(str[r][c]);
			}

		}
	}
}
