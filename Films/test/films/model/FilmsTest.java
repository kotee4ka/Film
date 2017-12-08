/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.model;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Котеечка
 */
public class FilmsTest {
    
    public FilmsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Films.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Films instance = new Films();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Films.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Films instance = new Films();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Films.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Films instance = new Films();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Films.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Films instance = new Films();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Films.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Films instance = new Films();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Films.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Films instance = new Films();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Films.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Films instance = new Films();
        byte[] expResult = null;
        byte[] result = instance.getImage();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class Films.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        byte[] image = null;
        Films instance = new Films();
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Films.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Films instance = new Films();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Films.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Films instance = new Films();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Films.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Films instance = new Films();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Films.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Films instance = new Films();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Films.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Films instance = new Films();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
