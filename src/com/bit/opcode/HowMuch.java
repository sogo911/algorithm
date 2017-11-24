package com.bit.opcode;

import java.text.Format;
import java.util.Scanner;
public class HowMuch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[9];
		arr [0] = "사과 한개에 얼마에요?\n";
		arr [1] = "100원 입니다.\n";
		arr [2] = "몇개 드릴까요? ";
		arr [3] = "비싸요! 깍아주세요.\n";
		arr [4] = "몇% 할인해드릴까요? ";
		arr [5] = "꺼져!\n";
		arr [6] = "%d개 주세요\n";
		arr [7] = "사과 %d개는 %d원 입니다.\n";
		arr [8] = "%d" + "%% 할인해서 %d원 입니다.";
		int num1 = 0, numsum = 0, dc = 0, dcsum = 0;
		System.out.print(arr [0]);
		System.out.print(arr [1]);
		System.out.print(arr [2]);
		num1 = scanner.nextInt();
		System.out.printf(arr [6],num1);
		numsum = 100 * num1 ;
		System.out.printf(arr [7],num1, numsum);
		System.out.print(arr [3]);
		System.out.print(arr [4]);
		dc = scanner.nextInt();
		if (dc<10) {
			dcsum = numsum-(numsum*dc/100);
			System.out.printf(arr [8], dc, dcsum);
			}else {
			System.out.print(arr [5]);
		}
	}
}
