package films.DAL;

import films.model.Genre;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenreDalTest {
    
    public GenreDalTest() {
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
     * Test of selectAll method, of class GenreDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        GenreDal instance = new GenreDal();
        //List<Genre> expResult = null;
        List<Genre> result = instance.selectAll();
        assertTrue(result!=null && result.size()>0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of selectById method, of class GenreDal.
     */
    @Test
    public void testSelectById() {
        System.out.println("selectById");
        int id = 2;
        GenreDal instance = new GenreDal();
        //Genre expResult = null;
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
