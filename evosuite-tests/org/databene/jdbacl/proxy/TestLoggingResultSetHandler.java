/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.ResultSet;
import java.sql.Statement;
import org.databene.jdbacl.proxy.LoggingResultSetHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestLoggingResultSetHandler {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        LoggingResultSetHandler.assertAllResultSetsClosed(false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = LoggingResultSetHandler.getOpenResultSetCount();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      LoggingResultSetHandler loggingResultSetHandler0 = new LoggingResultSetHandler((ResultSet) null, (Statement) null);
      assertNotNull(loggingResultSetHandler0);
      assertEquals(1, loggingResultSetHandler0.getOpenResultSetCount());
  }

  @Test
  public void test3()  throws Throwable  {
      LoggingResultSetHandler.resetMonitors();
  }
}
