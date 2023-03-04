package factory.dp.xmut;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TomcatClient c = new TomcatClient();	
		c.handleRequest("/login.do", new Request(), new Response());	
	}
}
