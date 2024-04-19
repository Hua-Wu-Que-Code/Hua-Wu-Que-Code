package compos.xmut.edu;

public class Student extends Component{ //Student is_a Component

	private String name = null;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void takeExam() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " takes an exam!");
	}

}
