package com.findGCFactror;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindGcfApplicationTests {
	
     public FindHCF findHcf;
	@Test
	public void testHighestCommonFactor() {
	 assertEquals(2, findHcf.highestCommonFactor(new int[]{2, 4, 6, 8}));
		assertEquals(3,findHcf. highestCommonFactor(new int[]{9, 6, 3}));
		assertEquals(1,findHcf. highestCommonFactor(new int[]{13, 17}));
		assertEquals(0, findHcf.highestCommonFactor(null));
		assertEquals(0,findHcf. highestCommonFactor(new int[]{}));
		
	}
	
}


