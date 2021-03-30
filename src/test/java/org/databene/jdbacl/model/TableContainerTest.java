package org.databene.jdbacl.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class TableContainerTest 
{
	@Test
	// ds-64
	public void testGetSchema_ParentSchema()
	{
		DBSchema schema = new DBSchema("schema");
		TableContainer tableCont = new TableContainer("name", schema);
		
		// This is a bug
		assertFalse(schema.isIdentical(tableCont.getSchema()));
	}
	
	@Test
	// ds-65
	public void testGetSchema_ParentTableCont()
	{
		DBSchema schema = new DBSchema("schema");
		TableContainer tableContParent = new TableContainer("name", schema);
		TableContainer tableContChild = new TableContainer("name", tableContParent);
		
		// This is a bug
		assertFalse(schema.isIdentical(tableContChild.getSchema()));
	}
	
	@Test
	// ds-66
	public void testGetTables()
	{
		DBSchema schema = new DBSchema("schema");
		TableContainer cont = new TableContainer("name", schema);
		TableContainer sub = new TableContainer("sub", cont);
		
		
		DefaultDBTable contTable = new DefaultDBTable("t_c");
		DefaultDBTable subTable = new DefaultDBTable("t_s");
		DefaultDBTable subTable2 = new DefaultDBTable("t_s2");
		
		cont.addTable(contTable);
		sub.addTable(subTable);
		sub.addTable(subTable2);
		
		assertEquals(1, cont.getTables().size());
		assertEquals(2, sub.getTables().size());
		assertEquals(3, cont.getTables(true).size());
		assertEquals(2, sub.getTables(true).size());
	}
	
	@Test
	// ds-67
	public void testAddTables()
	{
		DBSchema schema = new DBSchema("schema");
		TableContainer cont = new TableContainer("name", schema);	
		
		DefaultDBTable table1 = new DefaultDBTable("t1");
		DefaultDBTable table2 = new DefaultDBTable("t2");
		DefaultDBTable table3 = new DefaultDBTable("t1");
		
		cont.addTable(table1);
		
		assertEquals(1, cont.getTables().size());
		
		cont.addTable(table1);
		
		assertEquals(1, cont.getTables().size());
		
		cont.addTable(table2);
		
		assertEquals(2, cont.getTables().size());
		
		cont.addTable(table3);
		
		assertEquals(2, cont.getTables().size());		
	}
}
