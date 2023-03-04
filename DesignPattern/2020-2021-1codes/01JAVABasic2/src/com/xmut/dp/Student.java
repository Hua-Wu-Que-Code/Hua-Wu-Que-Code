package com.xmut.dp;

public class Student extends Person implements Talkable{

	
	protected boolean isAgeValid(int age2)
	{
		if (age2 >15 && age2< 35) {
			return true;
		}
		return false;
	}
	private String stID;
	
	public String toString()
	{
		return super.toString() + ", id is: " + this.stID;
	}

	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("i am a student");
		System.out.println(this);
	}
}
