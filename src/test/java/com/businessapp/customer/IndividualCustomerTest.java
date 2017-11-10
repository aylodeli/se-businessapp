package com.businessapp.customer;
import com.businessapp.model.IndividualCustomer;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;



public class IndividualCustomerTest {

    IndividualCustomer testC = new IndividualCustomer();

    //Test Firstname
    @Test
    public void testFirstName(){
        testC.setFirstName("Meyer");
        assertEquals("Meyer", testC.getFirstName());
    }

    //Test Firstname Null
    @Test
    public void testFirstNameNull(){
        testC.setFirstName(null);
        assertEquals(null, testC.getFirstName());
    }

    //Test Firstname Empty
    @Test
    public void testFirstNameEmpty(){
        testC.setFirstName("");
        assertEquals("", testC.getFirstName());
    }

    //Test Name
    @Test
    public void testName(){
        testC.setName("Aylin");
        assertEquals("Aylin", testC.getName());
    }

    // Test Name Null
    @Test
    public void testNameNull(){
        testC.setName(null);
        assertEquals(null, testC.getName());
    }

    //Test Name Empty
    @Test
    public void testNameEmpty(){
        testC.setName("");
        assertEquals("", testC.getName());
    }
    
     //Test Created
    @Test
    public void testCreated(){
        testC.setCreated(new Date(2014,12,12));
        assertEquals(new Date(2014,12,12), testC.getCreated());
    }

    //Test Id
    @Test
    public void testId(){
        String sId = new String("");
        testC.setId(sId);
        assertThat(sId == testC.getId(), is(true));
    }

    //Test Id Null
    @Test
    public void testIdNull(){
        String sId = null;
        testC.setId(sId);
        assertThat(sId == testC.getId(), is(true));
    }
    
    //Test Id Empty
    @Test
    public void testIdEmpty(){
        String sId = "";
        testC.setId(sId);
        assertThat(sId == testC.getId(), is(true));
    }

}
