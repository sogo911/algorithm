package com.bit.opcode;

import java.util.Scanner;

public class Ssn {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {
				"이름을 입력하세요 : ",
				"주민번호를 - 까지 포함하여 입력하세요 : ",
				"남자","여자","외국인",
				"다시 입력하세요"
		};
		boolean p = true ;
		String name = "", ssn = "", gender = "", test = "";
		System.out.print(arr[0]);
		name = s.next();
		System.out.print(arr[1]);
		ssn = s.next();
		char ch = ssn.charAt(7);
		
		if ( ch == '1' || ch == '3' ) {
			gender = arr[2];
		}else if (ch == '2' || ch == '4' ) {
			gender = arr[3];
		}else if (ch == '5' || ch == '6' ) {
			gender = arr[4];
		}else if ( ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			p = false;
		}else {
		}
		if ( p = false ) {
			test = arr[5];
		}else {
		}
		System.out.println(test);
	}
}