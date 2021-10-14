package com.example;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Main {
	static boolean a;
	public static void main(String[] args) {
		String s = "";
		char c = ' ';
		Scanner keyboard = new Scanner(System.in);
		do
		{
		System.out.println("Enter 'A' for option A " +
		"or 'B' for option B.");
		s = keyboard.next( );
		s=s.toLowerCase( );
		System.out.println(s);
		System.out.println(c);
		}
		while (!((c == 'a') || (c == 'b')));

	}

}
