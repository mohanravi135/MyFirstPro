package org.abstactclass;

public class OtherBank extends Bank {
	
	public void goldlaon() {
		System.out.println("12%");
		
	}

	public static void main(String[] args) {
		OtherBank ob=new OtherBank();
		ob.goldlaon();
		ob.educationLoan();
		ob.personalLoan();
		ob.vehicleLoan();
		ob.homeLoan();
	}

}
