package org.exception;

import java.util.Scanner;

public class InputMisMatch {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int nextInt =s.nextInt();
			System.out.println(nextInt);
		}
	}

}
