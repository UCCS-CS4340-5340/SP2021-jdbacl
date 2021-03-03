/*
 * This file was automatically generated by EvoSuite
 */

package org.databene.jdbacl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import org.databene.jdbacl.ColumnInfo;
import org.databene.jdbacl.dialect.DB2Dialect;
import org.databene.jdbacl.dialect.Derby10_6Dialect;
import org.databene.jdbacl.dialect.DerbyDialect;
import org.databene.jdbacl.dialect.FirebirdDialect;
import org.databene.jdbacl.dialect.HSQLDialect;
import org.databene.jdbacl.dialect.MySQLDialect;
import org.databene.jdbacl.dialect.OracleDialect;
import org.databene.jdbacl.dialect.PostgreSQLDialect;
import org.databene.jdbacl.dialect.SqlServerDialect;
import org.databene.jdbacl.dialect.UnknownDialect;
import org.databene.jdbacl.model.DBCatalog;
import org.databene.jdbacl.model.DBSchema;
import org.databene.jdbacl.model.DBSequence;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DefaultDBTable;
import org.h2.value.ValueLong;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DatabaseDialectEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HSQLDialect hSQLDialect0 = new HSQLDialect();
      hSQLDialect0.getSystem();
  }

  @Test
  public void test1()  throws Throwable  {
      DerbyDialect derbyDialect0 = new DerbyDialect();
      assertNotNull(derbyDialect0);
      
      // Undeclared exception!
      try {
        derbyDialect0.getSequence("'null'", (Connection) null);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DBSchema dBSchema0 = new DBSchema((String) null);
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      assertNotNull(mySQLDialect0);
      
      mySQLDialect0.queryPackages(dBSchema0, (Connection) null);
      assertEquals("mysql", mySQLDialect0.getSystem());
      assertEquals(false, mySQLDialect0.isSequenceSupported());
  }

  @Test
  public void test3()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      assertNotNull(mySQLDialect0);
      
      boolean boolean0 = mySQLDialect0.isSequenceSupported();
      assertEquals("mysql", mySQLDialect0.getSystem());
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      assertNotNull(sqlServerDialect0);
      
      boolean boolean0 = sqlServerDialect0.supportsRegex();
      assertEquals("sql_server", sqlServerDialect0.getSystem());
      assertEquals(false, sqlServerDialect0.isSequenceSupported());
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      DerbyDialect derbyDialect0 = new DerbyDialect(true);
      assertNotNull(derbyDialect0);
      
      // Undeclared exception!
      try {
        derbyDialect0.renderFetchSequenceValue("org.databene.jdbacl.dialect.OracleDialect@21ba39f2");
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * nextSequenceValue() not implemented
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      // Undeclared exception!
      try {
        derby10_6Dialect0.regexQuery("CREATE SEQUENCE ", true, "CREATE SEQUENCE ");
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * derby does not support regular expressions
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      UnknownDialect unknownDialect0 = new UnknownDialect("'null'");
      assertNotNull(unknownDialect0);
      
      unknownDialect0.queryTriggers((DBSchema) null, (Connection) null);
      assertEquals("'null'", unknownDialect0.getSystem());
      assertEquals(false, unknownDialect0.isSequenceSupported());
      assertEquals(false, unknownDialect0.isSequenceBoundarySupported());
  }

  @Test
  public void test8()  throws Throwable  {
      DerbyDialect derbyDialect0 = new DerbyDialect();
      assertNotNull(derbyDialect0);
      
      String string0 = derbyDialect0.sequenceNoCycle();
      assertEquals("NOCYCLE", string0);
      assertEquals(false, derbyDialect0.isSequenceSupported());
      assertEquals("derby", derbyDialect0.getSystem());
  }

  @Test
  public void test9()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      assertNotNull(mySQLDialect0);
      
      // Undeclared exception!
      try {
        mySQLDialect0.createSequence("%BQe`re.5/ro<*", 121L, (Connection) null);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Sequence not supported in mysql
         */
      }
  }

  @Test
  public void test10()  throws Throwable  {
      DB2Dialect dB2Dialect0 = new DB2Dialect();
      assertNotNull(dB2Dialect0);
      
      // Undeclared exception!
      try {
        dB2Dialect0.createSequence((String) null, (long) (byte)0, (Connection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      DBSequence dBSequence0 = new DBSequence("z.B-]QZm0-c", "z.B-]QZm0-c", "z.B-]QZm0-c");
      dBSequence0.setStart((BigInteger) null);
      String string0 = derby10_6Dialect0.renderCreateSequence(dBSequence0);
      assertNotNull(string0);
      assertEquals(true, derby10_6Dialect0.isSequenceBoundarySupported());
      assertEquals("derby", derby10_6Dialect0.getSystem());
      assertEquals("CREATE SEQUENCE z.B-]QZm0-c.z.B-]QZm0-c AS BIGINT", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      DBSequence dBSequence0 = new DBSequence("z.B-]QZm0-c", "z.B-]QZm0-c", "z.B-]QZm0-c");
      BigInteger bigInteger0 = BigInteger.ZERO;
      dBSequence0.setStart(bigInteger0);
      String string0 = derby10_6Dialect0.renderCreateSequence(dBSequence0);
      assertNotNull(string0);
      assertEquals(true, derby10_6Dialect0.isSequenceBoundarySupported());
      assertEquals("derby", derby10_6Dialect0.getSystem());
      assertEquals("CREATE SEQUENCE z.B-]QZm0-c.z.B-]QZm0-c AS BIGINT START WITH 0", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      DBSequence dBSequence0 = new DBSequence("z.B-]QZm0-c", "z.B-]QZm0-c", "z.B-]QZm0-c");
      dBSequence0.setIncrement((BigInteger) null);
      String string0 = derby10_6Dialect0.renderCreateSequence(dBSequence0);
      assertEquals("derby", derby10_6Dialect0.getSystem());
      assertEquals("CREATE SEQUENCE z.B-]QZm0-c.z.B-]QZm0-c AS BIGINT", string0);
      assertEquals(true, derby10_6Dialect0.isSequenceBoundarySupported());
      assertNotNull(string0);
  }

  @Test
  public void test14()  throws Throwable  {
      SqlServerDialect sqlServerDialect0 = new SqlServerDialect();
      assertNotNull(sqlServerDialect0);
      
      BigInteger bigInteger0 = ValueLong.MAX;
      DBSequence dBSequence0 = new DBSequence("", "", "");
      dBSequence0.setIncrement(bigInteger0);
      String string0 = sqlServerDialect0.renderCreateSequence(dBSequence0);
      assertEquals("sql_server", sqlServerDialect0.getSystem());
      assertNotNull(string0);
      assertEquals(false, sqlServerDialect0.isSequenceSupported());
      assertEquals("CREATE SEQUENCE  INCREMENT BY 9223372036854775807", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      DBSequence dBSequence0 = new DBSequence("z.B-]QZm0-c", "z.B-]QZm0-c", "z.B-]QZm0-c");
      BigInteger bigInteger0 = BigInteger.ONE;
      dBSequence0.setMaxValue(bigInteger0);
      String string0 = derby10_6Dialect0.renderCreateSequence(dBSequence0);
      assertEquals("CREATE SEQUENCE z.B-]QZm0-c.z.B-]QZm0-c AS BIGINT MAXVALUE 1", string0);
      assertEquals(true, derby10_6Dialect0.isSequenceBoundarySupported());
      assertNotNull(string0);
      assertEquals("derby", derby10_6Dialect0.getSystem());
  }

  @Test
  public void test16()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      DBSequence dBSequence0 = new DBSequence("z.B-]QZm0-c", "z.B-]QZm0-c", "z.B-]QZm0-c");
      BigInteger bigInteger0 = BigInteger.ONE;
      dBSequence0.setMinValue(bigInteger0);
      String string0 = derby10_6Dialect0.renderCreateSequence(dBSequence0);
      assertNotNull(string0);
      assertEquals("derby", derby10_6Dialect0.getSystem());
      assertEquals(true, derby10_6Dialect0.isSequenceBoundarySupported());
      assertEquals("CREATE SEQUENCE z.B-]QZm0-c.z.B-]QZm0-c AS BIGINT MINVALUE 1", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      DBSequence dBSequence0 = new DBSequence("z.B-]QZm0-c", "z.B-]QZm0-c", "z.B-]QZm0-c");
      Boolean boolean0 = Boolean.valueOf(true);
      dBSequence0.setCycle(boolean0);
      String string0 = derby10_6Dialect0.renderCreateSequence(dBSequence0);
      assertEquals("derby", derby10_6Dialect0.getSystem());
      assertEquals("CREATE SEQUENCE z.B-]QZm0-c.z.B-]QZm0-c AS BIGINT CYCLE", string0);
      assertEquals(true, derby10_6Dialect0.isSequenceBoundarySupported());
      assertNotNull(string0);
  }

  @Test
  public void test18()  throws Throwable  {
      Derby10_6Dialect derby10_6Dialect0 = new Derby10_6Dialect();
      assertNotNull(derby10_6Dialect0);
      
      DBSequence dBSequence0 = new DBSequence("z.B-]QZm0-c", "z.B-]QZm0-c", "z.B-]QZm0-c");
      Boolean boolean0 = Boolean.valueOf(false);
      dBSequence0.setCycle(boolean0);
      String string0 = derby10_6Dialect0.renderCreateSequence(dBSequence0);
      assertEquals("derby", derby10_6Dialect0.getSystem());
      assertEquals("CREATE SEQUENCE z.B-]QZm0-c.z.B-]QZm0-c AS BIGINT NO CYCLE", string0);
      assertNotNull(string0);
      assertEquals(true, derby10_6Dialect0.isSequenceBoundarySupported());
  }

  @Test
  public void test19()  throws Throwable  {
      UnknownDialect unknownDialect0 = new UnknownDialect("hsql");
      assertNotNull(unknownDialect0);
      
      // Undeclared exception!
      try {
        unknownDialect0.setNextSequenceValue("hsql", (-956L), (Connection) null);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Sequence not supported in hsql
         */
      }
  }

  @Test
  public void test20()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      assertNotNull(postgreSQLDialect0);
      
      // Undeclared exception!
      try {
        postgreSQLDialect0.setNextSequenceValue((String) null, 668L, (Connection) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      assertNotNull(mySQLDialect0);
      
      // Undeclared exception!
      try {
        mySQLDialect0.renderDropSequence("K%59Zz[T:b7>!p6HL");
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
        /*
         * Sequence not supported in mysql
         */
      }
  }

  @Test
  public void test22()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      assertNotNull(postgreSQLDialect0);
      
      String string0 = postgreSQLDialect0.renderDropSequence("yZ2O0h|TYyX c_");
      assertEquals("drop sequence yZ2O0h|TYyX c_", string0);
      assertEquals(true, postgreSQLDialect0.isSequenceBoundarySupported());
      assertNotNull(string0);
      assertEquals("postgres", postgreSQLDialect0.getSystem());
  }

  @Test
  public void test23()  throws Throwable  {
      PostgreSQLDialect postgreSQLDialect0 = new PostgreSQLDialect();
      assertNotNull(postgreSQLDialect0);
      
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try {
        postgreSQLDialect0.update((DBTable) null, stringArray0, (List<ColumnInfo>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      assertNotNull(mySQLDialect0);
      
      StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "java.awt.+pDesktop");
      String string0 = mySQLDialect0.formatValue((Object) stringBuffer0);
      assertNotNull(string0);
      assertEquals("'java.awt.+pDesktop'", string0);
      assertEquals("mysql", mySQLDialect0.getSystem());
      assertEquals(false, mySQLDialect0.isSequenceBoundarySupported());
  }

  @Test
  public void test25()  throws Throwable  {
      HSQLDialect hSQLDialect0 = new HSQLDialect();
      assertNotNull(hSQLDialect0);
      
      Timestamp timestamp0 = new Timestamp(0L);
      String string0 = hSQLDialect0.formatValue((Object) timestamp0);
      assertEquals("hsql", hSQLDialect0.getSystem());
      assertNotNull(string0);
      assertEquals("'1970-01-01 01:00:00.000000000'", string0);
      assertEquals(true, hSQLDialect0.isSequenceBoundarySupported());
  }

  @Test
  public void test26()  throws Throwable  {
      UnknownDialect unknownDialect0 = new UnknownDialect(",Y8HT#X>MwY.W}s4");
      assertNotNull(unknownDialect0);
      
      Character character0 = new Character('');
      String string0 = unknownDialect0.formatValue((Object) character0);
      assertEquals("''", string0);
      assertNotNull(string0);
      assertEquals(",Y8HT#X>MwY.W}s4", unknownDialect0.getSystem());
      assertEquals(false, unknownDialect0.isSequenceBoundarySupported());
  }

  @Test
  public void test27()  throws Throwable  {
      OracleDialect oracleDialect0 = new OracleDialect();
      assertNotNull(oracleDialect0);
      
      String string0 = oracleDialect0.formatValue((Object) oracleDialect0);
      assertEquals("oracle", oracleDialect0.getSystem());
      assertEquals(true, oracleDialect0.isSequenceBoundarySupported());
      assertNotNull(string0);
  }

  @Test
  public void test28()  throws Throwable  {
      DerbyDialect derbyDialect0 = new DerbyDialect();
      assertNotNull(derbyDialect0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBCatalog dBCatalog0 = new DBCatalog();
      DBSchema dBSchema0 = new DBSchema((String) null, dBCatalog0);
      defaultDBTable0.setSchema(dBSchema0);
      // Undeclared exception!
      try {
        derbyDialect0.insert((DBTable) defaultDBTable0, (List<ColumnInfo>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      DerbyDialect derbyDialect0 = new DerbyDialect();
      assertNotNull(derbyDialect0);
      
      DefaultDBTable defaultDBTable0 = new DefaultDBTable();
      DBCatalog dBCatalog0 = new DBCatalog();
      dBCatalog0.setName("NOCYCLE");
      DBSchema dBSchema0 = new DBSchema("NOCYCLE", dBCatalog0);
      defaultDBTable0.setSchema(dBSchema0);
      // Undeclared exception!
      try {
        derbyDialect0.insert((DBTable) defaultDBTable0, (List<ColumnInfo>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      FirebirdDialect firebirdDialect0 = new FirebirdDialect();
      assertNotNull(firebirdDialect0);
      
      String[] stringArray0 = new String[4];
      String string0 = firebirdDialect0.renderCase((String) null, (String) null, stringArray0);
      assertEquals(true, firebirdDialect0.isSequenceSupported());
      assertEquals("CASE WHEN null THEN null WHEN null THEN null END", string0);
      assertNotNull(string0);
      assertEquals("firebird", firebirdDialect0.getSystem());
  }

  @Test
  public void test31()  throws Throwable  {
      MySQLDialect mySQLDialect0 = new MySQLDialect();
      assertNotNull(mySQLDialect0);
      
      String[] stringArray0 = new String[8];
      String string0 = mySQLDialect0.renderCase("K%59Zz[T:b7>!p6HL", "K%59Zz[T:b7>!p6HL", stringArray0);
      assertEquals("mysql", mySQLDialect0.getSystem());
      assertNotNull(string0);
      assertEquals(false, mySQLDialect0.isSequenceSupported());
      assertEquals("CASE WHEN null THEN null WHEN null THEN null WHEN null THEN null WHEN null THEN null ELSE K%59Zz[T:b7>!p6HL END AS K%59Zz[T:b7>!p6HL", string0);
  }
}
