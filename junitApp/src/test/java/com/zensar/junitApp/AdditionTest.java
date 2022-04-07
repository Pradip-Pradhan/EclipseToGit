package com.zensar.junitApp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AdditionTest {

	Addition a=null;
	
	@BeforeClass
	public static void beforeallTestCase(){
		System.out.println("before all Test Case");
	}
	
	@AfterClass
	public static void afterallTestCase(){
		System.out.println("after all Test Case");
	}
	@Before
	public void set(){
	//	System.out.println("hi");
		a=new Addition();
	}
	@After
	public void disSet(){
	//	System.out.println("hello");
		a=null;
	}
	@Test
	public void test_add() {
		Integer actualResult=a.add(1, 2);
		Integer expectedResult=3;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_sub() {
		Integer actualResult=a.sub(1, 2);
		Integer expectedResult=-1;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_multi() {
		Integer actualResult=a.multi(1, 2);
		Integer expectedResult=2;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_div() {
		Integer actualResult=a.div(10, 5);
		Integer expectedResult=2;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void test_array(){
		int actualArray[]=a.myArray();
		int expectedArray[]={1,2,3,4};
		assertArrayEquals(expectedArray, actualArray);
		
	}
	
	@Test
	public void test_string(){
		String actualResult=a.getname("pradip");
		String expectedResult="PRADIP";
		assertEquals(expectedResult, actualResult);
	}
	@Ignore
	@Test
	public void test_string_null(){
		String actualResult=a.getname("padu");
		String expectedResult=null;
		assertNotNull(expectedResult, actualResult);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_for_string_exception(){
		a.getname("");
	}
	
	@Ignore
	@Test
	public void ignore_test(){
	//	System.out.println("ignore test method");
	}

}
