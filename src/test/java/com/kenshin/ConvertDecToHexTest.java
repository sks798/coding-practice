package com.kenshin;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ConvertDecToHexTest {
	ConvertDecToHex convertDecToHex = new ConvertDecToHex();

	@Test
	public void testConvertDecToHex() {
		assertEquals(convertDecToHex.convertDecToHex(0), "0");
		assertEquals(convertDecToHex.convertDecToHex(10), "A");
		assertEquals(convertDecToHex.convertDecToHex(284), "11C");
		assertEquals(convertDecToHex.convertDecToHex(-129), "");
	}

}
