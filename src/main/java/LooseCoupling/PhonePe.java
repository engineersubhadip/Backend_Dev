package LooseCoupling;

public class PhonePe {
	BankAPI api = new ICICI();

	void checkBalance() {
		api.checkBalance();
	}

	void transferMoney() {
		api.transferMoney();
	}
}
