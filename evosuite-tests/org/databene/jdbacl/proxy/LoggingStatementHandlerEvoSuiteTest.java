/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.SQLException;
import java.sql.Statement;
import org.databene.jdbacl.proxy.LoggingStatementHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class LoggingStatementHandlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      int int0 = LoggingStatementHandler.getOpenStatementCount();
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        LoggingStatementHandler.assertAllStatementsClosed(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try {
        loggingStatementHandler0.executeUpdate("!", intArray0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Tried to mutate a database with read-only settings: !
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      // Undeclared exception!
      try {
        loggingStatementHandler0.executeUpdate("E", 2009);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Tried to mutate a database with read-only settings: E
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, false);
      assertNotNull(loggingStatementHandler0);
      
      // Undeclared exception!
      try {
        loggingStatementHandler0.execute((String) null, 65548);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      // Undeclared exception!
      try {
        loggingStatementHandler0.executeUpdate((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try {
        loggingStatementHandler0.execute("Ix", intArray0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Tried to mutate a database with read-only settings: Ix
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      String[] stringArray0 = new String[11];
      // Undeclared exception!
      try {
        loggingStatementHandler0.execute("4", stringArray0);
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Tried to mutate a database with read-only settings: 4
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      // Undeclared exception!
      try {
        loggingStatementHandler0.executeQuery("x-IK}a;gyd62B!<5c^cn");
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * Tried to mutate a database with read-only settings: x-IK}a;gyd62B!<5c^cn
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      // Undeclared exception!
      try {
        loggingStatementHandler0.executeBatch();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, false);
      assertNotNull(loggingStatementHandler0);
      
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try {
        loggingStatementHandler0.executeUpdate((String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, false);
      assertNotNull(loggingStatementHandler0);
      
      // Undeclared exception!
      try {
        loggingStatementHandler0.execute("Unexpected initiaization faiyure");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, true);
      assertNotNull(loggingStatementHandler0);
      
      String string0 = loggingStatementHandler0.toString();
      assertEquals(175, loggingStatementHandler0.getOpenStatementCount());
      assertEquals("Statement (null)", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      LoggingStatementHandler loggingStatementHandler0 = new LoggingStatementHandler((Statement) null, false);
      assertNotNull(loggingStatementHandler0);
      
      // Undeclared exception!
      try {
        loggingStatementHandler0.close();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      LoggingStatementHandler.resetMonitors();
  }
}
