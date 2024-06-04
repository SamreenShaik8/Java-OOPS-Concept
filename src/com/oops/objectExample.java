//This  the example for object and class in oops
package com.oops;

class Dog {
	//		example for object
		
   //		has part that in properties
		String name;
		String color;
		double cost;
		
  //		does part that is behavior of dog
		
		void bark() {
			System.out.println("Dog barks");
		}
		void sleep(){
			System.out.println("Dog sleeps");
		}
		void eat() {
			System.out.println("Dog eat");
		}
}

class objectExample{
	public static void main(String[] args) {
		Dog d=new Dog();
		
		// Set properties of the Dog object
        d.name = "Buddy";
        d.color = "Brown";
        d.cost = 100.50;
		d.bark();
		d.eat();
		d.sleep();
		
		// Access and display the Dog's properties
        System.out.println("Name: " + d.name);
        System.out.println("Color: " + d.color);
        System.out.println("Cost: $" + d.cost);
	}
}
		

	

