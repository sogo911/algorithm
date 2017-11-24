package com.bit.opcode;

import java.util.Scanner;
public class WhoAreYou {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String n = "";
		System.out.print("이름이 뭐야?\n");
		n = s.next();
		System.out.printf("%s 이구나",
							n);
	}
}