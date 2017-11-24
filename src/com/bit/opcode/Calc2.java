package com.bit.opcode;

import java.util.Scanner;
public class Calc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nom1 = 0, nom2 = 0, end = 0;
		String op = "";
		System.out.print("첫번째 숫자를 입력하세요!\n");
		nom1 = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요!\n");
		nom2 = scanner.nextInt();
		System.out.print(" +, -, *, /, % 중 필요한 계산법을 입력하세요!\n");
		op = scanner.next();
		if(op.equals("+")) {
			end = nom1 + nom2;
		}else if(op.equals("-")) {
			end = nom1 - nom2;
		}else if(op.equals("*")) {
			end = nom1 * nom2;
		}else if(op.equals("/")) {
			end = nom1 / nom2;
		}else if(op.equals("%")) {
			end = nom1 % nom2;
		}else {System.out.println("계산법을 잘 못 입력하였습니다.");
		}
		System.out.printf("%d %s %d = %d", nom1, op, nom2, end);
	}
}
