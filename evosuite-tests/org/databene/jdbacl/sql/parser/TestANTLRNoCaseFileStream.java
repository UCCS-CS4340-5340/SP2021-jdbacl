/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.sql.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.databene.jdbacl.sql.parser.ANTLRNoCaseFileStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestANTLRNoCaseFileStream {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ANTLRNoCaseFileStream aNTLRNoCaseFileStream0 = new ANTLRNoCaseFileStream((String) null, (String) null);
      // Undeclared exception!
      try {
        aNTLRNoCaseFileStream0.getText();
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.databene.commons.IOUtil
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      ANTLRNoCaseFileStream aNTLRNoCaseFileStream0 = new ANTLRNoCaseFileStream((String) null);
      // Undeclared exception!
      try {
        aNTLRNoCaseFileStream0.LT((-3));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ANTLRNoCaseFileStream aNTLRNoCaseFileStream0 = new ANTLRNoCaseFileStream((String) null);
      int int0 = aNTLRNoCaseFileStream0.LT(0);
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      ANTLRNoCaseFileStream aNTLRNoCaseFileStream0 = new ANTLRNoCaseFileStream((String) null, (String) null);
      int int0 = aNTLRNoCaseFileStream0.LT(1);
      assertEquals((-1), int0);
  }
}
