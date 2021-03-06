/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.dialect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.dialect.HSQL2Dialect;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestHSQL2Dialect {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HSQL2Dialect hSQL2Dialect0 = new HSQL2Dialect();
      hSQL2Dialect0.supportsRegex();
  }

  @Test
  public void test1()  throws Throwable  {
      HSQL2Dialect hSQL2Dialect0 = new HSQL2Dialect();
      String string0 = hSQL2Dialect0.regexQuery("", false, "");
      assertNotNull(string0);
      assertEquals("REGEXP_MATCHES(, '')", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      HSQL2Dialect hSQL2Dialect0 = new HSQL2Dialect();
      String string0 = hSQL2Dialect0.regexQuery("J;I@t1H$A{JGL", true, "J;I@t1H$A{JGL");
      assertEquals("NOT REGEXP_MATCHES(J;I@t1H$A{JGL, 'J;I@t1H$A{JGL')", string0);
      assertNotNull(string0);
  }
}
