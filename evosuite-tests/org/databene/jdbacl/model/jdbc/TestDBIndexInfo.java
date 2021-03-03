/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.jdbc.DBIndexInfo;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDBIndexInfo {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("V']W_6W4", "V']W_6W4", (short)1, "V']W_6W4", true, (short)1, "V']W_6W4", (Boolean) true, 161, (int) (short)1, "V']W_6W4");
      assertNotNull(dBIndexInfo0);
      
      String string0 = dBIndexInfo0.toString();
      assertEquals("[V']W_6W4]", string0);
      assertEquals(1, dBIndexInfo0.pages);
      assertEquals(161, dBIndexInfo0.cardinality);
      assertEquals(true, dBIndexInfo0.unique);
      assertNotNull(string0);
      assertEquals((short)1, dBIndexInfo0.type);
  }

  @Test
  public void test1()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = null;
      try {
        dBIndexInfo0 = new DBIndexInfo("1lfbt]f]up", "1lfbt]f]up", (short)16, "1lfbt]f]up", false, (short)16, "1lfbt]f]up", (Boolean) false, (int) (short)16, (int) (short)16, "");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * ordinalPosition is expected to be 1, found: 16
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("V']W_6W4", "V']W_6W4", (short)2, "V']W_6W4", false, (short)1, "V']W_6W4", (Boolean) false, (-452), (int) (short)1, (String) null);
      assertNotNull(dBIndexInfo0);
      
      dBIndexInfo0.addColumn((short)2, (String) null);
      assertEquals("[V']W_6W4, ]", dBIndexInfo0.toString());
      assertEquals((-452), dBIndexInfo0.cardinality);
  }

  @Test
  public void test3()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("y", "y", (short)0, "y", false, (short)1, "y", (Boolean) false, 1, 1, "y");
      assertNotNull(dBIndexInfo0);
      
      // Undeclared exception!
      try {
        dBIndexInfo0.addColumn((short)100, "ordinalPosition is expected to be 1, found: ");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * ordinalPosition is expected to be 2, found: 100
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("V']W_6W4", "V']W_6W4", (short)1, "V']W_6W4", true, (short)1, "V']W_6W4", (Boolean) true, 161, (int) (short)1, "V']W_6W4");
      assertNotNull(dBIndexInfo0);
      
      dBIndexInfo0.addColumn((short)1, "V']W_6W4");
      assertEquals(1, dBIndexInfo0.pages);
      assertEquals(true, dBIndexInfo0.unique);
      assertEquals("[V']W_6W4]", dBIndexInfo0.toString());
      assertEquals((short)1, dBIndexInfo0.type);
      assertEquals(161, dBIndexInfo0.cardinality);
  }

  @Test
  public void test5()  throws Throwable  {
      DBIndexInfo dBIndexInfo0 = new DBIndexInfo("V']W_6W4", "V']W_6W4", (short)1, "V']W_6W4", true, (short)1, "V']W_6W4", (Boolean) true, 161, (int) (short)1, "V']W_6W4");
      assertNotNull(dBIndexInfo0);
      
      // Undeclared exception!
      try {
        dBIndexInfo0.addColumn((short)1, "~jfO?i{~G)jJ<qU/k5z");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * ordinalPosition is expected to be 2, found: 1
         */
      }
  }
}
