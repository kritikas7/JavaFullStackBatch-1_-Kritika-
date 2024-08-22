package com.JunitTest;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalcTest.class, CalcTest2.class })
public class AllTests {

}
