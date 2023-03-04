package temp.xmut.edu;

public abstract class BankService {

	public void process(BankAccount a)
	{
		//30rows 
		//取号
		quhao(a);
		//30rows 
		//排队
		paidui(a);
		//业务办理
		ywbl(a);
	}

	protected abstract void ywbl(BankAccount a);

	private void paidui(BankAccount a) {
		// TODO Auto-generated method stub
		if(a.isVIP())
			System.out.println("VIP waiting line , " + a.getAccountID());
		else
			System.out.println("not waiting line, " + a.getAccountID());
	}

	private void quhao(BankAccount a) {
		// TODO Auto-generated method stub
		if(a.isVIP())
			System.out.println("VIP num , " + a.getAccountID());
		else
			System.out.println("not VIP num , " + a.getAccountID());
	}
}
