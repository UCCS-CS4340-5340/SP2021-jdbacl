/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.dialect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Pattern;
import org.databene.jdbacl.dialect.H2Dialect;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class H2DialectEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.supportsRegex();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      String string0 = h2Dialect0.renderFetchSequenceValue("$jj9-SOM1fyl0");
      assertNotNull(string0);
      assertEquals("select next value for $jj9-SOM1fyl0", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      // Undeclared exception!
      try {
        h2Dialect0.setNextSequenceValue("epUP*syB", (-197L), (Connection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isSequenceBoundarySupported();
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      String string0 = h2Dialect0.renderDropSequence((String) null);
      assertEquals("drop sequence null", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDefaultSchema("&4c6RViiBz[CLCh", "&4c6RViiBz[CLCh");
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDefaultCatalog("epUP*syB", "epUP*syB");
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDefaultCatalog((String) null, (String) null);
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicPKName("CONSTRAINT_0");
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicPKName("&4c6RViiBz[CLCh");
      assertEquals(true, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicUKName("CONSTRAINT_INDEX_0");
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicUKName("ureTt");
      assertEquals(true, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicFKName("CONSTRAINT_0");
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicFKName("ureTt");
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      Pattern pattern0 = Pattern.compile("");
      h2Dialect0.randomIndexNamePattern = pattern0;
      boolean boolean0 = h2Dialect0.isDeterministicIndexName("");
      assertEquals(false, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicIndexName("ureTt");
      assertEquals(true, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      String string0 = h2Dialect0.regexQuery("t7FIH\"IM30UuV<", false, "t7FIH\"IM30UuV<");
      assertEquals("t7FIH\"IM30UuV< REGEXP 't7FIH\"IM30UuV<'", string0);
      assertNotNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      String string0 = h2Dialect0.regexQuery("lwh:5Jve", true, "lwh:5Jve");
      assertEquals("lwh:5Jve NOT REGEXP 'lwh:5Jve'", string0);
      assertNotNull(string0);
  }
}
