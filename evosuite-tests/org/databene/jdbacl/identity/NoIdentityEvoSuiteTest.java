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
import org.databene.jdbacl.identity.NoIdentity;
import org.databene.jdbacl.identity.mem.MemKeyMapper;
import org.databene.jdbacl.model.Database;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NoIdentityEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NoIdentity noIdentity0 = new NoIdentity("");
      IdentityProvider identityProvider0 = new IdentityProvider();
      MemKeyMapper memKeyMapper0 = new MemKeyMapper((Connection) null, "", (Connection) null, "", identityProvider0, (Database) null);
      // Undeclared exception!
      try {
        noIdentity0.createNkPkIterator((Connection) null, "", (KeyMapper) memKeyMapper0, (Database) null);
        fail("Expecting exception: RuntimeException");
      } catch(RuntimeException e) {
        /*
         * No identity defined for table 
         */
      }
  }
}
