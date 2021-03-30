package org.databene.jdbacl.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class TableContainerSupportTest 
{
	@Test
	// ds-68
	public void testAddSubContainer()
	{
		TableContainerSupport supp = new TableContainerSupport();
		
		assertEquals(0, supp.getSubContainers().size());
		
		TableContainer sub = new TableContainer("name", null);
		supp.addSubContainer(sub);
		
		assertEquals(1, supp.getSubContainers().size());
	}
	
	@Test
	// ds-69
	public void testAddSequence()
	{
		TableContainerSupport supp = new TableContainerSupport();
		
		assertEquals(0, supp.getSequences(false).size());
		
		DBSequence seq = new DBSequence("seqName", "catName", "schemaName");
		
		supp.addSequence(seq);
		
		assertEquals(1, supp.getSequences(false).size());
	}
}
