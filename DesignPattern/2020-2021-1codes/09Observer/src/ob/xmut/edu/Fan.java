package ob.xmut.edu;

public class Fan extends DQ {

	public Fan(String id)
	{
		this.id = id;
	}
	@Override
	protected void openDQ() {
		// TODO Auto-generated method stub

		System.out.println("open Fan, id :" + this.id);
	}

	@Override
	protected void closeDQ() {
		// TODO Auto-generated method stub
		System.out.println("close Fan, id :" + this.id);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
