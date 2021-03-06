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
import org.databene.jdbacl.dialect.H2Dialect;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestH2Dialect {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      h2Dialect0.supportsRegex();
  }

  @Test
  public void test1()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      String string0 = h2Dialect0.renderFetchSequenceValue("");
      assertEquals("select next value for ", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      // Undeclared exception!
      try {
        h2Dialect0.setNextSequenceValue("n40Nx[Re:Yy", 0L, (Connection) null);
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
      String string0 = h2Dialect0.renderDropSequence("");
      assertEquals("drop sequence ", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDefaultSchema("CONSTRAINT_INDEX_0", "CONSTRAINT_INDEX_0");
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDefaultCatalog("", "select next value for ");
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
      boolean boolean0 = h2Dialect0.isDeterministicPKName("CONSTRAINT_INDEX_0");
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicPKName("");
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
      boolean boolean0 = h2Dialect0.isDeterministicUKName("{IN#/P>P57od");
      assertEquals(true, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicFKName("CONSTRAINT_IDEX_0");
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicFKName("{IN#/P>P57od");
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicIndexName("PRIMARY_KEY_0");
      assertEquals(false, boolean0);
  }

  @Test
  public void test15()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      boolean boolean0 = h2Dialect0.isDeterministicIndexName("");
      assertEquals(true, boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      String string0 = h2Dialect0.regexQuery("CONSTRAINT_IDEX_0", false, "CONSTRAINT_IDEX_0");
      assertNotNull(string0);
      assertEquals("CONSTRAINT_IDEX_0 REGEXP 'CONSTRAINT_IDEX_0'", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      H2Dialect h2Dialect0 = new H2Dialect();
      String string0 = h2Dialect0.regexQuery("", true, "");
      assertNotNull(string0);
      assertEquals(" NOT REGEXP ''", string0);
  }
}
