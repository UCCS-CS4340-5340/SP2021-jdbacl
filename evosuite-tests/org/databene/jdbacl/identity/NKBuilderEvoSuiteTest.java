/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.identity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.jdbacl.identity.NKBuilder;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class NKBuilderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      NKBuilder nKBuilder0 = new NKBuilder();
      String string0 = nKBuilder0.toString();
      assertNotNull(string0);
      assertEquals(true, nKBuilder0.empty);
  }

  @Test
  public void test1()  throws Throwable  {
      NKBuilder nKBuilder0 = new NKBuilder();
      nKBuilder0.empty = false;
      nKBuilder0.addComponent((Object) null);
      assertEquals("|", nKBuilder0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      NKBuilder nKBuilder0 = new NKBuilder();
      nKBuilder0.addComponent((Object) "");
      assertEquals("", nKBuilder0.toString());
      assertEquals(false, nKBuilder0.empty);
  }
}
