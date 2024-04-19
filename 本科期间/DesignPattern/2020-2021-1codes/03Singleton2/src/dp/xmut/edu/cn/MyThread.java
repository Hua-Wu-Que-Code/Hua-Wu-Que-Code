package dp.xmut.edu.cn;

public class MyThread extends Thread {

	public void run()
	{
		Single s = Single.getInstance();
		System.out.println(s);
	}
}
