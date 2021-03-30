package org.databene.jdbacl.model;

import org.junit.Test;
import static org.junit.Assert.*;


public class DBPackageTest 
{
	@Test (expected = NullPointerException.class)
	// ds-56
	public void testNoDefaultObjectId()
	{
		DBSchema schema = new DBSchema("schema");
		
		DBPackage pack = new DBPackage("name", schema);
		DBPackage pack2 = new DBPackage("name", schema);
		
		pack.isIdentical(pack2);
	}
	
	@Test
	// ds-57
	public void testIsIdentical()
	{
		DBSchema schema = new DBSchema("schema");
		
		DBPackage pack = new DBPackage("name", schema);
		pack.setObjectId("objId");
		pack.setObjectType("objType");
		pack.setStatus("status");
		
		DBPackage pack2 = new DBPackage("name", schema);
		pack2.setObjectId("objId");
		pack2.setObjectType("objType");
		pack2.setStatus("status");
		
		assertTrue(pack.isIdentical(pack2));
	}
	
	@Test
	// ds-58
	public void testAddProcedure()
	{
		DBSchema schema = new DBSchema("schema");
		DBSchema schema2 = new DBSchema("schema2");
		
		DBPackage packBad = new DBPackage("name", schema2);
		
		DBPackage pack = new DBPackage("name", schema);
		pack.setObjectId("objId");
		pack.setObjectType("objType");
		pack.setStatus("status");
		
		assertEquals(0, pack.getComponents().size());
		
		DBProcedure pro = new DBProcedure("pro", packBad);
		
		pack.addProcedure(pro);
		
		assertEquals(pack, pro.getOwner());
		assertEquals(1, pack.getComponents().size());
	}

}
