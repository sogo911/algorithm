package com.bit.loop;

import java.util.Scanner;

public class InfiniteDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[메뉴] : {0버튼} 정지 , {1버튼} bmi");
			int flag = scanner.nextInt();
			switch (flag) {
			case 0 : System.out.println("시스템이 종료 되었습니다.");
				return;
			case 1 : 
				break;
			default:
				}
			}
		}
	}
