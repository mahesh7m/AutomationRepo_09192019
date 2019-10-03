package loops;

import Functions.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModAtProjectLevel obj2= new TestAccessModAtProjectLevel();
		obj2.protectedFunction();
		

	}

}
