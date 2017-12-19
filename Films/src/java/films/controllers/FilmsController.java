/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.controllers;

import java.util.List;
import films.DAL.FilmsDal;
import films.model.Films;

/**
 *
 * @author Котее4ка
 */
public class FilmsController 
{
    protected FilmsDal filmsDal;
    public FilmsController() 
    {
        filmsDal = new FilmsDal();
    }
    
    public List<Films> getAllFilms()
    {
        return filmsDal.selectAll();
    }
    
    public Films getFilms(int id)
    {
        return filmsDal.selectById(id);
    }
     
    public int insertFilms(Films films)
    {
        return filmsDal.insert(films);
    }
      
    public int updateFilms(Films films)
    {
        return filmsDal.update(films);
    }
    
    public int deleteFilmsById(int id)
    {
        return filmsDal.delete(id);
    }
            
    
}
