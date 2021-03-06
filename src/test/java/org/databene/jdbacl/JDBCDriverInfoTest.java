/*
 * (c) Copyright 2009-2010 by Volker Bergmann. All rights reserved.
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

import java.util.Arrays;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Tests the {@link JDBCDriverInfo} class.<br/>
 * <br/>
 * Created at 23.02.2009 10:14:26
 * @since 0.4.8
 * @author Volker Bergmann
 */

public class JDBCDriverInfoTest {

	@Test
	public void testGetInstances() {
		assertTrue(JDBCDriverInfo.getInstances().size() > 0);
	}
	
	@Test
	// ds-9
	public void test_getUrlPrefix()
	{
		JDBCDriverInfo hsql = JDBCDriverInfo.HSQL;
		assertEquals("jdbc:hsqldb:hsql://", hsql.getUrlPrefix());
	}
	
	@Test
	// ds-10
	public void test_equals()
	{
		JDBCDriverInfo hsql = JDBCDriverInfo.HSQL;
		JDBCDriverInfo hsql_copy = hsql;
		JDBCDriverInfo hsql2 = JDBCDriverInfo.HSQL;
		JDBCDriverInfo firebird = JDBCDriverInfo.FIREBIRD;
		
		assertTrue(hsql.equals(hsql_copy));
		assertTrue(hsql.equals(hsql2));
		assertFalse(hsql.equals(firebird));
		assertFalse(hsql.equals(null));
	}
	
	@Test
	public void testHSQL() {
		JDBCDriverInfo hsql = JDBCDriverInfo.HSQL;
		assertEquals("HSQL", hsql.getId());
		assertEquals("HSQL Server", hsql.getDbSystem());
		assertEquals("HSQL Server", hsql.getName());
		assertEquals("org.hsqldb.jdbcDriver", hsql.getDriverClass());
		assertEquals("9001", hsql.getDefaultPort());
		assertEquals("jdbc:hsqldb:hsql://{0}:{1}/{2}", hsql.getUrlPattern());
		assertEquals("PUBLIC", hsql.getDefaultSchema());
		assertEquals("sa", hsql.getDefaultUser());
		assertEquals("http://hsqldb.sourceforge.net/", hsql.getDownloadUrl());
		assertTrue(Arrays.equals(new String[] { "hsqldb.jar" }, hsql.getJars()));
		assertNull(hsql.getDefaultDatabase());
		assertEquals("jdbc:hsqldb:hsql://myhost:myport/mydb", hsql.jdbcURL("myhost", "myport", "mydb"));
	}
	
}
