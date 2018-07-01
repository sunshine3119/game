package com.hsbc.game.factory;

import com.hsbc.game.base.LessionBase;
import com.hsbc.game.impl.Lession1;
import com.hsbc.game.impl.Lession2;
import com.hsbc.game.proxy.LessionProxy;
import com.hsbc.game.type.LessionType;

public class LessionFactory {
	private static LessionFactory instance = null;

	private LessionFactory() {
	}

	public static LessionFactory getInstance() {
		if (instance == null) {
			synchronized (LessionFactory.class) {
				if (instance == null) {
					instance = new LessionFactory();
				}
			}
		}
		return instance;
	}

	public LessionBase create(LessionType type) {
		if (type == LessionType.ONE) {
			return new LessionProxy(new Lession1());
		}
		if (type == LessionType.TWO) {
			return new LessionProxy(new Lession2());
		}
		return null;
	}
}
