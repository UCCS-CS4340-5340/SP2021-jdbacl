/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Map;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBRow;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.evosuite.testcase.CodeUnderTestException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDBRow {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("A");
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      String string0 = dBRow0.toString();
      assertEquals("A[]", string0);
      assertNotNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DBRow dBRow0 = new DBRow((DBTable) null);
      String[] stringArray0 = new String[4];
      dBRow0.setCellValues(stringArray0, stringArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      DBRow dBRow0 = new DBRow((DBTable) null);
      DBTable dBTable0 = dBRow0.getTable();
      assertNull(dBTable0);
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint((DBTable) defaultDBTable0, "bU", true, stringArray0);
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      Object object0 = dBRow0.getPKValue();
      assertNull(object0);
  }

  @Test
  public void test4()  throws Throwable  {
      DBRow dBRow0 = new DBRow((DBTable) null);
      Map<String, Object> map0 = dBRow0.getCells();
      assertEquals(0, map0.size());
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      // Undeclared exception!
      try {
        dBRow0.getFKComponents((DBForeignKeyConstraint) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      Object[] objectArray0 = dBRow0.getPKValues();
      assertNotNull(objectArray0);
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("DuplicathTypeInMixedContent", (DBSchema) null);
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      String[] stringArray0 = new String[4];
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("DuplicateTypeInMixedContent", (DBSchema) null);
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      String[] stringArray0 = new String[1];
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      dBRow0.getPKValue();
      String[] stringArray0 = new String[10];
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("DuplicateTypeInMixedContent", (DBSchema) null);
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      String[] stringArray0 = new String[1];
  }

  @Test
  public void test11()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      Integer integer0 = new Integer((-469));
      // Undeclared exception!
      try {
        dBRow0.setPKValue((Object) integer0);
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.Integer cannot be cast to [Ljava.lang.Object;
         */
      }
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint((DBTable) defaultDBTable0, "bU", true, stringArray0);
      DBRow dBRow0 = new DBRow((DBTable) defaultDBTable0);
      Integer integer0 = new Integer((-469));
      dBRow0.setPKValue((Object) integer0);
      assertEquals("null[-469]", dBRow0.toString());
  }
}
