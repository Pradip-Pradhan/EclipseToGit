package com.zensar.junitApp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindeomeChekeTest {


	@Test
	public void checkPalindeome() {
		PalindeomeCheke pc=new PalindeomeCheke();
		Boolean actualResult=pc.isPalindrom("MADAM");
		Boolean expectedResult=true;
		assertEquals(expectedResult, actualResult);
	}

}
