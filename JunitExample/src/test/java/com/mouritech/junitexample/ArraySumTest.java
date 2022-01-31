package com.mouritech.junitexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySumTest {

	ArraySum as = new ArraySum();
	int[] a = {34,56,78};
	int[] b = {43,65,50};
	int[] c = {77,121,128};
	@Test
	public void testArraySum() {
		assertArrayEquals(c, as.arraySum(a, b));
	}

}
