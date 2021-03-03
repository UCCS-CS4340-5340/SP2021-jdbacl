/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.dialect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Timestamp;
import org.databene.jdbacl.dialect.PostgreSQLDialect;
import org.databene.jdbacl.model.DBSequence;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestPostgreSQLDialect {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      postgreSQLDialect0.isDeterministicIndexName("op_dummy re4ceived");
  }

  @Test
  public void test1()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      String string0 = postgreSQLDialect0.formatTimestamp((Timestamp) null);
      assertEquals("timestamp 'null'", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      String string0 = postgreSQLDialect0.renderFetchSequenceValue("UNKNOWN");
      assertNotNull(string0);
      assertEquals("select nextval('UNKNOWN')", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.isDefaultSchema("Y:mAW", "Y:mAW ~ 'Y:mAW'");
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      String string0 = postgreSQLDialect0.sequenceNoCycle();
      assertEquals("NO CYCLE", string0);
  }

  @Test
  public void test5()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.supportsRegex();
      assertEquals(true, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.isDeterministicUKName("UNKNOWN");
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.isDeterministicPKName("y0aI_ghn.L");
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.isDeterministicFKName("");
      assertEquals(true, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      DBSequence dBSequence0 = new DBSequence("op_dummy re4ceived", "op_dummy re4ceived", "op_dummy re4ceived");
      String string0 = postgreSQLDialect0.renderCreateSequence(dBSequence0);
      assertEquals("CREATE SEQUENCE op_dummy re4ceived", string0);
  }

  @Test
  public void test10()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      DBSequence dBSequence0 = new DBSequence("op_dummy re4ceived", "op_dummy re4ceived", "op_dummy re4ceived");
      dBSequence0.setCache((Long) (-1154L));
      String string0 = postgreSQLDialect0.renderCreateSequence(dBSequence0);
      assertEquals("CREATE SEQUENCE op_dummy re4ceived CACHE -1154", string0);
      assertNotNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.isDefaultCatalog("", "");
      assertEquals(true, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.isDefaultCatalog("Tw%go%7U9M@DXm_:+V", "postgres");
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      boolean boolean0 = postgreSQLDialect0.isDefaultCatalog("[]uY.3qk<U\"", "[]uY.3qk<U\"");
      assertEquals(true, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      String string0 = postgreSQLDialect0.regexQuery("Y:mAW", false, "Y:mAW");
      assertNotNull(string0);
      assertEquals("Y:mAW ~ 'Y:mAW'", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      String string0 = postgreSQLDialect0.regexQuery("op_dummy re4ceived", true, "op_dummy re4ceived");
      assertEquals("NOT op_dummy re4ceived ~ 'op_dummy re4ceived'", string0);
      assertNotNull(string0);
  }
}
