package org.hybridinheritance;

public class Engineering implements ComputerEng, MechanicalEng {

	@Override
	public void oracle() {
		System.out.println("SQL");
		
	}

	@Override
	public void html() {
		System.out.println("html Script");
		
		
	}

	@Override
	public void pythone() {
		System.out.println("C++");
		
	}

	@Override
	public void Cad() {
		System.out.println("Autocad");
		
	}

	@Override
	public void s3d() {
		System.out.println("Smart3D");
		
	}

	@Override
	public void E3d() {
		System.out.println("Everything3D");
	}
	public static void main(String[] args) {
		Engineering Eg =new Engineering();
		
		Eg.oracle();
		Eg.html();
		Eg.pythone();
		Eg.Cad();
		Eg.s3d();
		Eg.E3d();
	}

}
