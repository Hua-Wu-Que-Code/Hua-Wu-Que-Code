package facotry.xmut.edu;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TomcatClient client = new TomcatClient();
		Request r = new Request();  //HTTP����Э��
		Response res = new Response();
		client.handleRequest(r, res);	
	}
}
