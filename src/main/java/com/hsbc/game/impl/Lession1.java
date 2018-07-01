package com.hsbc.game.impl;

import com.hsbc.game.base.LessionBase;


public class Lession1 implements LessionBase {
	public String point(int num) {
		String str = null;
		if ((num % 3 == 0) && (num % 5 == 0)) {
			str = "FizzBuzz";
		} else if ((num % 3 == 0)) {
			str = "Fizz";
		} else if ((num % 5 == 0)) {
			str = "Buzz";
		} else {
			str = num + "";
		}
		return str;
	}

	public void pointMul(int numTotal) {
		for (int i = 1; i <= numTotal; i++) {
			String str = point(i);
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		Lession1 l = new Lession1();
		l.pointMul(100);
	}
}
