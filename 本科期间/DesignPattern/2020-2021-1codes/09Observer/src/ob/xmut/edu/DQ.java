package ob.xmut.edu;

public abstract class DQ {

	protected String id;
	protected boolean isOpen = false;
	public  void open()
	{
		if (!isOpen) {
			isOpen = true;
			openDQ();
		}
	}
	protected abstract void openDQ() ;
	public void close()
	{
		if (isOpen) {
			isOpen = false;
			closeDQ();
		}
	}
	protected abstract void closeDQ();
}
