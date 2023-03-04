package facotry.xmut.edu;

public class Servlet {

	public void init(Request re, Response res) {
		// TODO Auto-generated method stub
		
	}

	public void service(Request re, Response res) {
		// TODO Auto-generated method stub
		System.out.println("login check servlet");
		//判断具体是什么请求，假设是post
		doPost(re,res); 
		
	}

	protected void doPost(Request re, Response res) {
		// TODO Auto-generated method stub
		
	}

}
