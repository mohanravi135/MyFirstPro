package org.multipleinheritance;

public class Seasons implements Summer, Winter {

	@Override
	public void April() {
		System.out.println("Early Summer");
		
	}

	@Override
	public void May() {
		System.out.println("Summer is very hot");
		
	}

	@Override
	public void June() {
		System.out.println("End of the Summer");
		
	}

	@Override
	public void December() {
		System.out.println("Early Winter");
		
	}

	@Override
	public void January() {
		System.out.println("Winter is very cool");
		
	}

	@Override
	public void February() {
		System.out.println("End of the Winter");
		
	}
	
	public static void main(String[] args) {
		Seasons s = new Seasons();
		s.April();
		s.May();
		s.June();
		s.December();
		s.January();
		s.February();
		
		
	}

}

 
