package com.hsbc.game.impl;

import com.hsbc.game.base.LessionBase;


public class Lession2 extends Lession1 implements LessionBase {
	@Override
	public String point(int num) {
		String str = null;
		if ((num % 3 == 0) && (num % 5 == 0)) {
			str = "FizzBuzz";
		} else if ((num % 3 == 0) || (String.valueOf(num).indexOf("3") > -1)) {
			str = "Fizz";
		} else if ((num % 5 == 0) || (String.valueOf(num).indexOf("5") > -1)) {
			str = "Buzz";
		} else {
			str = num + "";
		}
		return str;
	}

	public static void main(String[] args) {
		Lession1 l = new Lession2();
		l.pointMul(100);
	}
}
