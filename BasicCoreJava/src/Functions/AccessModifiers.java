package Functions;

public class AccessModifiers {
	public static void main(String[] args) {
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessModFunction();
		obj.protectedFunction();
		
	}
	public void publicFunction()
	{
		System.out.println("Public function");
	}
private void privateFunction()
{
	System.out.println("Private function");
}
void noAccessModFunction()
{
	System.out.println("No Access Mod. function");
}
protected void protectedFunction()
{
	System.out.println("Protected function");
	
}
}
