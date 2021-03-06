/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.CompositeDBObject;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAbstractCompositeDBObject {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      boolean boolean0 = dBCatalog0.isIdentical((DBObject) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("no applicale action for[");
      TableContainer tableContainer1 = new TableContainer("no applicale action for[", (CompositeDBObject<?>) tableContainer0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("no applicale action for[");
      tableContainer1.addTable((DBTable) defaultDBTable0);
      boolean boolean0 = tableContainer0.isIdentical((DBObject) tableContainer1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("no applicale action for[");
      TableContainer tableContainer1 = new TableContainer("no applicale action for[", (CompositeDBObject<?>) tableContainer0);
      boolean boolean0 = tableContainer0.isIdentical((DBObject) tableContainer1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBCatalog dBCatalog1 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema("b4}[", dBCatalog1);
      dBCatalog0.addSchema(dBSchema0);
      boolean boolean0 = dBCatalog1.isIdentical((DBObject) dBCatalog0);
      assertEquals(true, boolean0);
  }
}
