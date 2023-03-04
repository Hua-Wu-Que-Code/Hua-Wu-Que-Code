package decro.xmut.edu.cn;

public class LXTank extends DecoratorBasicTank {

	public LXTank(Tank t )
	{
		super(t);
	}

	protected void extraFunc() {
		// TODO Auto-generated method stub
		System.out.println("ls + ");
	}

}
