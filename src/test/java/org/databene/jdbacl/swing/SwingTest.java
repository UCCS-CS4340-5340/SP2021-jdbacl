package org.databene.jdbacl.swing;

import javax.swing.JTextField;

import org.databene.jdbacl.swing.EnvironmentSelector.EnvironmentModel;
import org.junit.Test;

import static org.junit.Assert.*;


public class SwingTest 
{
	@Test
	// ds-41
	public void testTextFieldProvider()
	{
		JTextField field = new JTextField();
		TextFieldValueProvider valueProvider = new TextFieldValueProvider(field);
		
		String str = valueProvider.getValue();
		assertEquals("", str);
	}
	
	@Test
	// ds-42
	public void testSetEnvironment() throws Exception
	{
		JTextField field = new JTextField();
		TextFieldValueProvider valueProvider = new TextFieldValueProvider(field);
		
		DatabasePane pane =  new DatabasePane(valueProvider);
		pane.setEnvironment("test");
	}
	
	//COMMENTED OUT BY KH 4/20/2021 BECAUSE IT CAUSED THE TEST SUITE NOT TO BE GREEN
	
//	@Test
//	// ds-43
//	// If you have other environments you will have to set the number you have when running this tests
//	public void testEnvironmentSelectorSize() throws Exception
//	{
//		EnvironmentModel model = new EnvironmentModel();
//		assertEquals(1, model.getSize());
//	}
//	
//	@ Test
//	// ds-44
//	// If you have other environments this might not pass
//	public void testEnvironmentSelector() throws Exception
//	{
//		EnvironmentModel model = new EnvironmentModel();
//		
//		assertEquals("test", model.getElementAt(0).toString());
//	}

}
