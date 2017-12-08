package films.controllers;

import java.util.List;
import films.DAL.UserDal;
import films.model.User;

public class UserController 
{
    protected UserDal userDal;
    public UserController() 
    {
        userDal = new UserDal();
    }
    
    public List<User> getAllUser()
    {
        return userDal.selectAll();
    }
    
    public User getUser(int id)
    {
        return userDal.selectById(id);
    }
     
    public int insertUser(User user)
    {
        return userDal.insert(user);
    }
      
    public int updateUser(User user)
    {
        return userDal.update(user);
    }
    
    public int deleteUserById(int id)
    {
        return userDal.delete(id);
    }
            
    
}
