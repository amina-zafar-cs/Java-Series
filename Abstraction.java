import java.util.*;
public class Abstraction{

	public static void main(String args[]){

		
	Horse h1=new Horse();

	h1.walk();
	h1.eat();
	h1.getcolor();
		
		
		
		
	}
		
	

}


abstract class Animal{

	String color;

	Animal(){

		System.out.println("Abstract constructor is called");
		color="brown";
		

	}
	void eat(){

		System.out.println("eats");


	}

	abstract void walk();




}

class Horse extends Animal{

	Horse(){
		System.out.println(" hORSE CONSTRUCTOR IS CALLED ");


	}
	void walk(){

		
		System.out.println(" on 2 legs ");

	}

	void getcolor(){

		System.out.println(" Color of horse is: "+color);


	}



}







