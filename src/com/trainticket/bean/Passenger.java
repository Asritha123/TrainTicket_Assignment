package com.trainticket.bean;

public class Passenger {
	
	String name;
	int age;
	char  gender;
	public Passenger(String s, int i, char ch) {
		// TODO Auto-generated constructor stub
	}
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
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public int compareTo(Passenger o) {
		// TODO Auto-generated method stub
		if(this.getAge()>o.getAge())
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	

}
