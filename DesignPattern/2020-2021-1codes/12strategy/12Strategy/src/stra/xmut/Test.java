package stra.xmut;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher s1 = new Teacher("xiaowang", 24);
		Teacher s2 = new Teacher("xiaoming", 21);
		Teacher s3 = new Teacher("xiaoxiao", 20);
		Comparable[] list = {s1,s2,s3};
		
		
		
		for (int i = 0; i < 100; i++) {
			Sorting s = getSortingInstance();
			s.sort(list); //
			for(Comparable c : list)
			{
				System.out.println(c);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

	private static Sorting getSortingInstance() {
		// TODO Auto-generated method stub
		String className = OneLineString2.readLine("./conf.md");
		System.out.println(className);
		
		Sorting s = null;
		try {
			Class c = Class.forName(className);
			try {
				s = (Sorting)c.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}

}
