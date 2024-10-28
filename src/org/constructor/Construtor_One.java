package org.constructor;

public class Construtor_One {
	
	public Construtor_One() {
		System.out.println(" Non Paramaeterised construtor");
		

	}
	public Construtor_One(int a){
	System.out.println(" Parameter construtor");	
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Construtor_One b= new Construtor_One();
		@SuppressWarnings("unused")
		Construtor_One c= new Construtor_One();
		
	}

}
