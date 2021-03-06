/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.List;
import org.databene.commons.ObjectNotFoundException;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.DefaultDatabase;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBCatalogEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      dBCatalog0.setName((String) null);
      assertNull(dBCatalog0.getDoc());
  }

  @Test
  public void test1()  throws Throwable  {
      VersionNumber versionNumber0 = VersionNumber.valueOf("updateObject(");
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("updateObject(", "updateObject(", versionNumber0);
      DBCatalog dBCatalog0 = new DBCatalog("updateObject(", (Database) defaultDatabase0);
      // Undeclared exception!
      try {
        dBCatalog0.removeTable((String) null);
        fail("Expecting exception: ObjectNotFoundException");
      } catch(ObjectNotFoundException e) {
        /*
         * Table 'null'
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("DROP ALIAS READ_CLOB_DB;");
      DBSchema dBSchema0 = new DBSchema("DROP ALIAS READ_CLOB_DB;", dBCatalog0);
      dBCatalog0.removeSchema(dBSchema0);
      assertEquals("schema", dBSchema0.getObjectType());
  }

  @Test
  public void test3()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("DROP ALIAS READ_CLOB_DB;");
      dBCatalog0.setDoc("DROP ALIAS READ_CLOB_DB;");
      assertEquals("DROP ALIAS READ_CLOB_DB;", dBCatalog0.getDoc());
  }

  @Test
  public void test4()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      Database database0 = dBSchema0.getDatabase();
      assertNull(database0);
  }

  @Test
  public void test5()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("DROP ALIAS READ_CLOB_DB;");
      String string0 = dBCatalog0.getDoc();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("DROP ALIAS READ_CLOB_DB;");
      DBSchema dBSchema0 = dBCatalog0.getSchema("DROP ALIAS READ_CLOB_DB;");
      assertNull(dBSchema0);
  }

  @Test
  public void test7()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      assertNotNull(dBCatalog0);
      
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      assertNotNull(dBSchema0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("W@.2!utA", dBSchema0);
      List<DBTable> list0 = dBCatalog0.getTables();
      assertEquals(false, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test8()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("DROP ALIAS READ_CLOB_DB;");
      DBSchema dBSchema0 = new DBSchema("DROP ALIAS READ_CLOB_DB;", dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("DROP ALIAS READ_CLOB_DB;");
      dBSchema0.addTable((DBTable) defaultDBTable0);
      DefaultDBTable defaultDBTable1 = (DefaultDBTable)dBCatalog0.getTable((String) null, false);
      assertNull(defaultDBTable1);
  }

  @Test
  public void test9()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("W@.2!utA", dBSchema0);
      DefaultDBTable defaultDBTable1 = (DefaultDBTable)dBCatalog0.getTable("W@.2!utA", true);
      assertNull(defaultDBTable1.getDoc());
  }

  @Test
  public void test10()  throws Throwable  {
      VersionNumber versionNumber0 = VersionNumber.valueOf("updateObject(");
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("updateObject(", "updateObject(", versionNumber0);
      DBCatalog dBCatalog0 = new DBCatalog("updateObject(", (Database) defaultDatabase0);
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      assertNotNull(dBSchema0);
      
      DBSequence dBSequence0 = new DBSequence((String) null, (String) null, "updateObject");
      dBSchema0.addSequence(dBSequence0);
      List<DBSequence> list0 = dBCatalog0.getSequences();
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
  }
}
