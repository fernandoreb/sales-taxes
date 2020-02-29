package com.farg.sales.taxes.utils;

import java.math.BigDecimal;

public class Utils {
	
	private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

	public static BigDecimal calcPercent(BigDecimal value, BigDecimal percent) {
		return value.multiply(percent).divide(ONE_HUNDRED);
	}

	public static BigDecimal calcAndAddPercent(BigDecimal value, BigDecimal percent) {
		return value.multiply(percent).divide(ONE_HUNDRED).add(value);
	}
}
