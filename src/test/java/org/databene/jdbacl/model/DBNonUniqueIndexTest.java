package org.databene.jdbacl.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class DBNonUniqueIndexTest 
{

	@Test
	// ds-53
	public void testIsEqual()
	{
		DefaultDBTable table1 = new DefaultDBTable("t1");
		DefaultDBTable table2 = new DefaultDBTable("t1");
		
		DBNonUniqueIndex idx = new DBNonUniqueIndex("name", true, table1, "column1");
		DBNonUniqueIndex idx2 = new DBNonUniqueIndex("name", true, table2, "column1");
		
		assertEquals(idx, idx2);
	}
	
	@Test
	// ds-54
	public void testIsIdentical()
	{
		DefaultDBTable table1 = new DefaultDBTable("t1");
		DefaultDBTable table2 = new DefaultDBTable("t1");
		
		DBNonUniqueIndex idx = new DBNonUniqueIndex("name", true, table1, "column1");
		DBNonUniqueIndex idx2 = new DBNonUniqueIndex("name", true, table2, "column1");

		assertTrue(idx.isIdentical(idx2));
	}
	
	@Test
	// ds-55
	public void testAddColumnName()
	{
		DefaultDBTable table = new DefaultDBTable("t");
		DBNonUniqueIndex idx = new DBNonUniqueIndex("name", true, table, "column1");
		
		assertEquals(1, idx.getColumnNames().length);

		idx.addColumnName("column1");
		
		assertEquals(2, idx.getColumnNames().length);
	}
}
