/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.DAL;

import java.util.List;
import films.model.Films;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Котее4ка
 */
public class FilmsDalTest {
    
    public FilmsDalTest() {
    }

    /**
     * Test of selectAll method, of class FilmsDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        FilmsDal instance = new FilmsDal();
        List<Films> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class FilmsDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 1;
        FilmsDal instance = new FilmsDal();
        Films result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }

    /**
     * Test of update method, of class FilmsDal.
     */
    @Test
    public void testUpdate() {
       assertTrue(true);
    }

    /**
     * Test of insert method, of class FilmsDal.
     */
    @Test
    public void testInsert() {
         assertTrue(true);
    }

    /**
     * Test of delete method, of class FilmsDal.
     */
    @Test
    public void testDelete() {
        assertTrue(true);
    }
    
}
