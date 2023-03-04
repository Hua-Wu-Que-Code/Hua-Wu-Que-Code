package compos.xmut.edu;

import java.util.ArrayList;

public class JT extends Component {

    protected ArrayList<Component> list = new ArrayList();
	
	public void addComp(Component s)
	{
		list.add(s);
	}
	public void rmComp(Component s)
	{
		list.remove(s);
	}
	public void takeExam() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " takes an exam");
		for(Component s : list)
			s.takeExam();
		
	}

}
