/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package films.DAL;

import java.util.List;
import films.model.Films;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author Alex
 */
public class FilmsDal  extends BaseDal
{

    public FilmsDal() {
        super();
    }
    
    public List<Films> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Films> list = session.selectList("films.selectAll");
         session.close();
         return list;
    }
    
    public Films selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Films films= session.selectOne("films.selectById",id);
         session.close();
         return films;
    }
    
    public int update(Films films)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.update("films.update",films);
         session.commit();
         session.close();
         return count;
    }
    
    public int insert(Films films)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.insert("films.insert",films);
         session.commit();
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count= session.delete("films.deleteById",id);
         session.commit();
         session.close();
         return count;
    }
}
