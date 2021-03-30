package org.databene.jdbacl.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class DBProcedureTest 
{
	@Test(expected = NullPointerException.class)
	// ds-59
	public void testNullDefaultValues()
	{
		DBSchema schema = new DBSchema("schema");
		DBPackage pack = new DBPackage("name", schema);
		DBProcedure pro = new DBProcedure("pro", pack);
		
		DBSchema schema2 = new DBSchema("schema");
		DBPackage pack2 = new DBPackage("name", schema2);
		DBProcedure pro2 = new DBProcedure("pro", pack2);
		
		pro.isIdentical(pro2);
	}
	
	@Test
	// ds-60
	public void testIsIdentical()
	{
		DBSchema schema = new DBSchema("schema");
		DBPackage pack = new DBPackage("name", schema);
		DBProcedure pro = new DBProcedure("pro", pack);
		pro.setObjectId("objId");
		pro.setSubProgramId("subProgId");
		pro.setOverload("overload");
		
		DBSchema schema2 = new DBSchema("schema");
		DBPackage pack2 = new DBPackage("name", schema2);
		DBProcedure pro2 = new DBProcedure("pro", pack2);
		pro2.setObjectId("objId");
		pro2.setSubProgramId("subProgId");
		pro2.setOverload("overload");
		
		assertTrue(pro.isIdentical(pro2));
	}
	
	@Test
	// ds-61
	public void testToString()
	{
		DBSchema schema = new DBSchema("schema");
		DBPackage pack = new DBPackage("name", schema);
		DBProcedure pro = new DBProcedure("pro", pack);
		pro.setObjectId("objId");
		pro.setSubProgramId("subProgId");
		pro.setOverload("overload");
		
		assertEquals("pro", pro.toString());
	}
}
