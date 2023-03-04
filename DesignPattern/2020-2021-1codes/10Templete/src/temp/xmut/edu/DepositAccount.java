package temp.xmut.edu;

public class DepositAccount extends BankAccount{
	private int balance = 0;
	
	public DepositAccount(String id, boolean isvip)
	{
		super(id,isvip);
	}
}
