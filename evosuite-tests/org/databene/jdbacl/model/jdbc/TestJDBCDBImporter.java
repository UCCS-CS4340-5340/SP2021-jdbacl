/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.databene.commons.ConnectFailedException;
import org.databene.commons.ImportFailedException;
import org.databene.jdbacl.JDBCConnectData;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.jdbc.JDBCDBImporter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestJDBCDBImporter {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("a+", "a+", "a+", "a+", "a+", "a+", "a+", false);
      jDBCDBImporter0.setImportingSequences(false);
  }

  @Test
  public void test1()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((Connection) null, "version", "version");
      assertNotNull(jDBCDBImporter0);
      
      boolean boolean0 = jDBCDBImporter0.isImportingPackages();
      assertEquals(false, boolean0);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(true, jDBCDBImporter0.importingIndexes);
      assertEquals(false, jDBCDBImporter0.importingSequences);
  }

  @Test
  public void test2()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, (String) null, (String) null);
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter(jDBCConnectData0);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setCatalogName((String) null);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
  }

  @Test
  public void test3()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("", "", "", "", "", "");
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setImportingUKs(false);
      assertEquals(false, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
  }

  @Test
  public void test4()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("=IH\"IM30Uu4<%/Csl=", "m,8", "=IH\"IM30Uu4<%/Csl=", "=IH\"IM30Uu4<%/Csl=", "m,8", "m,8", "m,8", true);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setSchemaName("m,8");
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.lazy);
  }

  @Test
  public void test5()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setLazy(true);
      try {
        jDBCDBImporter0.importDatabase();
        fail("Expecting exception: ConnectFailedException");
      } catch(ConnectFailedException e) {
        /*
         * Connecting null failed: 
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("", "", "", "", "", "", "", false);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setImportingChecks(true);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
  }

  @Test
  public void test7()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNotNull(jDBCDBImporter0);
      
      boolean boolean0 = jDBCDBImporter0.isImportingIndexes();
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(true, boolean0);
      assertEquals(true, jDBCDBImporter0.importingChecks);
  }

  @Test
  public void test8()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("s", "s", "s", "s", "s", "s");
      assertNotNull(jDBCDBImporter0);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      
      jDBCDBImporter0.setImportingTriggers(true);
      assertEquals(true, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.importingSequences);
  }

  @Test
  public void test9()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("", "", "", "", "", "");
      assertNotNull(jDBCDBImporter0);
      
      String string0 = jDBCDBImporter0.getDatabaseProductName();
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertNull(string0);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
  }

  @Test
  public void test10()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, (String) null, (String) null);
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter(jDBCConnectData0);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.close();
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingPackages);
  }

  @Test
  public void test11()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("=IH\"IM30Uu4<%/Csl=", "m,8", "=IH\"IM30Uu4<%/Csl=", "=IH\"IM30Uu4<%/Csl=", "m,8", "m,8", "m,8", true);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setImportingPackages(false);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(true, jDBCDBImporter0.importingUKs);
  }

  @Test
  public void test12()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
      assertNotNull(jDBCDBImporter0);
      
      DBCatalog dBCatalog0 = new DBCatalog((String) null);
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      // Undeclared exception!
      try {
        jDBCDBImporter0.importTable(dBCatalog0, dBSchema0, (String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("", "", "", "", "", "");
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setImportingIndexes(false);
      assertEquals(false, jDBCDBImporter0.importingIndexes);
      assertEquals(false, jDBCDBImporter0.isImportingPackages());
  }

  @Test
  public void test14()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("s", "s", "s", "s", "s", "s");
      assertNotNull(jDBCDBImporter0);
      
      String string0 = jDBCDBImporter0.toString();
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertNotNull(string0);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.isImportingPackages());
  }

  @Test
  public void test15()  throws Throwable  {
      JDBCConnectData jDBCConnectData0 = new JDBCConnectData((String) null, (String) null, (String) null, (String) null);
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter(jDBCConnectData0);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setFaultTolerant(false);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(true, jDBCDBImporter0.importingUKs);
  }

  @Test
  public void test16()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("", "", "", "", "", "");
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setFaultTolerant(true);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.isImportingPackages());
  }

  @Test
  public void test17()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((Connection) null, "version", "version");
      assertNotNull(jDBCDBImporter0);
      
      try {
        jDBCDBImporter0.importDatabase();
        fail("Expecting exception: ConnectFailedException");
      } catch(ConnectFailedException e) {
        /*
         * Connecting null failed: 
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((Connection) null, "version", "version");
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setIncludeTables("version");
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(true, jDBCDBImporter0.importingIndexes);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(true, jDBCDBImporter0.importingUKs);
  }

  @Test
  public void test19()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("", "", "", "", "", "");
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setIncludeTables("");
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(true, jDBCDBImporter0.importingUKs);
  }

  @Test
  public void test20()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNotNull(jDBCDBImporter0);
      
      jDBCDBImporter0.setExcludeTables((String) null);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(true, jDBCDBImporter0.importingChecks);
  }

  @Test
  public void test21()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("aa", "select  RDB$PROCEDURE_NAME as PROCEDURE_NAME, RDB$DESCRIPTION as REMARKS, RDB$PROCEDURE_OUTPUTS as PROCEDURE_TYPE from RDB$PROCEDURES where ", "aa", "aa", "aa", "aa");
      assertNotNull(jDBCDBImporter0);
      
      JDBCDBImporter.TableNameFilter jDBCDBImporter_TableNameFilter0 = jDBCDBImporter0.new TableNameFilter();
      boolean boolean0 = jDBCDBImporter_TableNameFilter0.accept("select  RDB$PROCEDURE_NAME as PROCEDURE_NAME, RDB$DESCRIPTION as REMARKS, RDB$PROCEDURE_OUTPUTS as PROCEDURE_TYPE from RDB$PROCEDURES where ");
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, boolean0);
  }

  @Test
  public void test22()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("a+", "a+", "a+", "a+", "a+", "a+", "a+", false);
      JDBCDBImporter.TableNameFilter jDBCDBImporter_TableNameFilter0 = jDBCDBImporter0.new TableNameFilter();
      jDBCDBImporter0.setExcludeTables("a+");
      boolean boolean0 = jDBCDBImporter_TableNameFilter0.accept("a+");
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, boolean0);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
  }

  @Test
  public void test23()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter("N!\"5]v@FxTtPyE6", "N!\"5]v@FxTtPyE6", "N!\"5]v@FxTtPyE6", "N!\"5]v@FxTtPyE6", "N!\"5]v@FxTtPyE6", "N!\"5]v@FxTtPyE6", "N!\"5]v@FxTtPyE6", true);
      assertNotNull(jDBCDBImporter0);
      
      JDBCDBImporter.TableNameFilter jDBCDBImporter_TableNameFilter0 = jDBCDBImporter0.new TableNameFilter();
      jDBCDBImporter0.excludeTables = jDBCDBImporter0.includeTables;
      assertEquals("N!\"5]v@FxTtPyE6", jDBCDBImporter0.excludeTables.pattern());
      
      boolean boolean0 = jDBCDBImporter_TableNameFilter0.accept("N!\"5]v@FxTtPyE6");
      assertEquals(false, jDBCDBImporter0.importingPackages);
      assertEquals(false, boolean0);
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(false, jDBCDBImporter0.importingSequences);
  }

  @Test
  public void test24()  throws Throwable  {
      JDBCDBImporter jDBCDBImporter0 = new JDBCDBImporter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      assertNotNull(jDBCDBImporter0);
      
      JDBCDBImporter.TableNameFilter jDBCDBImporter_TableNameFilter0 = jDBCDBImporter0.new TableNameFilter();
      boolean boolean0 = jDBCDBImporter_TableNameFilter0.accept("N!\"5]v@FxTtPyE6");
      assertEquals(true, jDBCDBImporter0.importingUKs);
      assertEquals(true, jDBCDBImporter0.importingChecks);
      assertEquals(false, jDBCDBImporter0.importingTriggers);
      assertEquals(true, boolean0);
      assertEquals(false, jDBCDBImporter0.importingSequences);
      assertEquals(false, jDBCDBImporter0.lazy);
      assertEquals(false, jDBCDBImporter0.importingPackages);
  }
}
