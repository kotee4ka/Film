package films.mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import films.model.Genre;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Котее4ка
 */
public class JsonGenreMapper {
    
    public static String toJSON(Genre genre)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(genre);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonGenreMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Genre> genre)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(genre);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonGenreMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Genre fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Genre genre =mapper.readValue(json, Genre.class);
            return genre;
        } catch (IOException ex) {
            Logger.getLogger(JsonGenreMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
