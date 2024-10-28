package org.Interface;

public class India implements SouthIndia, NorthIndia {

	@Override
	public void tamilNadu() {
		System.out.println("Chennai");

	}

	@Override
	public void andraPradesh() {
		System.out.println("Hyderabad");

	}
	
	@Override
	public void madhyaPrasesh() {
		System.out.println("Bhopal");
		
	}

	@Override
	public void uttarPradesh() {
		System.out.println("Lucknow");
		
	}
	public static void main(String[] args) {
		India t = new India();
		t.tamilNadu();
		t.andraPradesh();
		t.madhyaPrasesh();
		t.uttarPradesh();
	}
}
