package com.kenshin;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
	TwoSum twoSum = new TwoSum();

	@Test
	public void testTwoSum() {
		int[] input = { -1, -2, -3 };
		int target = -4;
		int[] output = { 1, 3 };
		Assert.assertEquals(output[0], twoSum.twoSum(input, target)[0]);
		Assert.assertEquals(output[1], twoSum.twoSum(input, target)[1]);
	}

}
