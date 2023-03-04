package ob.xmut.edu;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Switcher sw = new Switcher();
		DQ d1 = new Bulb("2122522");
		DQ d2 = new Projecter("2122334");
		DQ d3 = new Fan("5464654");
		DQ d4 = new Bulb("2122529");
		/*sw.open(d1); // use a “¿¿µ £¨ has a , 
		sw.open(d2);
		sw.close(d1);
		sw.close(d2);*/
		
		sw.addDQ(d1);
		sw.addDQ(d2);
		sw.addDQ(d3);
		sw.addDQ(d4);
		sw.open();
		sw.close();
		sw.close();
	}

}
