package com.hsbc.game.proxy;

import com.hsbc.game.base.LessionBase;

public class LessionProxy implements LessionBase {
	private LessionBase lessionBase;

	public LessionProxy(LessionBase lessionBase) {
		this.lessionBase = lessionBase;
	}

	@Override
	/**
	 * if less than 10 msecs, the result will be zero
	 */
	public String point(int num) {
		long s1 = System.currentTimeMillis();
		String result = lessionBase.point(num);
		long s2 = System.currentTimeMillis();
		System.out.println(lessionBase.getClass().getName() + "[point]" + (s2 - s1) + " msecs");
		return result;
	}

	@Override
	/**
	 * if less than 10 msecs, the result will be zero
	 */
	public void pointMul(int numTotal) {
		long s1 = System.currentTimeMillis();
		lessionBase.pointMul(numTotal);
		long s2 = System.currentTimeMillis();
		System.out.println(lessionBase.getClass().getName() + "[pointMul]" + (s2 - s1) + " msecs");
	}

}
