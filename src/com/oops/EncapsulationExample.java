package com.oops;


class Student{
	private String name;
	private int age;
	private int password;
	
//	setter method
	public void setName(String nm) {
		name=nm;
	}
	public void setAge(int ag) {
	    age=ag;
	}
	public void setPasswordr(int pwd) {
		password=pwd;
	}
	
//	getter method to access the data
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
		
	}
	public int getPassword() {
		return password;
	}
}
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		object creation
		Student s=new Student();
		s.setName("samreen");
		s.setAge(22);
		s.setPasswordr(123);
		
		Student s1=new Student();
		s1.setName("virat");
		s1.setAge(30);
		s1.setPasswordr(143);
		
		
		
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getPassword());
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getPassword());;

	}

}
