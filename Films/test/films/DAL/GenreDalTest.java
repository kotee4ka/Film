/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.DAL;

import films.model.Genre;
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
public class GenreDalTest {
    
    public GenreDalTest() {
    }
    
     @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        GenreDal instance = new GenreDal();
        List<Genre> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class GenreDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 1;
        GenreDal instance = new GenreDal();
        Genre result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id && result.getFilms().size()>0);
    }

    /**
     * Test of update method, of class GenreDal.
     */
    @Test
    public void testUpdate() {
        assertTrue(true);
    }

    /**
     * Test of insert method, of class GenreDal.
     */
    @Test
    public void testInsert() {
        assertTrue(true);
    }

    /**
     * Test of delete method, of class GenreDal.
     */
    @Test
    public void testDelete() {
       assertTrue(true);
    }
}
