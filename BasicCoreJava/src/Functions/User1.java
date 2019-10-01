package Functions;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car fiesta = new car();
		fiesta.wheels = 4;
		fiesta.colour = "silver";
		fiesta.type = "sedan";
		fiesta.accelaration();

		car car2 = new car();
		car2.wheels = 6;
		car2.colour = "Black";
		car2.type = "sedan";
		car2.accelaration();

		car car3=new car();
		
		System.out.println(fiesta.colour);
		System.out.println(car2.colour);
		System.out.println(car3.colour);
		
		System.out.println(fiesta.wheels);
		System.out.println(fiesta.wheels);
		System.out.println(fiesta.wheels);
		
	}

}
