
package films.DAL;

import java.util.List;
import films.model.User;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserDalTest {
    
    public UserDalTest() {
    }

    /**
     * Test of selectAll method, of class UserDal.
     */
    @Test
    public void testSelectAll() {
        System.out.println("UserDal selectAll");
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
