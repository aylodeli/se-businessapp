package com.businessapp.customer;


import com.businessapp.model.IndividualCustomer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macbookpro
 */
public class IndividualCustomerTest {
    
    public IndividualCustomerTest() {
    }

    /**
     * Test of getFirstName method, of class IndividualCustomer.
     */
    @Test
    public void testGetFirstName() {
        IndividualCustomer a = new IndividualCustomer();
        a.setFirstName("Meyer");
        final String testStr="Meyer";
        assertTrue(testStr.equals(a.getFirstName()));
        
    }

    /**
     * Test of setFirstName method, of class IndividualCustomer.
     */
    @Test
    public void testSetFirstName() {
        
    }
    
    public void testLeererString(){
        IndividualCustomer a = new IndividualCustomer();
        a.setFirstName("");
        assertTrue(a.getFirstName().isEmpty());
    }
    
    @Test
    public void testNull(){
    IndividualCustomer a= new IndividualCustomer();
    a.setFirstName(null);
    assertTrue(a.getFirstName()==null);
    }
    
}