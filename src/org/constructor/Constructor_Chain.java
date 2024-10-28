package org.constructor;

public class Constructor_Chain {
	
	public Constructor_Chain(int No) {
		System.out.println("Car Number:" +No);
		
	}
	public Constructor_Chain(String Name) {
		this(1465);
		System.out.println("Car Name:" +Name);
	}
	
	public Constructor_Chain(float Milage) {
		this("Swift");
		System.out.println("Car Milage:" +Milage);
	}
	
	public Constructor_Chain() {
		this(15.5f);
		System.out.println("Car Details" );
	}
	

	public static void main(String[] args) {
		
		
		@SuppressWarnings("unused")
		Constructor_Chain cc= new Constructor_Chain();
		
	}

}
