/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.math.BigInteger;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.TableContainer;
import org.h2.value.ValueLong;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBSequenceEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("-]RX^MhX", "-]RX^MhX", "-]RX^MhX");
      BigInteger bigInteger0 = ValueLong.MAX;
      dBSequence0.setLastNumber(bigInteger0);
      assertEquals(0, bigInteger0.getLowestSetBit());
  }

  @Test
  public void test1()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5");
      assertNotNull(dBSequence0);
      
      DBSequence dBSequence1 = new DBSequence("B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5");
      boolean boolean0 = dBSequence0.isIdentical((DBObject) dBSequence1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("%=7I7(+d`wD", "%=7I7(+d`wD", "%=7I7(+d`wD");
      dBSequence0.setIncrement((BigInteger) null);
      BigInteger bigInteger0 = dBSequence0.getIncrementIfNotDefault();
      assertNull(bigInteger0);
  }

  @Test
  public void test3()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("", "", "");
      BigInteger bigInteger0 = dBSequence0.getMinValueIfNotDefault();
      assertNull(bigInteger0);
  }

  @Test
  public void test4()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("%=7I7(+d`wD", "%=7I7(+d`wD", "%=7I7(+d`wD");
      dBSequence0.setMinValue((BigInteger) null);
      assertEquals("%=7I7(+d`wD", dBSequence0.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("0-;FRVCYGroZlUx><1", "", "0-;FRVCYGroZlUx><1");
      assertNotNull(dBSequence0);
      
      BigInteger bigInteger0 = BigInteger.TEN;
      dBSequence0.setMaxValue(bigInteger0);
      assertEquals("", dBSequence0.getCatalogName());
      assertEquals("0-;FRVCYGroZlUx><1", dBSequence0.getSchemaName());
  }

  @Test
  public void test6()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("0-;FRVCYGroZlUx><1", "", "0-;FRVCYGroZlUx><1");
      assertNotNull(dBSequence0);
      
      BigInteger bigInteger0 = BigInteger.TEN;
      dBSequence0.setStart(bigInteger0);
      BigInteger bigInteger1 = dBSequence0.getStartIfNotDefault();
      assertEquals("", dBSequence0.getCatalogName());
      assertEquals("0-;FRVCYGroZlUx><1", dBSequence0.getSchemaName());
      assertNotNull(bigInteger1);
  }

  @Test
  public void test7()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5");
      BigInteger bigInteger0 = dBSequence0.getLastNumber();
      assertEquals("0", bigInteger0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5");
      dBSequence0.setOrder((Boolean) true);
      assertEquals("B8lOAI!Fe&rhmC7Qjj5", dBSequence0.getName());
  }

  @Test
  public void test9()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("", "", "");
      String string0 = dBSequence0.getCatalogName();
      assertEquals("", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("-]RX^MhX", "-]RX^MhX", "-]RX^MhX");
      String string0 = dBSequence0.getSchemaName();
      assertEquals("-]RX^MhX", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("%=7I7(+d`wD", "%=7I7(+d`wD", "%=7I7(+d`wD");
      BigInteger bigInteger0 = dBSequence0.getMaxValueIfNotDefault();
      assertNull(bigInteger0);
  }

  @Test
  public void test12()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("-]RX^MhX", "-]RX^MhX", "-]RX^MhX");
      Long long0 = new Long((-1L));
      dBSequence0.setCache(long0);
      assertEquals("-]RX^MhX", dBSequence0.getCatalogName());
  }

  @Test
  public void test13()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("%=7I7(+d`wD", "%=7I7(+d`wD", "%=7I7(+d`wD");
      assertNotNull(dBSequence0);
      
      String string0 = dBSequence0.dropDDL();
      assertNotNull(string0);
      assertEquals("drop sequence %=7I7(+d`wD", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("", "", "");
      dBSequence0.setCycle((Boolean) null);
      assertEquals("sequence", dBSequence0.getObjectType());
  }

  @Test
  public void test15()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("");
      DBSequence dBSequence0 = null;
      try {
        dBSequence0 = new DBSequence("", dBSchema0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5", "B8lOAI!Fe&rhmC7Qjj5");
      BigInteger bigInteger0 = dBSequence0.getStartIfNotDefault();
      assertNull(bigInteger0);
  }

  @Test
  public void test17()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("CI25e", "CI25e", "CI25e");
      BigInteger bigInteger0 = dBSequence0.getIncrementIfNotDefault();
      assertNull(bigInteger0);
  }

  @Test
  public void test18()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("0-;FRVCYGroZlUx><1", "", "0-;FRVCYGroZlUx><1");
      assertNotNull(dBSequence0);
      
      DBSequence dBSequence1 = new DBSequence("", (DBSchema) null);
      boolean boolean0 = dBSequence0.isIdentical((DBObject) dBSequence1);
      assertEquals("0-;FRVCYGroZlUx><1", dBSequence0.getSchemaName());
      assertEquals("", dBSequence0.getCatalogName());
      assertEquals(false, boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("0-;FRVCYGroZlUx><1", "", "0-;FRVCYGroZlUx><1");
      assertNotNull(dBSequence0);
      
      TableContainer tableContainer0 = new TableContainer("");
      boolean boolean0 = dBSequence0.isIdentical((DBObject) tableContainer0);
      assertEquals("", dBSequence0.getCatalogName());
      assertEquals(false, boolean0);
      assertEquals("0-;FRVCYGroZlUx><1", dBSequence0.getSchemaName());
  }

  @Test
  public void test20()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("%=7I7(+d`wD", "%=7I7(+d`wD", "%=7I7(+d`wD");
      assertNotNull(dBSequence0);
      
      DBSequence dBSequence1 = new DBSequence("%=7I7(+d`wD", "%=7I7(+d`wD", "%=7I7(+d`wD");
      dBSequence1.setIncrement((BigInteger) null);
      boolean boolean0 = dBSequence1.isIdentical((DBObject) dBSequence0);
      assertEquals(false, boolean0);
  }
}
