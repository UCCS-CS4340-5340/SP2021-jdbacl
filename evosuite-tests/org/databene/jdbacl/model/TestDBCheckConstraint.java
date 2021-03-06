/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.DBCheckConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDBCheckConstraint {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, false, "moveToInsertRow", "moveToInsertRow");
      dBCheckConstraint0.getColumnNames();
  }

  @Test
  public void test1()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("-db", true, "-db", "-db");
      String string0 = dBCheckConstraint0.getTableName();
      assertEquals("-db", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("moveToInsertRow");
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("moveToInsertRow", false, (DBTable) defaultDBTable0, "E");
      String string0 = dBCheckConstraint0.toString();
      assertEquals("moveToInsertRow", dBCheckConstraint0.getTableName());
      assertEquals("CONSTRAINT moveToInsertRowCHECK E", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint(" GXsW", false, " GXsW", " GXsW");
      DBCheckConstraint dBCheckConstraint1 = new DBCheckConstraint(" GXsW", false, " GXsW", " GXsW");
      boolean boolean0 = dBCheckConstraint0.isIdentical((DBObject) dBCheckConstraint1);
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("-db", true, "-db", "-db");
      assertNotNull(dBCheckConstraint0);
      
      DBSchema dBSchema0 = new DBSchema("p");
      boolean boolean0 = dBCheckConstraint0.isIdentical((DBObject) dBSchema0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("9", false, "9", "9");
      assertNotNull(dBCheckConstraint0);
      
      boolean boolean0 = dBCheckConstraint0.isIdentical((DBObject) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, false, "moveToInsertRow", "moveToInsertRow");
      assertNotNull(dBCheckConstraint0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("moveToInsertRow");
      DBCheckConstraint dBCheckConstraint1 = new DBCheckConstraint("moveToInsertRow", false, (DBTable) defaultDBTable0, "E");
      boolean boolean0 = dBCheckConstraint1.isIdentical((DBObject) dBCheckConstraint0);
      assertEquals("E", dBCheckConstraint1.getConditionText());
      assertEquals(false, boolean0);
      assertEquals("moveToInsertRow", dBCheckConstraint1.getTableName());
  }

  @Test
  public void test7()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("-db", true, "-db", "-db");
      assertNotNull(dBCheckConstraint0);
      
      DBCheckConstraint dBCheckConstraint1 = new DBCheckConstraint("-db", true, "-db", "p");
      boolean boolean0 = dBCheckConstraint0.isIdentical((DBObject) dBCheckConstraint1);
      assertEquals("-db", dBCheckConstraint1.getTableName());
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint("9", false, "9", "9");
      assertNotNull(dBCheckConstraint0);
      
      DBCheckConstraint dBCheckConstraint1 = new DBCheckConstraint("9", false, (String) null, "9");
      assertNotNull(dBCheckConstraint1);
      
      boolean boolean0 = dBCheckConstraint0.isEquivalent(dBCheckConstraint1);
      assertEquals(false, boolean0);
      assertEquals("CONSTRAINT 9CHECK 9", dBCheckConstraint1.toString());
  }

  @Test
  public void test9()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, false, "moveToInsertRow", "moveToInsertRow");
      assertNotNull(dBCheckConstraint0);
      
      boolean boolean0 = dBCheckConstraint0.isEquivalent(dBCheckConstraint0);
      assertEquals("CHECK moveToInsertRow", dBCheckConstraint0.toString());
      assertEquals(true, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, false, "moveToInsertRow", "moveToInsertRow");
      assertNotNull(dBCheckConstraint0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("moveToInsertRow");
      DBCheckConstraint dBCheckConstraint1 = new DBCheckConstraint("moveToInsertRow", false, (DBTable) defaultDBTable0, "E");
      boolean boolean0 = dBCheckConstraint0.isEquivalent(dBCheckConstraint1);
      assertEquals("moveToInsertRow", dBCheckConstraint1.getTableName());
      assertEquals(false, boolean0);
      assertEquals("CHECK moveToInsertRow", dBCheckConstraint0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      DBCheckConstraint dBCheckConstraint0 = new DBCheckConstraint((String) null, false, "moveToInsertRow", "moveToInsertRow");
      assertNotNull(dBCheckConstraint0);
      
      String string0 = dBCheckConstraint0.toString();
      assertNotNull(string0);
      assertEquals("CHECK moveToInsertRow", string0);
  }
}
