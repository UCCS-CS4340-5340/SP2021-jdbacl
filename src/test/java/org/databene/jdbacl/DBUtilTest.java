/*
 * (c) Copyright 2008-2011 by Volker Bergmann. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, is permitted under the terms of the
 * GNU General Public License.
 *
 * For redistributing this software or a derivative work under a license other
 * than the GPL-compatible Free Software License as defined by the Free
 * Software Foundation or approved by OSI, you must first obtain a commercial
 * license to this software product from Volker Bergmann.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * WITHOUT A WARRANTY OF ANY KIND. ALL EXPRESS OR IMPLIED CONDITIONS,
 * REPRESENTATIONS AND WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE
 * HEREBY EXCLUDED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.databene.jdbacl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;

import org.databene.commons.ArrayUtil;
import org.databene.commons.ConnectFailedException;
import org.databene.commons.Encodings;
import org.databene.commons.ErrorHandler;
import org.databene.jdbacl.dialect.HSQLUtil;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Tests the {@link DBUtil} class.<br/><br/>
 * Created at 03.05.2008 15:53:49
 * @since 0.5.3
 * @author Volker Bergmann
 */
public class DBUtilTest {

	String SCRIPT_FILE = "org/databene/jdbacl/create_tables.hsql.sql";
	String TEST_ENV = "org/databene/jdbacl/test";
	
	@Test
	// ds-5
	public void test_environment_exists() 
	{
		boolean exists = DBUtil.existsEnvironment(TEST_ENV);
		assertTrue(exists);
	}
	
	@Test
	// ds-6
	public void test_environment_properties() 
	{
		JDBCConnectData props = DBUtil.getConnectData(TEST_ENV);
		assertEquals(props.driver, "test_driver");
		assertEquals(props.url, "test_url");
		assertEquals(props.user, "test_user");
		assertEquals(props.password, "test_password");
		assertEquals(props.catalog, "test_catalog");
		assertEquals(props.schema, "test_schema");
	}
	
	@Test
	public void testRunScript() throws Exception {
		Connection connection = HSQLUtil.connectInMemoryDB(getClass().getSimpleName());
		ErrorHandler errorHandler = new ErrorHandler(getClass());
		try 
		{
			DBExecutionResult result = DBUtil.runScript(SCRIPT_FILE, Encodings.ISO_8859_1, connection, true, errorHandler);
			assertTrue(result.changedStructure);
		}
		catch(Exception e)
		{
			// Do nothing. Table exists from another function running this script.
		}		
		Object[][] rows = (Object[][]) DBUtil.queryAndSimplify("select * from T1", connection);
		assertEquals(1, rows.length);
		assertTrue(Arrays.equals(ArrayUtil.buildObjectArrayOfType(Object.class, 1, "R&B"), rows[0]));
		int count = (Integer) DBUtil.queryAndSimplify("select count(*) from T1", connection);
		assertEquals(1, count);
	}
	
	// Test that rely on the run script in the above test
	// Sometimes this test fails for no reason
	@Test
	// ds-7
	public void test_count_rows() throws Exception
	{
		Connection connection = HSQLUtil.connectInMemoryDB(getClass().getSimpleName());
		ErrorHandler errorHandler = new ErrorHandler(getClass());
		try 
		{
			DBExecutionResult result = DBUtil.runScript(SCRIPT_FILE, Encodings.ISO_8859_1, connection, true, errorHandler);
		}
		catch(Exception e)
		{
			// Do nothing. Table exists from another function running this script.
		}
		long rows = DBUtil.countRows("T1", connection);
		assertEquals(1, rows);
	}
	
	@Test(expected = ConnectFailedException.class)
	// ds-23
	public void test_connect_env() throws Exception
	{
		DBUtil.connect(TEST_ENV, true);
	}
	
	@Test
	// ds-24
	public void test_connect_available() throws Exception
	{
		assertFalse(DBUtil.available("url", "driverClass", "user", "password"));
	}
	
	@Test(expected = IllegalStateException.class)
	// ds-25
	public void test_prepareStatement_readonly() throws Exception
	{
		Connection connection = HSQLUtil.connectInMemoryDB(getClass().getSimpleName());
		PreparedStatement prep = DBUtil.prepareStatement(connection, "sql", true);
	}
	
	@Test//(expected = RuntimeException.class)
	// ds-26
	public void test_prepareStatement_failedQuery() throws Exception
	{
		Connection connection = HSQLUtil.connectInMemoryDB(getClass().getSimpleName());
		DBUtil.prepareStatement(connection, "sql", false);
	}
	
	// For some reason by here the table from above no longer exists \_(^.^)_/
	@Test
	// ds-27
	public void test_prepareStatement() throws Exception
	{
		Connection connection = HSQLUtil.connectInMemoryDB(getClass().getSimpleName());
		ErrorHandler errorHandler = new ErrorHandler(getClass());
		try 
		{
			DBExecutionResult result = DBUtil.runScript(SCRIPT_FILE, Encodings.ISO_8859_1, connection, true, errorHandler);
		}
		catch(Exception e)
		{
			// Do nothing. Table exists from another function running this script.
		}
		
		PreparedStatement prep = DBUtil.prepareStatement(connection, "select count(*) from T1", false);
		String test = prep.toString();
		
		assertTrue(test.startsWith("org.hsqldb.jdbc.jdbcPreparedStatement@"));
		assertTrue(test.endsWith("[sql=[select count(*) from T1]]"));
	}
	
	@Test
	public void testConnectionCount() throws Exception {
		DBUtil.resetMonitors();
		assertEquals(0, DBUtil.getOpenConnectionCount());
		Connection connection = HSQLUtil.connectInMemoryDB(getClass().getSimpleName());
		assertEquals(1, DBUtil.getOpenConnectionCount());
		connection.close();
		assertEquals(0, DBUtil.getOpenConnectionCount());
	}
	
	// testing checkReadOnly() -----------------------------------------------------------------------------------------

	@Test
	public void testReadOnly_false() {
		DBUtil.checkReadOnly("insert into xyz (id) values (3)", false);
		DBUtil.checkReadOnly("update xyz set id = 3", false);
		DBUtil.checkReadOnly("select * from xyz", false);
		DBUtil.checkReadOnly("select into xyz2 from xyz", false);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testReadOnly_true_insert() {
		DBUtil.checkReadOnly("insert into xyz (id) values (3)", true);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testReadOnly_true_update() {
		DBUtil.checkReadOnly("update xyz set id = 3", true);
	}
	
	@Test
	public void testReadOnly_true_select() {
		DBUtil.checkReadOnly("select * from xyz", true);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testReadOnly_true_select_into() {
		DBUtil.checkReadOnly("select into xyz2 from xyz", true);
	}

	@Test
	public void testReadOnly_alter_session() {
		DBUtil.checkReadOnly("ALTER SESSION SET NLS_LENGTH_SEMANTICS=CHAR", true);
	}
	
}
