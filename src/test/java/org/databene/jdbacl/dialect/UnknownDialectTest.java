package org.databene.jdbacl.dialect;

import static org.junit.Assert.*;
import org.junit.Test;

public class UnknownDialectTest
{

	@Test
	// ds-45
	public void testDefaultUnknownDialectAttibutes()
	{
		UnknownDialect dia = new UnknownDialect("adf");
		
		assertTrue(dia.isDefaultCatalog("adfadf","gfhdgf"));
		assertTrue(dia.isDefaultSchema("fdw","fjjh"));
		assertTrue(dia.isDeterministicPKName("treh"));
		assertTrue(dia.isDeterministicUKName("yuirg"));
		assertTrue(dia.isDeterministicIndexName("qewq"));
	}
}
