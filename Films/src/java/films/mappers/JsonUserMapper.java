package films.mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import films.model.User;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author �����4��
 */
public class JsonUserMapper {
     public static String toJSON(User user)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(user);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonUserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<User> user)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(user);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonUserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static User fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            User user =mapper.readValue(json, User.class);
            return user;
        } catch (IOException ex) {
            Logger.getLogger(JsonUserMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
