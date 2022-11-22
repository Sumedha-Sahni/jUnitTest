package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitfunctions Junit = new jUnitfunctions();
		int result = Junit.testAddNumbers(100,200);
		assertEquals(300,result);
	}

}