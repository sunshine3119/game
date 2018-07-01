package com.hsbc.game;

import org.junit.Before;
import org.junit.Test;

import com.hsbc.game.base.LessionBase;
import com.hsbc.game.factory.LessionFactory;
import com.hsbc.game.type.LessionType;

public class LessionTest {
	LessionFactory factory;

	@Before
	public void init() {
		factory = LessionFactory.getInstance();
	}

	@Test
	public void testLession1() {
		System.out.println("=========================This following is for Lession1=====================");
		LessionBase instance = factory.create(LessionType.ONE);
		instance.pointMul(100);
	}

	@Test
	public void testLession2() {
		System.out.println("=========================This following is for Lession2=====================");
		LessionBase instance = factory.create(LessionType.TWO);
		instance.pointMul(100);
	}

	//	@Test
	//	public void testAbc(){
	//		assertEquals("1","1");
	//	}

}