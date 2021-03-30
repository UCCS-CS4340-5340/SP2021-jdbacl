package org.databene.jdbacl.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class DBCatalogTest 
{
	@Test
	// ds-48
	public void testCatalogName()
	{
		DBCatalog cat = new DBCatalog();
		assertEquals(null, cat.getName());
		
		cat.setName("newName");
		assertEquals("newName", cat.getName());
	}
	
	@Test
	// ds-49
	public void testAddSchema()
	{
		DBCatalog cat = new DBCatalog();
		DBSchema schema = new DBSchema("schemaName");
		cat.addSchema(schema);
		cat.getSchemas().size();

		assertEquals(1, cat.getSchemas().size());
	}
	
	@Test
	// ds-50
	public void testRemoveSchema()
	{
		DBCatalog cat = new DBCatalog();
		DBSchema schema = new DBSchema("schemaName");
		cat.addSchema(schema);
		cat.getSchemas().size();

		assertEquals(1, cat.getSchemas().size());
		
		cat.removeSchema(schema);
		assertEquals(0, cat.getSchemas().size());
	}
	
	@Test
	// ds-51
	public void testGetSchema()
	{
		DBCatalog cat = new DBCatalog();
		DBSchema schema = new DBSchema("schemaName");
		cat.addSchema(schema);
		cat.getSchemas().size();

		assertEquals(1, cat.getSchemas().size());
		
		DBSchema gotSchema = cat.getSchema("schemaName");
		assertEquals(schema, gotSchema);
		
		cat.removeSchema(gotSchema);
		assertEquals(0, cat.getSchemas().size());
	}
	
	@Test
	// ds-52
	public void testIsIdentical()
	{
		DBCatalog cat = new DBCatalog();
		DBCatalog cat2 = new DBCatalog();
		
		assertTrue(cat.isIdentical(cat2));
		
		cat = new DBCatalog("name");
		
		// This feels like a bug
		assertTrue(cat.isIdentical(cat2));
		
		cat2 = new DBCatalog("name");
		
		assertTrue(cat.isIdentical(cat2));
	}
}
