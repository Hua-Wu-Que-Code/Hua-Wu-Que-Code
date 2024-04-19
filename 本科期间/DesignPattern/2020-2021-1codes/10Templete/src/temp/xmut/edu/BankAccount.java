package temp.xmut.edu;

public class BankAccount {
	protected boolean vip = false;
	protected String id;
	
	public BankAccount(String id, boolean isvip)
	{
		this.id = id;
		this.vip = isvip;
		
	}
	public boolean isVIP() {
		// TODO Auto-generated method stub
		return this.vip;
	}
	public String getAccountID() {
		// TODO Auto-generated method stub
		return this.id;
	}
}
