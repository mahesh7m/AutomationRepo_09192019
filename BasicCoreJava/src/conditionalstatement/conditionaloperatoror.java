package conditionalstatement;

public class conditionaloperatoror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pcm = 60;
		int jre = 30;
		int cet = 60;

		if (pcm >= 60) {
			if (jre >= 30 || cet >= 60)

			{
				System.out.println("you are eligible");

			} else {
				System.out.println("you are not eligible");
			}
		}

		else {
			System.out.println("you are not eligible");

		}
	}
}
