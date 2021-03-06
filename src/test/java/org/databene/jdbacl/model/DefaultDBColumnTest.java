/*
 * (c) Copyright 2006-2011 by Volker Bergmann. All rights reserved.
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

package org.databene.jdbacl.model;
import org.mockito.*;

import java.sql.Types;

import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBDataType;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Tests the {@link DBColumn}.<br/><br/>
 * Created: 06.01.2007 10:41:46
 * @author Volker Bergmann
 */
public class DefaultDBColumnTest {
	
	@Test
	// db-19
	public void test_isIdentical()
	{
		DefaultDBColumn column = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "NUMBER"), 11, 2);
		DefaultDBColumn column_copy = column;
		DefaultDBColumn column2 = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "NUMBER"), 11, 2);
		
		DefaultDBColumn column3 = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "DEC"), 11, 2);
		DefaultDBColumn column4 = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "NUMBER"), 12, 2);
		
		assertTrue(column.isIdentical(column_copy));
		assertTrue(column.isIdentical(column2));
		assertFalse(column.isIdentical(column3));
		assertFalse(column.isIdentical(column4));
		
	}

	@Test
	// db-20
	public void test_equals()
	{
		DefaultDBColumn column = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "NUMBER"), 11, 2);
		DefaultDBColumn column_copy = column;
		DefaultDBColumn column2 = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "NUMBER"), 11, 2);
		
		DefaultDBColumn column3 = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "DEC"), 11, 2);
		DefaultDBColumn column4 = new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "NUMBER"), 12, 2);
		
		assertTrue(column.isEquivalent(column_copy));
		assertTrue(column.isEquivalent(column2));
		assertFalse(column.isEquivalent(column3));
		assertFalse(column.isEquivalent(column4));
	}


	@Test
    public void testToString() {
        assertEquals("Column formatting failed", "ID : NUMBER(11,2)",
                new DefaultDBColumn("ID", null, DBDataType.getInstance(Types.DECIMAL, "NUMBER"), 11, 2).toString());
    }
    
}
