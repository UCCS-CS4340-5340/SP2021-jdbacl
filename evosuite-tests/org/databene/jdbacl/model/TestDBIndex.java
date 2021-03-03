/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.DBNonUniqueIndex;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestDBIndex {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("x/", true, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.equals((Object) "x/");
      assertEquals(true, dBNonUniqueIndex0.isNameDeterministic());
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[5];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("T0IN10", false, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.isNameDeterministic();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[28];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint((DBTable) defaultDBTable0, (String) null, true, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("<", true, dBUniqueConstraint0);
      int int0 = dBUniqueIndex0.hashCode();
      assertEquals(693101697, int0);
      assertEquals(true, dBUniqueIndex0.isNameDeterministic());
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[5];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("T0IN10", false, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.equals((Object) dBNonUniqueIndex0);
      assertEquals(false, dBNonUniqueIndex0.isNameDeterministic());
      assertEquals(true, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[28];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("<", true, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.equals((Object) null);
      assertEquals(false, boolean0);
      assertEquals(true, dBNonUniqueIndex0.isNameDeterministic());
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[1];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("x/", true, (DBTable) defaultDBTable0, stringArray0);
      String string0 = dBNonUniqueIndex0.toString();
      assertEquals(true, dBNonUniqueIndex0.isNameDeterministic());
      assertEquals("x/ ()", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[28];
      DBUniqueConstraint dBUniqueConstraint0 = new DBUniqueConstraint((DBTable) defaultDBTable0, (String) null, true, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("<", true, dBUniqueConstraint0);
      String string0 = dBUniqueIndex0.toString();
      assertNotNull(string0);
      assertEquals("< (, , , , , , , , , , , , , , , , , , , , , , , , , , , ) unique", string0);
      assertEquals(true, dBUniqueIndex0.isNameDeterministic());
  }
}
