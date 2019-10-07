package ExceptionHandling;

public class ThrowKeyWord {

	public static void main(String[] args)

	{

		System.out.println();

	}

	public int divident(int divident, int divisor) throws Exception {
		int ret = 0;

		if (divisor > 0) {
			ret = divident / divisor;

		} else {
			throw new Exception("divisor is zero");

		}
		return ret;
	}
}
