/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.identity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.databene.jdbacl.identity.IdentityProvider;
import org.databene.jdbacl.identity.KeyMapper;
import org.databene.jdbacl.identity.SubNkPkQueryIdentity;
import org.databene.jdbacl.model.Database;
import org.hsqldb.HsqlException;
import org.hsqldb.Session;
import org.hsqldb.jdbc.jdbcConnection;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SubNkPkQueryIdentityEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      IdentityProvider identityProvider0 = new IdentityProvider();
      SubNkPkQueryIdentity subNkPkQueryIdentity0 = new SubNkPkQueryIdentity("", stringArray0, identityProvider0);
      subNkPkQueryIdentity0.setSubNkPkQuery("");
      assertEquals("", subNkPkQueryIdentity0.getTableName());
  }

  @Test
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[10];
      SubNkPkQueryIdentity subNkPkQueryIdentity0 = new SubNkPkQueryIdentity("XML_DARSING - Prsing error on line ", stringArray0, (IdentityProvider) null);
      jdbcConnection jdbcConnection0 = new jdbcConnection((Session) null);
      // Undeclared exception!
      try {
        subNkPkQueryIdentity0.createNkPkIterator((Connection) jdbcConnection0, "XML_DARSING - Prsing error on line ", (KeyMapper) null, (Database) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[3];
      IdentityProvider identityProvider0 = new IdentityProvider();
      SubNkPkQueryIdentity subNkPkQueryIdentity0 = new SubNkPkQueryIdentity("", stringArray0, identityProvider0);
      String string0 = subNkPkQueryIdentity0.getDescription();
      assertNotNull(string0);
      assertEquals("Sub identity of (, , ):\nnull", string0);
  }
}
