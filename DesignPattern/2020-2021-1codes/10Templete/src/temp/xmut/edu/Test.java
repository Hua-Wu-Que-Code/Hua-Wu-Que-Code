package temp.xmut.edu;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankService bank = new DepositBankService();
		BankService bank1 = new CreditcardBankService();
		DepositAccount de = new DepositAccount("5454545", true);
		CreditAccount cr = new CreditAccount("45412121", false);
		bank.process(de);	
		bank1.process(cr);
	}
}
