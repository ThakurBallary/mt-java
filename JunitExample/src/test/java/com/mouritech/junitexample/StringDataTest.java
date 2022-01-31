package com.mouritech.junitexample;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringDataTest {

	StringData sd = new StringData();
	@Test
	public void testMessage() {
		assertSame("hello", sd.message());
		assertEquals("hello",sd.message());
	}

}
