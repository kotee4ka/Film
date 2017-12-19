/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author �����4��
 */
public class UserTest {
    
    public UserTest() {
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
     * ���� �������� User
     */
    @Test
    public void testCreateUser() {
        System.out.println("test User createUser");
        
        User user = new User(1, "login", "password");
        assertEquals(user.getId(), 1);
        assertEquals(user.getLogin(), "login");
        assertEquals(user.getPassword(), "password");
        
        
        user.setId(2);
        assertEquals(user.getId(), 2);
        
        user.setLogin("�����4��");
        assertEquals(user.getLogin(), "�����4��");
        
        user.setPassword("123");
        assertEquals(user.getPassword(), "123");
    }
    
    /**
     * ���� ��������� ���� ��������
     */
    @Test
    public void testEquals() {
        System.out.println("test User equals");
       
        User user1 = new User(1, "login", "password");        
        User user2 = new User(1, "login", "password");
        User user3 = new User(2, "�����4��", "123");
        
        assertTrue( user1.equals(user2)   );
        assertFalse(user1.equals(user3)   );
    }
  
}
