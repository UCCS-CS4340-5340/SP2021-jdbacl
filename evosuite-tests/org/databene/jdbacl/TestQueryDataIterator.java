/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.sql.Connection;
import org.databene.jdbacl.QueryDataIterator;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestQueryDataIterator {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      QueryDataIterator queryDataIterator0 = null;
      try {
        queryDataIterator0 = new QueryDataIterator("z0Xnd<_u:<$0or", (Connection) null, (-7));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
