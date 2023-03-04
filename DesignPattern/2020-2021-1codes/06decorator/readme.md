JAVA IO采用的就是装饰器模式。 

//不满足开闭原则
public class Tank {

	public void shoot()
	{
	
		System.out.println("shoot!");
	}
}

继承的方式来实现，子类爆炸的问题，随意加个功能，需要增加很多的子类。

委托的方式。 增加一个功能只需要增加一个子类，构建对象的时候通过装饰形成委托链。

