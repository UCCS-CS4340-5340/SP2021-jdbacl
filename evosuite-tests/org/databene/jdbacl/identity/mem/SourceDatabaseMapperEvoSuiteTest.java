/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.identity.mem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.databene.jdbacl.identity.IdentityModel;
import org.databene.jdbacl.identity.KeyMapper;
import org.databene.jdbacl.identity.UniqueKeyIdentity;
import org.databene.jdbacl.identity.mem.SourceDatabaseMapper;
import org.databene.jdbacl.model.Database;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SourceDatabaseMapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SourceDatabaseMapper sourceDatabaseMapper0 = new SourceDatabaseMapper((KeyMapper) null, (Connection) null, "", (Database) null);
      String[] stringArray0 = new String[4];
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("", stringArray0);
      sourceDatabaseMapper0.store((IdentityModel) uniqueKeyIdentity0, (Object) "", "", (Object) null);
      String string0 = sourceDatabaseMapper0.getNaturalKey((IdentityModel) uniqueKeyIdentity0, (Object) "socketBufferSize");
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      SourceDatabaseMapper sourceDatabaseMapper0 = new SourceDatabaseMapper((KeyMapper) null, (Connection) null, "", (Database) null);
      String[] stringArray0 = new String[4];
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("", stringArray0);
      // Undeclared exception!
      try {
        sourceDatabaseMapper0.getNaturalKey((IdentityModel) uniqueKeyIdentity0, (Object) "socketBufferSize");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      SourceDatabaseMapper sourceDatabaseMapper0 = new SourceDatabaseMapper((KeyMapper) null, (Connection) null, "", (Database) null);
      String[] stringArray0 = new String[4];
      UniqueKeyIdentity uniqueKeyIdentity0 = new UniqueKeyIdentity("", stringArray0);
      // Undeclared exception!
      try {
        sourceDatabaseMapper0.getTargetPK((IdentityModel) uniqueKeyIdentity0, (Object) "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
