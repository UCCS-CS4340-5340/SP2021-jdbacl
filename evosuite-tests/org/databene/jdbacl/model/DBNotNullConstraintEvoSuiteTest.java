/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.CompositeDBObject;
import org.databene.jdbacl.model.DBNotNullConstraint;
import org.databene.jdbacl.model.DBObject;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBNotNullConstraintEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pCURRENT_UfER");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("pCURRENT_UfER", (DBTable) defaultDBTable0, 99, "pCURRENT_UfER");
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint((DBTable) defaultDBTable0, "pCURRENT_UfER", false, "pCURRENT_UfER");
      assertNotNull(dBNotNullConstraint0);
      
      String string0 = dBNotNullConstraint0.toString();
      assertNotNull(string0);
      assertEquals("DBNotNullConstraint[pCURRENT_UfER[pCURRENT_UfER]]", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pCURRENT_UfER");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("pCURRENT_UfER", (DBTable) defaultDBTable0, 99, "pCURRENT_UfER");
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint((DBTable) defaultDBTable0, "pCURRENT_UfER", false, "pCURRENT_UfER");
      boolean boolean0 = dBNotNullConstraint0.isIdentical((DBObject) defaultDBColumn0);
      assertEquals("pCURRENT_UfER : PCURRENT_UFER NOT NULL", defaultDBColumn0.toString());
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pCURRENT_UfER");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("pCURRENT_UfER", (DBTable) defaultDBTable0, 99, "pCURRENT_UfER");
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint((DBTable) defaultDBTable0, "pCURRENT_UfER", false, "pCURRENT_UfER");
      assertNotNull(dBNotNullConstraint0);
      
      boolean boolean0 = dBNotNullConstraint0.isIdentical((DBObject) null);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pCURRENT_UfER");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("pCURRENT_UfER", (DBTable) defaultDBTable0, 99, "pCURRENT_UfER");
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint((DBTable) defaultDBTable0, "pCURRENT_UfER", false, "pCURRENT_UfER");
      assertNotNull(dBNotNullConstraint0);
      
      DBNotNullConstraint dBNotNullConstraint1 = new DBNotNullConstraint((DBTable) defaultDBTable0, "pCURRENT_UfER", false, "pCURRENT_UfER");
      boolean boolean0 = dBNotNullConstraint1.isIdentical((DBObject) dBNotNullConstraint0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable("pCURRENT_UfER");
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("pCURRENT_UfER", (DBTable) defaultDBTable0, 99, "pCURRENT_UfER");
      DBNotNullConstraint dBNotNullConstraint0 = new DBNotNullConstraint((DBTable) defaultDBTable0, "pCURRENT_UfER", false, "pCURRENT_UfER");
      assertNotNull(dBNotNullConstraint0);
      
      DBNotNullConstraint dBNotNullConstraint1 = new DBNotNullConstraint((DBTable) defaultDBTable0, "pCURRENT_UfER", false, "pCURRENT_UfER");
      DefaultDBTable defaultDBTable1 = new DefaultDBTable();
      dBNotNullConstraint0.setOwner((CompositeDBObject<?>) defaultDBTable1);
      boolean boolean0 = dBNotNullConstraint0.isIdentical((DBObject) dBNotNullConstraint1);
      assertEquals(false, boolean0);
  }
}
