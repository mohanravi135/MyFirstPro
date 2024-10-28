package org.java;
public class College {
	public void studentName() {
		System.out.println("Mohan Kumar");
	}
		public void studentAge() {
			System.out.println("35");
		}
			public void studentFrom() {
				System.out.println("Thiruvallur");
			}
			public void studentNumber() {
				System.out.println("8883404786");
			}
			public void studentMailId() {
				System.out.println("mohanravi135@gmail.com");
				
		
	}
			/*public void studendcolor1() {
				System.out.println("Black");
			}
			public void studentcolor2() {
				System.out.println("white");
				
		
	}*/
	public static void main(String[] args) {
		College info = new College();
		info.studentName();
		info.studentAge();
		info.studentFrom();
		info.studentNumber();
		info.studentMailId();
		//info.studendcolor1();
		//info.studentcolor2();
	}
}

