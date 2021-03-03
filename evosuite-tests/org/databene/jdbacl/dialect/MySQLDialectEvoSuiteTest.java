/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.dialect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.dialect.MySQLDialect;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MySQLDialectEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      boolean boolean0 = mySQLDialect0.supportsRegex();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      boolean boolean0 = mySQLDialect0.isDeterministicUKName(".6g");
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      boolean boolean0 = mySQLDialect0.isDefaultSchema("[", "[");
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      boolean boolean0 = mySQLDialect0.isDeterministicIndexName("):v\"-gOEA[5~GFeck");
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      boolean boolean0 = mySQLDialect0.isDeterministicFKName("COMMENT");
      assertEquals(true, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      boolean boolean0 = mySQLDialect0.isDeterministicPKName("jtQswa1");
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      boolean boolean0 = mySQLDialect0.isDefaultCatalog("*NhS(}@4z\";<", "*NhS(}@4z\";<");
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      String string0 = mySQLDialect0.regexQuery("z4o", false, "z4o");
      assertNotNull(string0);
      assertEquals("z4o REGEXP 'z4o'", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      String string0 = mySQLDialect0.regexQuery("/W", true, "/W");
      assertNotNull(string0);
      assertEquals("/W NOT REGEXP '/W'", string0);
  }
}
