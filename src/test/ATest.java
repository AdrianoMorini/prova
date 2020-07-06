package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ATest {

	@Test
	void test() {
		BTest b = new BTest();
		String c = b.testConversion();
		assertEquals("1634.89", c);
	}

}
