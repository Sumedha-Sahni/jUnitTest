package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	
	@Test
	public void test() {
		jUnitfunctions junitstring = new jUnitfunctions();
		String result = junitstring.addstring("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}