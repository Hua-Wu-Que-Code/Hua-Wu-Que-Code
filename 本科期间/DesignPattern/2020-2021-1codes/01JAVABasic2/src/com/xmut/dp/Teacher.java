package com.xmut.dp;

public class Teacher extends Person implements Talkable{

	private String tID;
	
	public String toString()
	{
		return super.toString() + ", id is: " + this.tID;
	}

	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("i am a teacher");
		System.out.println(this);
	}
	
	protected boolean isAgeValid(int age2)
	{
		if (age2 >25 && age2< 85) {
			return true;
		}
		return false;
	}
}
