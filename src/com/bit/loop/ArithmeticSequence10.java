package com.bit.loop;
/*
 Algorithm 10번 문제
 1+2+3+4....+100 의 합계
 overriding[오버라이딩]  기존값을 삭제하고 마지막 값만 추가 (디폴트)
 overload[오버로드] 기존값을 삭제하지 않고 추가 ( 명령어 : +)
 * */
public class ArithmeticSequence10 {
	public static void main(String[] args) {
		// 1 + 2+ 3 .... +10
		String t = "";
		int r = 0;
		for(int i = 1; i <= 100; i++) {
			if(i == 100 ) {
				t += i + "=";
			}else {
				t += i + "+";
			}
			
			r += i;
		}
		System.out.println(t+r);
	}
}