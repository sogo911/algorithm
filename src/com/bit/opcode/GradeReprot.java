package com.bit.opcode;

import java.util.Scanner;
public class GradeReprot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor = 0, eng = 0, math = 0, avg = 0;
		String name = "", grade = "" ;
		System.out.print("이름입력\n");
		name = scanner.next();
		System.out.print("국어점수입력\n");
		kor = scanner.nextInt();
		System.out.print("영어점수입력\n");
		eng = scanner.nextInt();
		System.out.print("수학점수입력\n");
		math = scanner.nextInt();
		avg = (kor + eng + math) / 3;
		switch(avg/10) {
		case 10:		
		case 9: grade = "A";
		break;
		case 8: grade = "B";
		break;
		case 7: grade = "C";
		break;
		case 6: grade = "D";
		break;
		case 5: grade = "E";
		break;
		default: grade = "F";
		break;
		}
		System.out.printf("%s님의 평균점수는 %d점이며  %s 학점 입니다.", name, avg, grade);
	}
}
