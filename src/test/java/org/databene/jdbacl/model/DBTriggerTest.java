package org.databene.jdbacl.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class DBTriggerTest 
{
	@Test
	// db-62
	public void testOwnership()
	{
		DBSchema schema = new DBSchema("schema");
		DBSchema schema2 = new DBSchema("schema2");
		DBTrigger trigger = new DBTrigger("trigger", schema);
		
		assertTrue(schema.isIdentical(trigger.getOwner()));
		
		trigger.setOwner(schema2);
		assertTrue(schema2.isIdentical(trigger.getOwner()));
	}
	
	@Test
	// db-63
	public void testIsIdentical()
	{
		DBSchema schema = new DBSchema("schema");
		DBTrigger trigger = new DBTrigger("trigger", schema);
		trigger.setTriggerType("triggerType");
		trigger.setTriggeringEvent("triggerEvent");
		trigger.setTableOwner("tableOwner");
		trigger.setTableName("tableName");
		trigger.setBaseObjectType("baseObjType");
		trigger.setReferencingNames("referencingName");
		trigger.setWhenClause("whenClause");
		trigger.setStatus("status");
		trigger.setDescription("description");
		trigger.setDescription("actionType");
		trigger.setTriggerBody("triggerBody");
		trigger.setActionType("actionType");
		
		DBSchema schema2 = new DBSchema("schema");
		DBTrigger trigger2 = new DBTrigger("trigger", schema2);
		trigger2.setTriggerType("triggerType");
		trigger2.setTriggeringEvent("triggerEvent");
		trigger2.setTableOwner("tableOwner");
		trigger2.setTableName("tableName");
		trigger2.setBaseObjectType("baseObjType");
		trigger2.setReferencingNames("referencingName");
		trigger2.setWhenClause("whenClause");
		trigger2.setStatus("status");
		trigger2.setDescription("description");
		trigger2.setDescription("actionType");
		trigger2.setTriggerBody("triggerBody");
		trigger2.setActionType("actionType");
		
		assertTrue(trigger.isIdentical(trigger2));
		
		DBSchema schema3 = new DBSchema("schema3");
		DBTrigger trigger3 = new DBTrigger("trigger", schema3);
		trigger3.setTriggerType("triggerType");
		trigger3.setTriggeringEvent("triggerEvent");
		trigger3.setTableOwner("tableOwner");
		trigger3.setTableName("tableName");
		trigger3.setBaseObjectType("baseObjType");
		trigger3.setReferencingNames("referencingName");
		trigger3.setWhenClause("whenClause");
		trigger3.setStatus("status");
		trigger3.setDescription("description");
		trigger3.setDescription("actionType");
		trigger3.setTriggerBody("triggerBody");
		trigger3.setActionType("actionType");
		
		assertTrue(trigger.isIdentical(trigger3));
		
		DBSchema schema4 = new DBSchema("schema");
		DBTrigger trigger4 = new DBTrigger("trigger", schema4);
		trigger4.setTriggerType("triggerType_notSame");
		trigger4.setTriggeringEvent("triggerEvent");
		trigger4.setTableOwner("tableOwner");
		trigger4.setTableName("tableName");
		trigger4.setBaseObjectType("baseObjType");
		trigger4.setReferencingNames("referencingName");
		trigger4.setWhenClause("whenClause");
		trigger4.setStatus("status");
		trigger4.setDescription("description");
		trigger4.setDescription("actionType");
		trigger4.setTriggerBody("triggerBody");
		trigger4.setActionType("actionType");
		
		assertFalse(trigger.isIdentical(trigger4));
		
	}
}
