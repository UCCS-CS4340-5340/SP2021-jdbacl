/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import org.databene.jdbacl.JDBCConnectData;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JDBCConnectDataEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData("[u", "[u", "[u", "[u");
      assertNotNull(jDBCConnectData0);
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        JDBCConnectData.parseSingleDbProperties("");
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.databene.commons.IOUtil
         */
      }
  }
}
