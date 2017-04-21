package org.opentutorials.javatutorials.object;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
//		fail("Not yet implemented");
		Calculator c1 = new Calculator();
		c1.setOprands(2, 3);
		assertEquals(5, c1.sum() );
	}

}
