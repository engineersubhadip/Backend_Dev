package LooseCoupling;

public class YesBank implements BankAPI {

	@Override
	public void checkBalance() {
		System.out.println("Checking Balance in YesBank....");

	}

	@Override
	public void transferMoney() {
		System.out.println("Transfering Money in YesBank....");

	}

}
