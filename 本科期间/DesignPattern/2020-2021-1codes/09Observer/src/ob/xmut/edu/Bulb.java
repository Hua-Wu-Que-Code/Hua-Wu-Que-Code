package ob.xmut.edu;

public class Bulb extends DQ{

	public Bulb(String id)
	{
		this.id = id;
	}
	protected void openDQ() {
		// TODO Auto-generated method stub
		System.out.println("open bulb, id :" + this.id);
	}
	protected void closeDQ() {
		// TODO Auto-generated method stub
		System.out.println("close bulb, id :" + this.id);
	}
}
