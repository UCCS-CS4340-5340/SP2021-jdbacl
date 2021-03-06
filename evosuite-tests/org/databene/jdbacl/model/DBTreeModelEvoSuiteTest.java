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
import org.databene.jdbacl.model.DBTreeModel;
import org.databene.jdbacl.model.DBTrigger;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.TableContainer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBTreeModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TableContainer tableContainer0 = new TableContainer("9H]d.GOv", (CompositeDBObject<? extends DBObject>) null);
      DBTreeModel dBTreeModel0 = new DBTreeModel((CompositeDBObject<?>) tableContainer0);
      DBCatalog dBCatalog0 = new DBCatalog((String) null);
      // Undeclared exception!
      try {
        dBTreeModel0.getChild((DBObject) dBCatalog0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * Index: 0, Size: 0
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("+dQ~vvhEl8");
      DBTreeModel dBTreeModel0 = new DBTreeModel((CompositeDBObject<?>) dBCatalog0);
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      DBObject dBObject0 = dBTreeModel0.getParent((DBObject) defaultDBTable0);
      assertNull(dBObject0);
  }

  @Test
  public void test2()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("+dQ~vvhEl8");
      DBTreeModel dBTreeModel0 = new DBTreeModel((CompositeDBObject<?>) dBCatalog0);
      DBCatalog dBCatalog1 = (DBCatalog)dBTreeModel0.getRoot();
      assertSame(dBCatalog0, dBCatalog1);
  }

  @Test
  public void test3()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("+dQ~vvhEl8");
      DBTreeModel dBTreeModel0 = new DBTreeModel((CompositeDBObject<?>) dBCatalog0);
      int int0 = dBTreeModel0.getIndexOfChild((DBObject) dBCatalog0, (DBObject) null);
      assertEquals((-1), int0);
  }

  @Test
  public void test4()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("");
      DBTrigger dBTrigger0 = new DBTrigger("", dBSchema0);
      DBTreeModel dBTreeModel0 = new DBTreeModel((CompositeDBObject<?>) dBSchema0);
      // Undeclared exception!
      try {
        dBTreeModel0.getChildCount((DBObject) dBTrigger0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * org.databene.jdbacl.model.DBTrigger cannot be cast to org.databene.jdbacl.model.CompositeDBObject
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("");
      DBTreeModel dBTreeModel0 = new DBTreeModel((CompositeDBObject<?>) dBCatalog0);
      boolean boolean0 = dBTreeModel0.isLeaf((DBObject) dBCatalog0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      DBTreeModel dBTreeModel0 = new DBTreeModel((CompositeDBObject<?>) null);
      boolean boolean0 = dBTreeModel0.isLeaf((DBObject) null);
      assertEquals(true, boolean0);
  }
}
