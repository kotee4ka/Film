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
 * @author Котее4ка
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
     * Тест создания категории
     */
    @Test
    public void testCreateGenre() {
        System.out.println("test Genre CreateGenre");
        
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        Films films1 = new Films(1, "name", "description", image, date);
        Films films2 = new Films(2, "name2", "description2", image, date);
        List<Films> films = new ArrayList<>();
        films.add(films1);
        films.add(films2);
        
        Genre genre = new Genre(1, "name", films);
        
        assertEquals(genre.getId(), 1);
        assertEquals(genre.getName(), "name");
        assertEquals(genre.getFilms(), films);
    }

    /**
     *Тест проверки равенсва Категорий
     */
    @Test
    public void testEquals() {
        System.out.println("test Genre equels");
        
        Date date = new Date(2017, 9, 26);
        byte[] image = new byte[1024];
        Films films1 = new Films(1, "name", "description", image, date);
        Films films2 = new Films(2, "name2", "description2", image, date);
        List<Films> films = new ArrayList<>();
        films.add(films1);
        films.add(films2);
        
        Genre genre1 = new Genre(1, "name", films);
        Genre genre2 = new Genre(1, "name", films);
        Genre genre3 = new Genre(2, "name2", films);
        
        assertTrue(genre1.equals(genre2));
        assertFalse(genre1.equals(genre3));
    }

   
    
}
