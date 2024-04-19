package stra.xmut;

public class Teacher implements Comparable<Teacher> {

	private String name = null;
	private int age;
	
	public Teacher(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "name is : " + this.name;
	}
	
	public int compareTo(Teacher o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}

}
