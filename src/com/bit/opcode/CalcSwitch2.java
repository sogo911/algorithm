package com.bit.opcode;

import java.util.Scanner;
public class CalcSwitch2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no1 = 0, no2 = 0, end = 0;
		String op = "", test = "";
		boolean ok = true;
		System.out.print("첫번째 숫자를 입력하세요!\n");
		no1 = scanner.nextInt();
		System.out.print("연산자를 입력하세요!\n");
		op = scanner.next();
		System.out.print("두번째 숫자를 입력하세요!\n");
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
		if(ok) {
			test = String.format("%d %s %d = %d", no1, op, no2, end);	
		}else {
			test = "연산자만 입력하세요!";
//			System.out.printf("%d %s %d = %d", no1, op, no2, end);	
		}
		System.out.print(test);
	}
}