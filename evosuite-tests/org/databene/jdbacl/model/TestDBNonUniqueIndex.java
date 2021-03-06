/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.DBNonUniqueIndex;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDBNonUniqueIndex {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("b(Xx");
      String[] stringArray0 = new String[9];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("b(Xx", false, (DBTable) defaultDBTable0, stringArray0);
      DBNonUniqueIndex dBNonUniqueIndex1 = new DBNonUniqueIndex("b(Xx", false, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.isIdentical((DBObject) dBNonUniqueIndex1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("b(Xx");
      String[] stringArray0 = new String[9];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("b(Xx", false, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.isUnique();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("b(Xx");
      String[] stringArray0 = new String[9];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("b(Xx", false, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.isIdentical((DBObject) defaultDBTable0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("b(Xx");
      String[] stringArray0 = new String[9];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("b(Xx", false, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.isIdentical((DBObject) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("b(Xx");
      String[] stringArray0 = new String[9];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("b(Xx", false, (DBTable) defaultDBTable0, stringArray0);
      DBNonUniqueIndex dBNonUniqueIndex1 = new DBNonUniqueIndex("b(Xx", false, (DBTable) defaultDBTable0, stringArray0);
      dBNonUniqueIndex1.addColumnName("b(Xx");
      boolean boolean0 = dBNonUniqueIndex0.isIdentical((DBObject) dBNonUniqueIndex1);
      assertFalse(dBNonUniqueIndex1.equals(dBNonUniqueIndex0));
      assertEquals(false, boolean0);
  }
}
