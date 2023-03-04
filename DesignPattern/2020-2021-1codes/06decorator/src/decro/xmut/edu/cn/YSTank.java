package decro.xmut.edu.cn;

public class YSTank extends DecoratorBasicTank {
	
	public YSTank(Tank t )
	{
		super(t);
	}

	protected void extraFunc() {
		// TODO Auto-generated method stub
		System.out.println("ys + ");
	}
	
}
