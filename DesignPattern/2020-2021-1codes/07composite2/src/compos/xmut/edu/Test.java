package compos.xmut.edu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setName("xiaoming1");
		
		Student s2 = new Student();
		s2.setName("xiaoming2");
		
		StudentClass cl1 = new StudentClass();
		cl1.setName("18»Ì1");
		cl1.addComp(s1);
		cl1.addComp(s2);
		
		Student s3 = new Student();
		s3.setName("xiaoming3");
		
		StudentClass cl2 = new StudentClass();
		cl2.setName("18»Ì2");
		cl2.addComp(s3);
		
		College col = new College();
		col.setName("jsj");
		col.addComp(cl1);
		col.addComp(cl2);
		
		JWC j = new JWC();
		j.startExam(col);
	}

}
