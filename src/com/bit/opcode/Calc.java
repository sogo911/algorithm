package com.bit.opcode;

import java.util.Scanner;
public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[5];
		arr[0] = "+";
		arr[1] = "-";
		arr[2] = "*";
		arr[3] = "/";
		arr[4] = "%";
		int no1 = 0, no2 = 0, result = 0;
		String opcode = "";	
		System.out.print("\t첫번째 숫자를 입력하세요\n");
		no1 = scanner.nextInt();
		System.out.print("\t두번째 숫자를 입력하세요\n");
		no2 = scanner.nextInt();
		System.out.print("\t더하기는 +, 빼기는 -, 곱셈은 *, 나눗샘은 /, 나머지값은 %로 입력해주세요\n");
		opcode = scanner.next();
		if(opcode.equals(arr[0])) {
			result = no1 + no2;
		}else if(opcode.equals(arr[1])){
			result = no1 - no2;
		}else if(opcode.equals(arr[2])) {
			result = no1 * no2;
		}else if(opcode.equals(arr[3])) {
			result = no1 / no2;
		}else if(opcode.equals(arr[4])) {
			result = no1 % no2;
		}
		System.out.printf("%d %s %d = %d",
						no1, opcode, no2, result);
	}
}