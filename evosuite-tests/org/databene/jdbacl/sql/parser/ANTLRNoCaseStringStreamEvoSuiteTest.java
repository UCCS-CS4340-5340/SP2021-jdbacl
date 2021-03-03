/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.sql.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.sql.parser.ANTLRNoCaseStringStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ANTLRNoCaseStringStreamEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ANTLRNoCaseStringStream aNTLRNoCaseStringStream0 = new ANTLRNoCaseStringStream("");
      String string0 = aNTLRNoCaseStringStream0.getText();
      assertEquals("", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      ANTLRNoCaseStringStream aNTLRNoCaseStringStream0 = new ANTLRNoCaseStringStream("");
      String string0 = aNTLRNoCaseStringStream0.toString();
      assertEquals("", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ANTLRNoCaseStringStream aNTLRNoCaseStringStream0 = new ANTLRNoCaseStringStream("");
      int int0 = aNTLRNoCaseStringStream0.LA(1738);
      assertEquals((-1), int0);
  }

  @Test
  public void test3()  throws Throwable  {
      ANTLRNoCaseStringStream aNTLRNoCaseStringStream0 = new ANTLRNoCaseStringStream("");
      int int0 = aNTLRNoCaseStringStream0.LT(0);
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      ANTLRNoCaseStringStream aNTLRNoCaseStringStream0 = new ANTLRNoCaseStringStream("G'h1:su-skJ}K");
      // Undeclared exception!
      try {
        aNTLRNoCaseStringStream0.LA((-49));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -49
         */
      }
  }
}
