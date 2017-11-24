package com.bit.opcode;

import java.util.Scanner;
public class Calc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = {
				"첫번째 숫자를 입력하세요!\n",
				"두번째 숫자를 입력하세요!\n",
				" +, -, *, /, % 중 필요한 계산법을 입력하세요!\n",
				"+","-","*","/","%",
				"계산법을 잘 못 입력하였습니다.\n",
				"%d %s %d = %d"
		};
		int nom1 = 0, nom2 = 0, end = 0;
		String op = "";
		System.out.print(arr[0]);
		nom1 = scanner.nextInt();
		System.out.print(arr[1]);
		nom2 = scanner.nextInt();
		System.out.print(arr[2]);
		op = scanner.next();
		if(op.equals(arr[3])) {
			end = nom1 + nom2;
		}else if(op.equals(arr[4])) {
			end = nom1 - nom2;
		}else if(op.equals(arr[5])) {
			end = nom1 * nom2;
		}else if(op.equals(arr[6])) {
			end = nom1 / nom2;
		}else if(op.equals(arr[7])) {
			end = nom1 % nom2;
		}else {System.out.print(arr[8]);
		}
		System.out.printf(arr[9], nom1, op, nom2, end);
	}
}
