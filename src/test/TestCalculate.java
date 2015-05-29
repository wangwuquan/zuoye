package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import zuoye.Calculate;

public class TestCalculate {

	public TestCalculate() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void test() {
		
		double a = 1,b =2 ;
		double c = 3;
		double d = Calculate.jia(a, b);
		assertEquals(String.valueOf(c),String.valueOf(Calculate.jia(a, b)));
		//assertEquals(c,3);
		//assertEquals(c,3);
		
		//fail("Not yet implemented");
	}

}
