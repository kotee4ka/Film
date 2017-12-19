/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.controllers;

import java.util.List;
import films.DAL.GenreDal;
import films.model.Genre;

/**
 *
 * @author Котее4ка
 */
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
