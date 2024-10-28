package org.scannerclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		try (Scanner S = new Scanner(System.in)) {
			System.out.println("Add two values");
			int a = S.nextInt();
			int b = S.nextInt();
			int c = a + b;
			System.out.println(" The addition value is:");
			System.out.println(c);

			System.out.println("Multiple two values");
			int d = S.nextInt();
			int e = S.nextInt();
			int f = d * e;
			System.out.println(" The Multiple value is:");
			System.out.println(f);
			
			System.out.println("Subtract two values");
			int g = S.nextInt();
			int h = S.nextInt();
			int i = g - h;
			System.out.println(" The subtract value is:");
			System.out.println(i);
			
			System.out.println("divide two values");
			int j = S.nextInt();
			int k = S.nextInt();
			int l = j / k;
			System.out.println(" The divided value is:");
			System.out.println(l);
		}
	}

}
