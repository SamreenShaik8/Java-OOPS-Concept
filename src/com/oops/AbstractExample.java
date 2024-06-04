package com.oops;


abstract class vehicle{
	void move() {
		System.out.println("vehicle moves");
	}
//	there is no body for abstract classs
	abstract void start();
}

// with the help of extends keyword we can access the parent class
class car extends vehicle{
	void start() {
		System.out.println("self start");
	}
}
class scooter extends vehicle{
	void start() {
		System.out.println("Kick start");
	}
}




public class AbstractExample {

	public static void main(String[] args) {
//		object creation
		
		car c=new car();
		scooter s=new scooter();
		
		c.start();
		c.move();
		s.start();
		s.move();

	}

}
