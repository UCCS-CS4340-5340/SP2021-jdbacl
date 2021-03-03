/*
 * (c) Copyright 2009-2011 by Volker Bergmann. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, is permitted under the terms of the
 * GNU General Public License (GPL).
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

package org.databene.jdbacl.dialect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;

import org.databene.jdbacl.DBUtil;
import org.databene.jdbacl.model.DBSequence;
import org.junit.Test;

/**
 * Tests the {@link HSQLDialect}.<br/><br/>
 * Created: 10.11.2009 18:55:15
 * @since 0.6.0
 * @author Volker Bergmann
 */
public class HSQLDialectTest extends DatabaseDialectTest<HSQLDialect> {

	public HSQLDialectTest() {
	    super(new HSQLDialect());
    }

	@Test
	public void testFormatDate() {
		assertEquals("'1971-02-03'", dialect.formatValue(DATETIME_19710203131415));
	}
	
	@Test
	public void testFormatTime() {
		assertEquals("'13:14:15'", dialect.formatValue(TIME_131415));
	}
	
	@Test
	public void testFormatTimestamp() {
		assertEquals("'1971-02-03 13:14:15.123456789'", 
				dialect.formatValue(TIMESTAMP_19710203131415123456789));
	}
	
	@Test
	public void testIsDeterministicPKName() {
		assertFalse(dialect.isDeterministicPKName("SYS_IDX_54"));
		assertTrue(dialect.isDeterministicPKName("USER_PK"));
	}
	
	@Test
	public void testIsDeterministicUKName() {
		assertFalse(dialect.isDeterministicUKName("SYS_IDX_SYS_CT_80_83"));
		assertTrue(dialect.isDeterministicUKName("USER_NAME_UK"));
	}
	
	@Test
	public void testIsDeterministicFKName() {
		assertFalse(dialect.isDeterministicFKName("SYS_FK_84"));
		assertTrue(dialect.isDeterministicFKName("USER_ROLE_FK"));
	}
	
	@Test
	public void testIsDeterministicIndexName() {
		assertFalse(dialect.isDeterministicIndexName("SYS_IDX_56"));
		assertTrue(dialect.isDeterministicIndexName("USER_NAME_IDX"));
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testRegex() {
		assertFalse(dialect.supportsRegex());
		dialect.regexQuery("code", false, "[A-Z]{4}");
	}
	
	@Test
	public void testRenderCreateSequence() {
		assertEquals("CREATE SEQUENCE my_seq", dialect.renderCreateSequence(new DBSequence("my_seq", null)));
		assertEquals("CREATE SEQUENCE my_seq START WITH 10 INCREMENT BY 2 MAXVALUE 999 MINVALUE 5 CYCLE", 
				dialect.renderCreateSequence(createConfiguredSequence()));
	}
	
	@Test
	public void testSequencesOnline() throws Exception {
		testSequencesOnline("hsqlmem");
	}
	
	@Test
	public void testSetSequenceValue() throws Exception {
		Connection connection = HSQLUtil.connectInMemoryDB(getClass().getSimpleName());
		String sequenceName = getClass().getSimpleName();
		DBUtil.executeUpdate("create sequence " + sequenceName, connection);
		dialect.setNextSequenceValue(sequenceName, 123, connection);
		String seqValQuery = dialect.renderFetchSequenceValue(sequenceName);
		assertEquals(123, DBUtil.queryScalar(seqValQuery, connection));
		DBUtil.executeUpdate("drop sequence " + sequenceName, connection);
	}
	
	@Test
	public void testRenderFetchSequenceValue() {
		assertEquals("call next value for SEQ", dialect.renderFetchSequenceValue("SEQ"));
	}
	
	@Test
	public void testDropSequence() {
		assertEquals("drop sequence SEQ", dialect.renderDropSequence("SEQ"));
	}
	
	@Test
	public void testRenderCase() {
		assertEquals("CASE WHEN condition1 THEN result1 WHEN condition2 THEN result2 ELSE result4 END AS col", 
				dialect.renderCase("col", "result4", "condition1", "result1", "condition2", "result2"));
	}
	
}
