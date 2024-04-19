package factory.dp.xmut;

public abstract class Creator { 

	Servlet s = null;
	boolean created = false;
	public void handle(String path,Request r,Response res)
	{
		if(!created)
		{
			s= create();
			s.init(r, res);
		}
		s.service(r, res);
	} 
	protected abstract Servlet create() ;
}
