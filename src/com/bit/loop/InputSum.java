package com.bit.loop;
/*
 * 사용자가 원하는대로 숫자를 입력하게 하고
 * 0을 누르면 총 누적된 합계를 보여주는 어플
 * */

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("계산이 필요한 숫자를 입력해주세요.");
			int num = scanner.nextInt();
			switch (num) {
			case 0 : 
				System.out.println(sum);
				return;
			default: 
				System.out.println("계산이 필요한 +,- 기호를 입력하세요.");
				String op = scanner.next();
				switch (op) {
				case "+":
					sum += num;
					break;
				case "-":
					sum -= num;
					break;
				}
			}
		}
	}
}
