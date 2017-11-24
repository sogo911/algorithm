package com.bit.opcode;

import java.util.Scanner;
public class WhoAreYou {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {
				"이름이 뭐야?\n",
				"기억하겠어 %s"
		};
		String n = "";
		System.out.print(arr[0]);
		n = s.next();
		System.out.printf(arr[1],n);
	}
}