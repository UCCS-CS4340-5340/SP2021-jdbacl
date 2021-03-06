/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.identity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.databene.commons.ConfigurationError;
import org.databene.commons.ObjectNotFoundException;
import org.databene.commons.iterator.TableRowIterator;
import org.databene.commons.version.VersionNumber;
import org.databene.jdbacl.identity.IdentityProvider;
import org.databene.jdbacl.identity.KeyMapper;
import org.databene.jdbacl.identity.UniqueKeyIdentity;
import org.databene.jdbacl.identity.mem.MemKeyMapper;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DefaultDatabase;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class UniqueKeyIdentityEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[17];
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("Wcp", stringArray0);
      UniqueKeyIdentity.ColumnToNkConverter uniqueKeyIdentity_ColumnToNkConverter0 = uniqueKeyIdentity0.new ColumnToNkConverter("Wcp", (KeyMapper) null);
      UniqueKeyIdentity.UniqueKeyNkPkIterator uniqueKeyIdentity_UniqueKeyNkPkIterator0 = uniqueKeyIdentity0.new UniqueKeyNkPkIterator((TableRowIterator) null, uniqueKeyIdentity_ColumnToNkConverter0, stringArray0);
      String[] stringArray1 = uniqueKeyIdentity_UniqueKeyNkPkIterator0.getColumnLabels();
      assertNotNull(stringArray1);
      assertEquals("Identity definition by unique key: , , , , , , , , , , , , , , , , ", uniqueKeyIdentity0.getDescription());
      assertNotSame(stringArray0, stringArray1);
  }

  @Test
  public void test1()  throws Throwable  {
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("CONSTNT", (String[]) null);
      String string0 = uniqueKeyIdentity0.getDescription();
      assertNotNull(string0);
      assertEquals("Identity definition by unique key: ", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[9];
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("", stringArray0);
      IdentityProvider identityProvider0 = new IdentityProvider();
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("", "", (VersionNumber) null);
      MemKeyMapper memKeyMapper0 = new MemKeyMapper((Connection) null, (String) null, (Connection) null, (String) null, identityProvider0, (Database) defaultDatabase0);
      // Undeclared exception!
      try {
        uniqueKeyIdentity0.createNkPkIterator((Connection) null, (String) null, (KeyMapper) memKeyMapper0, (Database) defaultDatabase0);
        fail("Expecting exception: ObjectNotFoundException");
      } catch(ObjectNotFoundException e) {
        /*
         * Table ''
         */
      }
  }

  @Test
  public void test3()  throws Throwable  {
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("CONSTNT", (String[]) null);
      IdentityProvider identityProvider0 = new IdentityProvider();
      DefaultDatabase defaultDatabase0 = new DefaultDatabase("CONSTNT", "CONSTNT", (VersionNumber) null);
      MemKeyMapper memKeyMapper0 = new MemKeyMapper((Connection) null, "CONSTNT", (Connection) null, "CONSTNT", identityProvider0, (Database) defaultDatabase0);
      // Undeclared exception!
      try {
        uniqueKeyIdentity0.createNkPkIterator((Connection) null, "CONSTNT", (KeyMapper) memKeyMapper0, (Database) defaultDatabase0);
        fail("Expecting exception: ConfigurationError");
      } catch(ConfigurationError e) {
        /*
         * No unique key columns defined
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[7];
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("njUqG", stringArray0);
      UniqueKeyIdentity.ColumnToNkConverter uniqueKeyIdentity_ColumnToNkConverter0 = uniqueKeyIdentity0.new ColumnToNkConverter((String) null, (KeyMapper) null);
      Object[] objectArray0 = new Object[8];
      Object[] objectArray1 = uniqueKeyIdentity_ColumnToNkConverter0.convert(objectArray0);
      assertNotNull(objectArray1);
      assertEquals("Identity definition by unique key: , , , , , , ", uniqueKeyIdentity0.getDescription());
  }
}
