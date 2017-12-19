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
 * @author Котее4ка
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
     * Тест создания Films
     */
    @Test
    public void testCreateFilms() {
        System.out.println("test Films CreateFilms");
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        Films films = new Films(1, "name", "description", image, date);
        assertEquals(films.getId(), 1);
        assertEquals(films.getName(), "name");
        assertEquals(films.getDescription(), "description");
        assertEquals(films.getImage(), image);
        assertEquals(films.getDate(), date);
    }

    /**
     * Тест сравнения двух объектов
     */
    @Test
    public void testEquals() {
        System.out.println("test Films equals");
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        Films films1 = new Films(1, "name", "description", image, date);
        Films films2 = new Films(1, "name", "description", image, date);
        Films films3= new Films(2, "name1", "description1", image, date);
        assertTrue(films1.equals(films2));
        assertFalse(films1.equals(films3));
    }

   
    
}
