package org.hybridinheritance;

public class ElectricalEng extends Engineering {
	private void micro() {
		System.out.println("MicroProcessor & MicroController");
		}
	public static void main(String[] args) {
	ElectricalEng E =new ElectricalEng();
	
	E.micro();
	E.oracle();
	E.html();
	E.pythone();
	E.Cad();
	E.s3d();
	E.E3d();
	
	}

}
