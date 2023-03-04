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
	
	public void open() //Ҫ�����ƣ� ֻ��ҪBulb��DQ�����ͼ���isa ��
	{
		for(DQ dq: list)
		{
			dq.open();
		}
	}
	
	public void close() //Ҫ�����ƣ� ֻ��ҪBulb��DQ�����ͼ���isa ��
	{
		for(DQ dq: list)
		{
			dq.close();
		}
	}	
}
