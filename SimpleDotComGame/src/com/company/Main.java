package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		Scanner sc = new Scanner(System.in);
		String result = null;
		do {
			System.out.println("Enter Your guessed number");
			String guess = sc.nextLine();
			result = dot.checkYourself(guess);
		} while ( result != "kill");

	}
}
