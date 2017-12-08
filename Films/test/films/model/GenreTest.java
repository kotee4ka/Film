/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Татаренко
 */
public class GenreTest {
    
    public GenreTest() {
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
     * Test of getId method, of class Genre.
     */
    /*@Test
    public void testGetId() {
        System.out.println("getId");
        Genre instance = new Genre();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Genre.
     */
    /*@Test
    public void testGetName() {
        System.out.println("getName");
        Genre instance = new Genre();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilms method, of class Genre.
     */
    /*@Test
    public void testGetFilms() {
        System.out.println("getFilms");
        Genre instance = new Genre();
        List<Films> expResult = null;
        List<Films> result = instance.getFilms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Genre.
     */
    /*@Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Genre instance = new Genre();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Genre.
     */
    /*@Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Genre instance = new Genre();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilms method, of class Genre.
     */
    /*@Test
    public void testSetFilms() {
        System.out.println("setFilms");
        List<Films> Films = null;
        Genre instance = new Genre();
        instance.setFilms(Films);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Genre.
     */
    @Test
    public void testCreateGenre() {
        System.out.println("test Genre CreateGenre");
       
        Date date = new Date(2010, 10, 10);
        byte[] image = new byte[1024];
        Films films1 = new Films(1, "name", "description", "genre", date, image);
        Films films2 = new Films(2, "name2", "description2", "genre2", date, image);
        List<Films> films = new ArrayList<>();
        films.add(films1);
        films.add(films2);
        
        Genre genre = new Genre(1, "name", films);
        
        assertEquals(genre.getId(), 1);
        assertEquals(genre.getFilms(), "name");
        assertEquals(genre.getFilms(), films);
    }

    /**
     * Test of equals method, of class Genre.
     */
    @Test
    public void testEquals() {
        System.out.println("test Genre equals");
        Date date = new Date(2010, 10, 10);
        byte[] image = new byte[1024];
        Films films1 = new Films(1, "name", "description", "genre", date, image);
        Films films2 = new Films(2, "name2", "description2", "genre2", date, image);
        List<Films> films = new ArrayList<>();
        films.add(films1);
        films.add(films2);
        
        Genre genre1 = new Genre(1, "name", films);
        Genre genre2 = new Genre(1, "name", films);
        Genre genre3 = new Genre(2, "name2", films);
        
        assertTrue(genre1.equals(genre2));
        assertFalse(genre1.equals(genre3));
    }

    /**
     * Test of toString method, of class Genre.
     */
    /*@Test
    public void testToString() {
        System.out.println("toString");
        Genre instance = new Genre();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
    }
