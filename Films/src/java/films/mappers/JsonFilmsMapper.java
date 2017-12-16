/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.mappers;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import films.model.Films;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Котее4ка
 */
public class JsonFilmsMapper {
     public static String toJSON(Films films)
    {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(films);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonFilmsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     public static String toJSON(List<Films> films)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json=mapper.writeValueAsString(films);
            return json;
        } catch (IOException ex) {
            Logger.getLogger(JsonFilmsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    public static Films fromJSON(String json)  {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Films films =mapper.readValue(json, Films.class);
            return films;
        } catch (IOException ex) {
            Logger.getLogger(JsonFilmsMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
