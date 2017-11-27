package com.bit.loop;

public class OddEvenTest {
	public static void main(String[] args) {
		String s = "";
		int r = 0;
		for(int i = 1; i <= 100; i++ ) {
			if(i % 2==0) {
				if(i == 100) {
					s += i + "=";
				}else {
					s += i + "+";
				}
				r -= i;
			}else {
				s += i + "-";
				r += i;
			}
			
		}
		System.out.println(s+r);
	}
}
