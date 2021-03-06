/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.model.DBNonUniqueIndex;
import org.databene.jdbacl.model.DBPrimaryKeyConstraint;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.DBUniqueIndex;
import org.databene.jdbacl.model.DefaultDBTable;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DBIndexEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[10];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("M?L(_<.[c", false, (DBTable) defaultDBTable0, stringArray0);
      int int0 = dBNonUniqueIndex0.hashCode();
      assertEquals((-1796951359), int0);
      assertEquals(false, dBNonUniqueIndex0.isNameDeterministic());
  }

  @Test
  public void test1()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[13];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex(" ip<%^", true, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.isNameDeterministic();
      assertEquals(true, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[10];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("M?L(_<.[c", false, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.equals((Object) "M?L(_<.[c (, , , , , , , , , )");
      assertEquals(false, dBNonUniqueIndex0.isNameDeterministic());
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[13];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex(" ip<%^", true, (DBTable) defaultDBTable0, stringArray0);
      boolean boolean0 = dBNonUniqueIndex0.equals((Object) null);
      assertEquals(true, dBNonUniqueIndex0.isNameDeterministic());
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[10];
      DBNonUniqueIndex dBNonUniqueIndex0 = new DBNonUniqueIndex("M?L(_<.[c", false, (DBTable) defaultDBTable0, stringArray0);
      String string0 = dBNonUniqueIndex0.toString();
      assertEquals(false, dBNonUniqueIndex0.isNameDeterministic());
      assertEquals("M?L(_<.[c (, , , , , , , , , )", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      String[] stringArray0 = new String[2];
      DBPrimaryKeyConstraint dBPrimaryKeyConstraint0 = new DBPrimaryKeyConstraint((DBTable) defaultDBTable0, "{fi7b#4N'T ~];=:", false, stringArray0);
      DBUniqueIndex dBUniqueIndex0 = new DBUniqueIndex("{fi7b#4N'T ~];=:", false, (DBUniqueConstraint) dBPrimaryKeyConstraint0);
      String string0 = dBUniqueIndex0.toString();
      assertNotNull(string0);
      assertEquals(false, dBUniqueIndex0.isNameDeterministic());
      assertEquals("{fi7b#4N'T ~];=: (, ) unique", string0);
  }
}
