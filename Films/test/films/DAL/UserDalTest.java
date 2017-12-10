/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.DAL;

import films.model.User;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Татаренко
 */
public class UserDalTest {
    
    public UserDalTest() {
    }
    
    /*@BeforeClass
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
    }*/

    /**
     * Test of selectAll method, of class UserDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        UserDal instance = new UserDal();
        List<User> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
    }

    /**
     * Test of selectById method, of class UserDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 1;
        UserDal instance = new UserDal();
        User result = instance.selectById(id);
        assertTrue(result!=null && result.getId()==id);
    }

    /**
     * Test of update method, of class UserDal.
     */
    @Test
    public void testUpdate() {
        assertTrue(true);
    }

    /**
     * Test of insert method, of class UserDal.
     */
    @Test
    public void testInsert() {
        assertTrue(true);
    }

    /**
     * Test of delete method, of class UserDal.
     */
    @Test
    public void testDelete() {
        assertTrue(true);
    }
    
}
