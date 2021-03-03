/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.commons.ObjectNotFoundException;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.databene.jdbacl.model.FKChangeRule;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBForeignKeyConstraintEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("", false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      String string0 = dBForeignKeyConstraint0.toString();
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals("CONSTRAINT  FOREIGN KEY () REFERENCES null()", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[5];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("s00$", false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.getUpdateRule();
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals("CONSTRAINT s00$ FOREIGN KEY (, , , , ) REFERENCES null(, , , , )", dBForeignKeyConstraint0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[19];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("-~nP9&/`", true, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      FKChangeRule fKChangeRule0 = FKChangeRule.NO_ACTION;
      dBForeignKeyConstraint0.setUpdateRule(fKChangeRule0);
      assertEquals(1, defaultDBTable0.countProviders());
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[5];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("s00$", false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.getDeleteRule();
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals("CONSTRAINT s00$ FOREIGN KEY (, , , , ) REFERENCES null(, , , , )", dBForeignKeyConstraint0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("", false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      // Undeclared exception!
      try {
        dBForeignKeyConstraint0.columnReferencedBy("");
        fail("Expecting exception: ObjectNotFoundException");
      } catch(ObjectNotFoundException e) {
        /*
         * foreign key '' does not have a column ''
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[10];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("v](q{o=o3h=O$", true, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.getForeignKeyColumnNames();
      assertEquals(1, defaultDBTable0.countProviders());
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("", false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      FKChangeRule fKChangeRule0 = FKChangeRule.NO_ACTION;
      dBForeignKeyConstraint0.setDeleteRule(fKChangeRule0);
      assertEquals(1, defaultDBTable0.countProviders());
  }

  @Test
  public void test7()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[9];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.columnReferencedBy((String) null, true);
      assertEquals(1, defaultDBTable0.countProviders());
  }

  @Test
  public void test8()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[9];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      dBForeignKeyConstraint0.columnReferencedBy("S", false);
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals("FOREIGN KEY (, , , , , , , , ) REFERENCES null(, , , , , , , , )", dBForeignKeyConstraint0.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[5];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("s00$", false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      DBForeignKeyConstraint dBForeignKeyConstraint1 = new DBForeignKeyConstraint((String) null, false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      assertEquals(2, defaultDBTable0.countProviders());
      assertFalse(dBForeignKeyConstraint1.equals(dBForeignKeyConstraint0));
  }

  @Test
  public void test10()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[5];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      DBForeignKeyConstraint dBForeignKeyConstraint1 = new DBForeignKeyConstraint((String) null, false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      assertEquals(1, defaultDBTable0.countProviders());
      assertTrue(dBForeignKeyConstraint1.equals(dBForeignKeyConstraint0));
  }

  @Test
  public void test11()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[19];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("-~nP9&/`", true, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBForeignKeyConstraint0.isIdentical((DBObject) null);
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[9];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint((String) null, true, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBForeignKeyConstraint0.isIdentical((DBObject) defaultDBTable0);
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null);
      String[] stringArray0 = new String[5];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("s00$", false, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBForeignKeyConstraint0.equals((Object) null);
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals(false, boolean0);
  }

  @Test
  public void test14()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[10];
      DBForeignKeyConstraint dBForeignKeyConstraint0 = new DBForeignKeyConstraint("v](q{o=o3h=O$", true, (DBTable) defaultDBTable0, stringArray0, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBForeignKeyConstraint0.equals((Object) "v](q{o=o3h=O$");
      assertEquals(1, defaultDBTable0.countProviders());
      assertEquals(false, boolean0);
  }
}
