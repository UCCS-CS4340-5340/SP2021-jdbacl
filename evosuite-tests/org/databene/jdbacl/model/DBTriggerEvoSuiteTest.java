/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBTrigger;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBTriggerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("=", (DBSchema) null);
      String string0 = dBTrigger0.getTriggeringEvent();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("=", (DBSchema) null);
      dBTrigger0.setTableName("=");
      assertNull(dBTrigger0.getTableOwner());
  }

  @Test
  public void test2()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("=", (DBSchema) null);
      dBTrigger0.setReferencingNames((String) null);
      assertNull(dBTrigger0.getActionType());
  }

  @Test
  public void test3()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("", (DBSchema) null);
      dBTrigger0.setTableOwner((String) null);
      assertNull(dBTrigger0.getDoc());
  }

  @Test
  public void test4()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("", (DBSchema) null);
      dBTrigger0.setDescription((String) null);
      assertEquals("", dBTrigger0.getName());
  }

  @Test
  public void test5()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("", (DBSchema) null);
      String string0 = dBTrigger0.getActionType();
      assertNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("", (DBSchema) null);
      dBTrigger0.setColumnName((String) null);
      assertNull(dBTrigger0.getDoc());
  }

  @Test
  public void test7()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("setObjet(String,Object)");
      DBTrigger dBTrigger0 = new DBTrigger("setObjet(String,Object)", dBSchema0);
      dBTrigger0.setWhenClause("setObjet(String,Object)");
      assertEquals("setObjet(String,Object)", dBTrigger0.getName());
  }

  @Test
  public void test8()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("`");
      DBSchema dBSchema0 = new DBSchema("`", dBCatalog0);
      DBTrigger dBTrigger0 = new DBTrigger("`", dBSchema0);
      String string0 = dBTrigger0.getDescription();
      assertNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("setObjet(String,Object)");
      DBTrigger dBTrigger0 = new DBTrigger("setObjet(String,Object)", dBSchema0);
      String string0 = dBTrigger0.getTriggerType();
      assertNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("=", (DBSchema) null);
      String string0 = dBTrigger0.getColumnName();
      assertNull(string0);
  }

  @Test
  public void test11()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("", (DBSchema) null);
      String string0 = dBTrigger0.getStatus();
      assertNull(string0);
  }

  @Test
  public void test12()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("", (DBSchema) null);
      String string0 = dBTrigger0.getTableOwner();
      assertNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("setObjet(String,Object)");
      DBTrigger dBTrigger0 = new DBTrigger("setObjet(String,Object)", dBSchema0);
      String string0 = dBTrigger0.getTableName();
      assertNull(string0);
  }

  @Test
  public void test14()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("setObjet(String,Object)");
      DBTrigger dBTrigger0 = new DBTrigger("setObjet(String,Object)", dBSchema0);
      String string0 = dBTrigger0.getBaseObjectType();
      assertNull(string0);
  }

  @Test
  public void test15()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("setObjet(String,Object)");
      DBTrigger dBTrigger0 = new DBTrigger("setObjet(String,Object)", dBSchema0);
      String string0 = dBTrigger0.getWhenClause();
      assertNull(string0);
  }

  @Test
  public void test16()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("setObjet(String,Object)");
      DBTrigger dBTrigger0 = new DBTrigger("setObjet(String,Object)", dBSchema0);
      String string0 = dBTrigger0.getReferencingNames();
      assertNull(string0);
  }

  @Test
  public void test17()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("", (DBSchema) null);
      String string0 = dBTrigger0.getTriggerBody();
      assertNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog("`");
      DBSchema dBSchema0 = new DBSchema("`", dBCatalog0);
      DBTrigger dBTrigger0 = new DBTrigger("`", dBSchema0);
      boolean boolean0 = dBTrigger0.isIdentical((DBObject) dBSchema0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test19()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("=", (DBSchema) null);
      assertNotNull(dBTrigger0);
      
      dBTrigger0.setTriggerType("=");
      DBTrigger dBTrigger1 = new DBTrigger("=", (DBSchema) null);
      boolean boolean0 = dBTrigger0.isIdentical((DBObject) dBTrigger1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test20()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema("setObjet(String,Object)");
      DBTrigger dBTrigger0 = new DBTrigger("setObjet(String,Object)", dBSchema0);
      dBTrigger0.setTriggeringEvent("setObjet(String,Object)");
      dBTrigger0.setStatus("setObjet(String,Object)");
      dBTrigger0.setBaseObjectType("setObjet(String,Object)");
      dBTrigger0.setTriggerBody("setObjet(String,Object)");
      dBTrigger0.setActionType("setObjet(String,Object)");
      dBTrigger0.setTriggerType("setObjet(String,Object)");
      boolean boolean0 = dBTrigger0.isIdentical((DBObject) dBTrigger0);
      assertEquals(true, boolean0);
  }
}
