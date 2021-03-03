/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl.dialect;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.databene.commons.ConnectFailedException;
import org.databene.jdbacl.dialect.H2Util;

@RunWith(EvoSuiteRunner.class)
public class H2UtilEvoSuiteTest {


  //Test case number: 0
  /*
   * 3 covered goals:
   * 1 org.databene.jdbacl.dialect.H2Util.connectInMemoryDB(Ljava/lang/String;I)Ljava/sql/Connection;: root-Branch
   * 2 org.databene.jdbacl.dialect.H2Util.connectInMemoryDB(Ljava/lang/String;)Ljava/sql/Connection;: root-Branch
   * 3 org.databene.jdbacl.dialect.H2Util.getInMemoryURL(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */
  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        H2Util.connectInMemoryDB(",UZs-As{", 168);
        fail("Expecting exception: NoClassDefFoundError");
      } catch(NoClassDefFoundError e) {
        /*
         * Could not initialize class org.databene.jdbacl.DBUtil
         */
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 org.databene.jdbacl.dialect.H2Util.<init>()V: root-Branch
   */
  @Test
  public void test1()  throws Throwable  {
      H2Util h2Util0 = new H2Util();
      assertNotNull(h2Util0);
  }
}
