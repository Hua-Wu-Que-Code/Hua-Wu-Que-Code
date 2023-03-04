package com.xmut.dp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s  = new Student();//对象引用， 对象
		s.setAge(24);
		s.setName("xiaowang");
		
		Teacher t = new Teacher();
		t.setName("laowang");
		t.setAge(45);
		
		Worker w = new Worker();
		
		System.out.println(t);
		System.out.println(s.toString());
		
		Reporter re = new Reporter();
		re.interview(s);//s is a Talkable
		re.interview(t);
		re.interview(w);  
	}

}
