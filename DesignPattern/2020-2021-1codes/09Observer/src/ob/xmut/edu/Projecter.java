package ob.xmut.edu;

public class Projecter extends DQ{
	public Projecter(String id)
	{
		this.id = id;
	}
	protected void openDQ() {
		// TODO Auto-generated method stub
		System.out.println("open projecter,  id :" + this.id);
	}
	protected void closeDQ() {
		// TODO Auto-generated method stub
		System.out.println("close projecter,  id :" + this.id);
	}

	
}
