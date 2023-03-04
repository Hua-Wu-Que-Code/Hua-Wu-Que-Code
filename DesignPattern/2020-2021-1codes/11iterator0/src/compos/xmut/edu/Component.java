package compos.xmut.edu;

public abstract class Component {

	protected String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void takeExam() ;  
	
}
