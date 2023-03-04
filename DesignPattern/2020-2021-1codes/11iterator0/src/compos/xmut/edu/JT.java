package compos.xmut.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class JT extends Component implements Iterable<Component>{

    protected ArrayList<Component> list = new ArrayList();
    private ArrayList<Component> stuList = new ArrayList<Component>();

	public Iterator<Component> iterator() {
		// TODO Auto-generated method stub
		getAllLeaves(this);
		return stuList.iterator(); 
	}
	
	private void getAllLeaves(JT root)
	{
		for(Component com : root.getList())
			if(com instanceof JT)
				getAllLeaves((JT)com);
			else
				stuList.add(com);	
	}
	
    public ArrayList<Component> getList()
    {
    	return list;
    }
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
