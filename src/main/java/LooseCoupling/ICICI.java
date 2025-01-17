package LooseCoupling;

public class ICICI implements BankAPI {

	@Override
	public void checkBalance() {
		System.out.println("Checking Balance in ICICI....");

	}

	@Override
	public void transferMoney() {
		System.out.println("Transfering Money in ICICI....");

	}

}
