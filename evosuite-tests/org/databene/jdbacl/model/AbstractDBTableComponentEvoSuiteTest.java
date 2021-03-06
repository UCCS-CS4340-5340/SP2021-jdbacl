/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBColumn;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AbstractDBTableComponentEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("", (DBTable) null, 741, "w");
      DBTable dBTable0 = defaultDBColumn0.getTable();
      assertNull(dBTable0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DefaultDBColumn defaultDBColumn0 = new DefaultDBColumn("pQ_gI*pn$HDW*ls", (DBTable) defaultDBTable0, (-1807), "pQ_gI*pn$HDW*ls");
      assertEquals(false, defaultDBColumn0.isVersionColumn());
  }
}
