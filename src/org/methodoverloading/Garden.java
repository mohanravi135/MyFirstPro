package org.methodoverloading;

public class Garden {
	public void flower(int a) {
		System.out.println(a);
		
	}
	public void flower (String name) {
		System.out.println(name);
	}
	public void flowere(double b) {
		System.out.println(b);
		
	}
	public void flower(char c, String name) {
		System.out.println(c +""+ name);
		
	}
	
	public  void flower(char i,String name, int n) {
		System.out.println(i+" "+name+" "+n);
		
	}
	
	public static void main(String[] args) {
		Garden t =new Garden();
		t.flower(1);
		t.flower("Rose");
		t.flower("12.5");
		t.flower('R'+" "+"Rose");
		t.flower('A',"Welcome Garden",10);
	
	}

}
