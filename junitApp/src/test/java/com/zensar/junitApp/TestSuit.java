package com.zensar.junitApp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value= {SuitTest1.class,SuitTest2.class})
public class TestSuit {
	

}
