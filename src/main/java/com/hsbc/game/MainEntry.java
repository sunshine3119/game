package com.hsbc.game;

import com.hsbc.game.base.LessionBase;
import com.hsbc.game.factory.LessionFactory;
import com.hsbc.game.type.LessionType;

public class MainEntry {
	public static void main(String[] args) {
		int num = 100;
		if (args != null && args.length > 0) {
			num = Integer.valueOf(args[0]);
		}

		LessionFactory factory = LessionFactory.getInstance();

		System.out.println("=========================This following is for Lession1=====================");
		LessionBase instance = factory.create(LessionType.ONE);
		instance.pointMul(num);

		System.out.println("");
		System.out.println("=========================This following is for Lession2=====================");
		LessionBase instance2 = factory.create(LessionType.TWO);
		instance2.pointMul(num);
	}
}
