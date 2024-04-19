package dp.xmut.edu.cn;

public class Single {

	private static Single s = null;
		
	private Single()
	{}
	
	public synchronized static Single getInstance() //实例化函数，必须由对象调用，
	{
		if (s == null) {
			try { 
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s= new Single();
		}
		return s;
	}
}
