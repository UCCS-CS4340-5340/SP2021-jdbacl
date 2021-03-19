/*
 * (c) Copyright 2010-2011 by Volker Bergmann. All rights reserved.
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

package org.databene.jdbacl.model.xml;

import static org.junit.Assert.*;

import java.io.File;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.databene.commons.IOUtil;
import org.databene.jdbacl.model.AbstractModelTest;
import org.databene.jdbacl.model.DBColumn;
import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.databene.jdbacl.model.Database;
import org.databene.jdbacl.model.DBDataType;
import org.databene.jdbacl.model.DBForeignKeyConstraint;
import org.junit.Test;

/**
 * Tests the {@link XMLModelExporter}.<br/><br/>
 * Created: 28.11.2010 09:55:52
 * @since 0.6.4
 * @author Volker Bergmann
 */
public class XMLModelExporterTest extends AbstractModelTest {

//	@Test
//	public void test() throws Exception {
//		Database db = createTestModel();
//		File file = new File("target", getClass().getSimpleName() + ".xml");
//		new XMLModelExporter(file).export(db);
//		String[] expectedLines = IOUtil.readTextLines(TEST_MODEL_FILENAME, false);
//		String[] actualLines = IOUtil.readTextLines(file.getCanonicalPath(), false);
//		assertTrue(Arrays.equals(expectedLines, actualLines));
//	}
	
	// Test the abstract model's database functionality 
	// Should probably be moved to a new file :/
	
	@Test
	// ds-28
	public void test_getTables()
	{
		Database db = createTestModel();
		List<DBTable> tableList = db.getTables();
		assertEquals(4, tableList.size());
	}
	
	@Test
	// ds-29
	public void test_getTable_getColumns()
	{
		Database db = createTestModel();
		DBTable table1 = db.getTable("table1");
		List<DBColumn> columnList = table1.getColumns();
		assertEquals(2, columnList.size());
	}
	
	@Test
	// ds-30
	public void test_getColumn()
	{
		Database db = createTestModel();
		DBTable table1 = db.getTable("table1");
		DBColumn column = table1.getColumn("id1");
		assertEquals(DBDataType.getInstance("INT"), column.getType());
	}
	
	@Test
	// ds-31
	public void test_getForeignKeys()
	{
		Database db = createTestModel();
		DBTable table1 = db.getTable("table1");
		Set<DBForeignKeyConstraint> set = table1.getForeignKeyConstraints();
		assertEquals(0, set.size());
	}
	
	@Test
	// ds-32
	public void test_getPrimaryKeyColumns()
	{
		Database db = createTestModel();
		DBTable table1 = db.getTable("table1");
		String[] list = table1.getPKColumnNames();

		assertEquals(1, list.length);
	}
	
	@Test
	// ds-33
	public void test_getUniqueConstraints()
	{
		Database db = createTestModel();
		DBTable table1 = db.getTable("table1");
		Set<DBUniqueConstraint> set = table1.getUniqueConstraints(true);
		assertEquals(2, set.size());
		set = table1.getUniqueConstraints(false);
		assertEquals(1, set.size());
	}

}
