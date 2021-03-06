/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.identity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.commons.ObjectNotFoundException;
import org.databene.jdbacl.identity.IdentityModel;
import org.databene.jdbacl.identity.IdentityProvider;
import org.databene.jdbacl.identity.NoIdentity;
import org.databene.jdbacl.identity.SubNkPkQueryIdentity;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestIdentityProvider {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IdentityProvider identityProvider0 = new IdentityProvider();
      String[] stringArray0 = new String[2];
      SubNkPkQueryIdentity subNkPkQueryIdentity0 = new SubNkPkQueryIdentity("", stringArray0, identityProvider0);
      identityProvider0.registerIdentity((IdentityModel) subNkPkQueryIdentity0, "");
      identityProvider0.getIdentity("", true);
  }

  @Test
  public void test1()  throws Throwable  {
      IdentityProvider identityProvider0 = new IdentityProvider();
      // Undeclared exception!
      try {
        identityProvider0.getIdentity("GrC<");
        fail("Expecting exception: ObjectNotFoundException");
      } catch(ObjectNotFoundException e) {
        /*
         * No identity defined for table 'GrC<'
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      IdentityProvider identityProvider0 = new IdentityProvider();
      IdentityModel identityModel0 = identityProvider0.getIdentity("G{0v_Hyy", false);
      assertNull(identityModel0);
  }

  @Test
  public void test3()  throws Throwable  {
      IdentityProvider identityProvider0 = new IdentityProvider();
      NoIdentity noIdentity0 = new NoIdentity("");
      identityProvider0.registerIdentity((IdentityModel) noIdentity0, "");
      // Undeclared exception!
      try {
        identityProvider0.getIdentity("", true);
        fail("Expecting exception: ObjectNotFoundException");
      } catch(ObjectNotFoundException e) {
        /*
         * No identity defined for table ''
         */
      }
  }
}
