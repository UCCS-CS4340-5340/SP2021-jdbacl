/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.dialect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import org.databene.jdbacl.dialect.SqlServerDialect;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SqlServerDialectEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDefaultCatalog("1gQPA]:u<}=a*;2>= = CASE WHEN null THEN null ELSE 1gQPA]:u<}=a*;2>= END", "1gQPA]:u<}=a*;2>= = CASE WHEN null THEN null ELSE 1gQPA]:u<}=a*;2>= END");
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      // Undeclared exception!
      try {
        sqlServerDialect0.isDefaultSchema((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDeterministicPKName("SYS_");
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDeterministicPKName("");
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDeterministicUKName("SYS_");
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDeterministicUKName("sql_server");
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      Pattern pattern0 = Pattern.compile("");
      sqlServerDialect0.randomNamePattern = pattern0;
      boolean boolean0 = sqlServerDialect0.isDeterministicFKName("");
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDeterministicFKName("cvc-]omplex-type.2.2");
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDeterministicIndexName("SYS_");
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      boolean boolean0 = sqlServerDialect0.isDeterministicIndexName("sql_server");
      assertEquals(true, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      String[] stringArray0 = new String[2];
      String string0 = sqlServerDialect0.renderCase("1gQPA]:u<}=a*;2>=", "1gQPA]:u<}=a*;2>=", stringArray0);
      assertEquals("1gQPA]:u<}=a*;2>= = CASE WHEN null THEN null ELSE 1gQPA]:u<}=a*;2>= END", string0);
      assertNotNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      String[] stringArray0 = new String[2];
      String string0 = sqlServerDialect0.renderCase((String) null, (String) null, stringArray0);
      assertEquals("null = CASE WHEN null THEN null END", string0);
      assertNotNull(string0);
  }
}
