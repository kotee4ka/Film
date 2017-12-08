package films.controllers;

import java.util.List;
import films.DAL.GenreDal;
import films.model.Genre;

public class GenreController 
{
    protected GenreDal genreDal;
    public GenreController() 
    {
        genreDal = new GenreDal();
    }
    
    public List<Genre> getAllGenre()
    {
        return genreDal.selectAll();
    }
    
    public Genre getGenre(int id)
    {
        return genreDal.selectById(id);
    }
     
    public int insertGenre(Genre genre)
    {
        return genreDal.insert(genre);
    }
      
    public int updateGenre(Genre genre)
    {
        return genreDal.update(genre);
    }
    
    public int deleteGenreById(int id)
    {
        return genreDal.delete(id);
    }
            
    
}
