package com.bit.opcode;

import java.util.Scanner;
public class CalcSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[5];
		arr[0] = "첫번째 숫자를 입력하세요!\n";
		arr[1] = "연산자를 입력하세요!\n";
		arr[2] = "두번째 숫자를 입력하세요!\n";
		arr[3] = "연산자만 입력하세요!\n";
		arr[4] = "%";
		int no1 = 0, no2 = 0, end = 0;
		String op = "";
		boolean ok = true;
		System.out.print(arr[0]);
		no1 = scanner.nextInt();
		System.out.print(arr[1]);
		op = scanner.next();
		System.out.print(arr[2]);
		no2 = scanner.nextInt();
		switch(op) {
		case "+": end = no1 + no2;
			break;
		case "-": end = no1 - no2;
			break;
		case "*": end = no1 * no2;
			break;
		case "/": end = no1 / no2;
			break;
		case "%": end = no1 % no2;
			break;
		default:
			ok = false;
			break;
		}
		if(!ok) {
				System.out.print(arr[3]);
		}else {
			System.out.printf("%d %s %d = %d", no1, op, no2, end);	
		}
	}
}