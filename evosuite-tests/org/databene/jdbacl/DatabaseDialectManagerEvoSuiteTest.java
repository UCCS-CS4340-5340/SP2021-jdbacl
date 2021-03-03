/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.DatabaseDialectManager;
import org.databene.jdbacl.dialect.HSQL2Dialect;
import org.databene.jdbacl.dialect.HSQLDialect;
import org.databene.jdbacl.dialect.UnknownDialect;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DatabaseDialectManagerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DatabaseDialectManager databaseDialectManager0 = new DatabaseDialectManager();
      assertNotNull(databaseDialectManager0);
  }

  @Test
  public void test1()  throws Throwable  {
      VersionNumber versionNumber0 = VersionNumber.valueOf("");
      UnknownDialect unknownDialect0 = (UnknownDialect)DatabaseDialectManager.getDialectForProduct("", versionNumber0);
      assertEquals(false, unknownDialect0.supportsRegex());
  }

  @Test
  public void test2()  throws Throwable  {
      HSQL2Dialect hSQL2Dialect0 = (HSQL2Dialect)DatabaseDialectManager.getDialectForProduct("hsql.4[p5VLveyon", (VersionNumber) null);
      assertEquals(true, hSQL2Dialect0.supportsRegex());
  }

  @Test
  public void test3()  throws Throwable  {
      VersionNumber versionNumber0 = VersionNumber.valueOf("");
      HSQLDialect hSQLDialect0 = (HSQLDialect)DatabaseDialectManager.getDialectForProduct("hsql.4[p5VLveyon", versionNumber0);
      assertEquals(true, hSQLDialect0.isSequenceBoundarySupported());
  }
}
