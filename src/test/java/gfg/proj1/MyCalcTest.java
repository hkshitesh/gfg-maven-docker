package gfg.proj1;

import static org.junit.Assert.*;

import org.junit.Test;

import pkg1.MyCalc;

public class MyCalcTest {
	@Test
	public void test() {		
		MyCalc ob = new MyCalc();
		assertEquals(30, ob.sum(20, 10));
		assertEquals(10, ob.diff(20, 10));
		assertEquals(200, ob.mul(20, 10));
		assertEquals(2, ob.div(20, 10));
	}
}
