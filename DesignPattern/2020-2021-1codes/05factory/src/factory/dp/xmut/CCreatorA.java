package factory.dp.xmut;

public class CCreatorA extends Creator{

	@Override
	protected Servlet create() {
		// TODO Auto-generated method stub
		return new CServletA(); 
	}

}
