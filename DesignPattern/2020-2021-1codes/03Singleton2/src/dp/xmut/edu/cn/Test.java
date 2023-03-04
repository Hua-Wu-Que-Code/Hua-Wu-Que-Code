package dp.xmut.edu.cn;

public class Test {
	public static void main(String[] args) {
		/*Single s = Single.getInstance(); // public Single()
		Single s2 = Single.getInstance();
		if (s == s2) {
			System.out.println("the same instance");
		} else {
			System.out.println("not the same instance");
		}*/
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		th1.start();
		th2.start();
		//
	}
}
