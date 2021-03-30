package org.databene.jdbacl.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class DBUniqueIndexTest 
{
	@Test
	// ds-70
	public void testConsistancy()
	{
		DefaultDBTable table = new DefaultDBTable("t");
		DBUniqueConstraint constraint = new DBUniqueConstraint(table, "uniqueConstName", false, "column1");
		DBUniqueIndex idx = new DBUniqueIndex("name", false, constraint);
		
		assertEquals(table, idx.getTable());
		
		DefaultDBTable table2 = new DefaultDBTable("t");
		DBUniqueConstraint constraint2 = new DBUniqueConstraint(table, "uniqueConstName", false, "column1");
		DBUniqueIndex idx2 = new DBUniqueIndex("name", false, constraint);
		
		assertTrue(idx.isIdentical(idx2));
	}
}
