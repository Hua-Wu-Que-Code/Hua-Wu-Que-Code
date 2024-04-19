package facotry.xmut.edu;

public class Creator {

	protected boolean created = false;
	Servlet s = null;
	public void handle(Request re, Response res) {
		// TODO Auto-generated method stub
		if (!created) {
			s = createServlet();
			s.init(re, res);
		}
		s.service(re, res);
	}
	protected Servlet createServlet() {
		// TODO Auto-generated method stub
		return null; 
	}
}
