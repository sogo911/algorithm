package com.bit.loop;
// 1 ~ 100 까지 홀수의 합
// modular %
// 1 % 2 = 1
// 2 % 2 = 0
// 3 % 2 = 1
// 4 % 2 = 0
public class Oddsum {
	public static void main(String[] args) {
		// 1 + 3 + 5+ ..... +99 = ?
		int o = 0, s = 0;  
		String ss = "";
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 1) {
				if(i != 99 ) {
					ss += i + "-";
					
				}else{
					ss += i + "-";
				}
				o += i;
			}else {
				if(i % 2 == 0) {
					if(i != 100 ) {
						ss += i + "+";
					}else {
						ss += i + "=";
					}
					s += i;
				}
			}
		}
		System.out.println(ss+(o-s));
	}
}
