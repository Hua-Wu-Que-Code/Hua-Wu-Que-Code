package decro.xmut.edu.cn;

public abstract class DecoratorBasicTank extends Tank {

	protected Tank tank = null;
	
	public DecoratorBasicTank(Tank t)
	{
		this.tank= t;
	}
	public void shoot()
	{
		tank.shoot();
		extraFunc(); //当前类的主要职责
	}
	protected abstract void extraFunc();
}
