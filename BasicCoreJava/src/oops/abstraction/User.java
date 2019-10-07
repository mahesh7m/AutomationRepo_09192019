package oops.abstraction;

public class User {
	public static void main(String[] args) {

		RBI acc;
		acc = new PNB();

		acc.CurrentAccount();
		acc.SavingAccount();
		acc.DebitCard();
		acc.CreaditCard();

		acc = new SBI();

		acc.CurrentAccount();
		acc.SavingAccount();
		acc.DebitCard();
		acc.CreaditCard();

		acc = new Canara();
		acc.CurrentAccount();
		acc.SavingAccount();
		acc.DebitCard();
		acc.CreaditCard();

	}

}
