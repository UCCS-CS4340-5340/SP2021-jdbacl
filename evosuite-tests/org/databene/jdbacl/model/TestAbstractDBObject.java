/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBTrigger;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAbstractDBObject {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger("^<)#qHl](#+5", (DBSchema) null);
      DBTrigger dBTrigger1 = new DBTrigger("^<)#qHl](#+5", (DBSchema) null);
      boolean boolean0 = dBTrigger0.equals((Object) dBTrigger1);
      assertEquals(true, boolean0);
      assertEquals("trigger", dBTrigger1.getObjectType());
      assertEquals("^<)#qHl](#+5", dBTrigger1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      DBSequence dBSequence0 = new DBSequence("$", (DBSchema) null);
      dBSequence0.setDoc("$");
      assertEquals("$", dBSequence0.toString());
      assertEquals("sequence", dBSequence0.getObjectType());
  }

  @Test
  public void test2()  throws Throwable  {
      DBTrigger dBTrigger0 = new DBTrigger((String) null, (DBSchema) null);
      String string0 = dBTrigger0.getDoc();
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable((String) null, (DBSchema) null);
      defaultDBTable0.setName((String) null);
      assertEquals("table", defaultDBTable0.getObjectType());
  }

  @Test
  public void test4()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      String string0 = dBCatalog0.toString();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      int int0 = dBCatalog0.hashCode();
      assertEquals(0, int0);
  }

  @Test
  public void test6()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      dBCatalog0.setName("^<)#qHl](#+5");
      int int0 = dBCatalog0.hashCode();
      assertEquals((-1768618363), int0);
  }

  @Test
  public void test7()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBTrigger dBTrigger0 = new DBTrigger("^<)#qHl](#+5", (DBSchema) null);
      boolean boolean0 = dBCatalog0.equals((Object) dBTrigger0);
      assertEquals(false, boolean0);
      assertEquals("trigger", dBTrigger0.getObjectType());
      assertEquals("^<)#qHl](#+5", dBTrigger0.toString());
  }

  @Test
  public void test8()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      boolean boolean0 = dBCatalog0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      boolean boolean0 = dBCatalog0.equals((Object) "<%j~0B]*H{n1z30W(");
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      DBCatalog dBCatalog0 = new DBCatalog();
      DBTrigger dBTrigger0 = new DBTrigger((String) null, (DBSchema) null);
      boolean boolean0 = dBCatalog0.equals((Object) dBTrigger0);
      assertEquals(false, boolean0);
  }
}
