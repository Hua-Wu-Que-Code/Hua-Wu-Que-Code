package ob.xmut.edu;

import java.util.ArrayList;

public class Switcher {

	private ArrayList<DQ> list = new ArrayList();
	
	public void addDQ(DQ dq)
	{
		list.add(dq);
	}
	
	public void removeDQ(DQ dq)
	{
		list.remove(dq);
	}
	
	public void open() //要传入点灯， 只需要Bulb与DQ是类型兼容isa 。
	{
		for(DQ dq: list)
		{
			dq.open();
		}
	}
	
	public void close() //要传入点灯， 只需要Bulb与DQ是类型兼容isa 。
	{
		for(DQ dq: list)
		{
			dq.close();
		}
	}	
}
