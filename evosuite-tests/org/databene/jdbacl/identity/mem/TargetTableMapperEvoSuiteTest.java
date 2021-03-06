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
import org.databene.jdbacl.identity.IdentityProvider;
import org.databene.jdbacl.identity.KeyMapper;
import org.databene.jdbacl.identity.NkPkQueryIdentity;
import org.databene.jdbacl.identity.mem.MemKeyMapper;
import org.databene.jdbacl.identity.mem.TargetTableMapper;
import org.databene.jdbacl.model.Database;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TargetTableMapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IdentityProvider identityProvider0 = new IdentityProvider();
      MemKeyMapper memKeyMapper0 = new MemKeyMapper((Connection) null, "", (Connection) null, "", identityProvider0, (Database) null);
      TargetTableMapper targetTableMapper0 = new TargetTableMapper((KeyMapper) memKeyMapper0, (Connection) null, "", (IdentityModel) null, (Database) null);
      // Undeclared exception!
      try {
        targetTableMapper0.getTargetId("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      IdentityProvider identityProvider0 = new IdentityProvider();
      MemKeyMapper memKeyMapper0 = new MemKeyMapper((Connection) null, "", (Connection) null, "", identityProvider0, (Database) null);
      NkPkQueryIdentity nkPkQueryIdentity0 = new NkPkQueryIdentity("", "");
      TargetTableMapper targetTableMapper0 = new TargetTableMapper((KeyMapper) memKeyMapper0, (Connection) null, "", (IdentityModel) nkPkQueryIdentity0, (Database) null);
      // Undeclared exception!
      try {
        targetTableMapper0.store((Object) null, "");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
