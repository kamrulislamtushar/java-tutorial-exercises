package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int random = (int) (Math.random() * 5);
		int[] locations = {random, random + 1, random +2};
		boolean isAlive = true;
		dot.setLocationCells(locations);
		Scanner sc = new Scanner(System.in);
		String result = null;
		int numberOfGuesses = 0;
		while (isAlive) {
			System.out.println("Enter Your guessed number");
			String guess = sc.nextLine();
			numberOfGuesses++;
			result = dot.checkYourself(guess);
			if (result.equals("kill")) {
				isAlive = false;
			}
		}
		System.out.println("You took "+ numberOfGuesses + " guesses");
	}
}
