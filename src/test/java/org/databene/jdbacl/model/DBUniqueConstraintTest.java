/*
 * (c) Copyright 2007-2010 by Volker Bergmann. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, is permitted under the terms of the
 * GNU General Public License.
 *
 * For redistributing this software or a derivative work under a license other
 * than the GPL-compatible Free Software License as defined by the Free
 * Software Foundation or approved by OSI, you must first obtain a commercial
 * license to this software product from Volker Bergmann.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * WITHOUT A WARRANTY OF ANY KIND. ALL EXPRESS OR IMPLIED CONDITIONS,
 * REPRESENTATIONS AND WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE
 * HEREBY EXCLUDED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.databene.jdbacl.model;

import org.databene.jdbacl.model.DBTable;
import org.databene.jdbacl.model.DBUniqueConstraint;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Tests the DBUniqueConstraint<br/>
 * <br/>
 * Created: 31.08.2007 09:22:25
 * @author Volker Bergmann
 */
public class DBUniqueConstraintTest {
	
	@Test
	// ds-17
	public void test_addColumnName()
	{
		DBTable table = new DefaultDBTable("tablename");
        DBUniqueConstraint constraint = new DBUniqueConstraint(table, "constraintname", false, "column1", "column2");
        // Check adding a new column
        constraint.addColumnName("column3");
        assertEquals("CONSTRAINT constraintname UNIQUE (column1, column2, column3)", constraint.toString());
        // Check adding an existing column
        constraint.addColumnName("column2");
        assertEquals("CONSTRAINT constraintname UNIQUE (column1, column2, column3)", constraint.toString());
	}
	
	@Test
	// ds-18
	public void test_isIdentical()
	{
		DBTable table = new DefaultDBTable("tablename");
        DBUniqueConstraint constraint = new DBUniqueConstraint(table, "constraintname", false, "column1", "column2");
        DBUniqueConstraint constraint_copy = constraint;
        DBUniqueConstraint constraint2 = new DBUniqueConstraint(table, "constraintname", false, "column1", "column2");
        
        DBUniqueConstraint constraint3 = new DBUniqueConstraint(table, "constraintname", false, "column1");
        DBUniqueConstraint constraint4 = new DBUniqueConstraint(table, "constraintname_diff", false, "column1", "column2");
        DBTable table2 = new DefaultDBTable("tablename2");
        DBUniqueConstraint constraint5 = new DBUniqueConstraint(table2, "constraintname", false, "column1", "column2");
        
        assertTrue(constraint.isIdentical(constraint_copy)); // Test copy
        assertTrue(constraint.isIdentical(constraint2)); // Test identical but different instance
        assertFalse(constraint.isIdentical(constraint3)); // Test same name different columns
        assertFalse(constraint.isIdentical(constraint4)); // Test same columns different name
        assertFalse(constraint.isIdentical(constraint5)); // Test same columns and name but different table
	}

	@Test
    public void testToString() {
        DBTable table = new DefaultDBTable("tablename");
        DBUniqueConstraint constraint = new DBUniqueConstraint(table, "constraintname", false, "column1", "column2");
        assertEquals("CONSTRAINT constraintname UNIQUE (column1, column2)", constraint.toString());
    }
    
	@Test
    public void testEquals() {
        DBTable table = new DefaultDBTable("tablename");
    	// simple checks
    	DBUniqueConstraint uc1 = new DBUniqueConstraint(table, "uc1", false, "col1");
    	assertFalse(uc1.equals(null));
    	assertFalse(uc1.equals(""));
    	assertTrue(uc1.equals(uc1));
    	// real comparisons
    	DBUniqueConstraint uc2 = new DBUniqueConstraint(table, "uc2", false, "col2");
    	DBUniqueConstraint uc3 = new DBUniqueConstraint(table, "uc3", false, "col1", "col2");
    	assertFalse(uc1.equals(uc2));
    	assertFalse(uc1.equals(uc3));
    	assertFalse(uc3.equals(uc1));
    }
	
}
