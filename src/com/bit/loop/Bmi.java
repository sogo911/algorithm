package com.bit.loop;
/*
BMI 지수
고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만 
*/
import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String res = "";
		int d = 0;
		System.out.println("측정하실 인원을 입력하세요.");
		d = a.nextInt();
		for(int i = 0; i < d; i++) {
			Scanner s = new Scanner(System.in);
			double h = 0, w = 0, b = 0;
			String name = "", bmi = "";
			System.out.println("이름을 입력해주세요.");
			name = s.next();
			System.out.println(name+"님의 키를 M(미터) 단위로 입력하세요.");
			h = s.nextDouble();
			System.out.println(name+"님의 몸무게 kg 단위로 입력하세요.");
			w = s.nextDouble();
			b = w / (h * h);
			if(b >= 35) {
				bmi = "고도비만 입니다.";
			}else if(b >= 30 && b < 35) {
				bmi = "중등도 비만(2단계 비만) 입니다.";
			}else if(b >= 25 && b < 30) {
				bmi = "경도 비만(1단계 비만) 입니다.";
			}else if(b >= 23 && b <= 24.9) {
				bmi = "과체중 입니다.";
			}else if(b >= 18.5 && b <= 22.9) {
				bmi = "정상 입니다.";
			}else if(b < 18.5) {
				bmi = "저체중 입니다.";
			}else {
				bmi = "다시 입력해주세요.";
			}	
			res += String.format("%s님의 상태는 %s \n",name,bmi);
		}
		System.out.print(res);
	}
}
