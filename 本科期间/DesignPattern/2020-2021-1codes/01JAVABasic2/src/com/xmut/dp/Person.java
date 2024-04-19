package com.xmut.dp;

public abstract class Person {

	protected String name ;
	protected int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (isAgeValid(age)) {
			this.age = age;
		}
	}

	protected abstract boolean isAgeValid(int age2);

	public String toString()
	{
		return "name is : " + this.name + ", age is: "+this.age;
	}

}
