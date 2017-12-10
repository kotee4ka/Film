package films.DAL;

import java.util.List;
import films.model.Genre;
import org.apache.ibatis.session.SqlSession;


public class GenreDal  extends BaseDal
{
    public GenreDal() {
        super();
    }
    
     public List<Genre> selectAll()
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         List<Genre> list = session.selectList("genre.selectAll");
         session.close();
         return list;
    }
    
    public Genre selectById(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         Genre genre = session.selectOne("genre.selectById", id);
         session.close();
         return genre;
    }
    
    public int update(Genre genre)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count = session.update("genre.update", genre);
         session.close();
         return count;
    }
    
    public int insert(Genre genre)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count = session.insert("genre.insert", genre);
         session.close();
         return count;
    }
     
    public int delete(int id)
    {
         SqlSession session = sqlSessionFactory.openSession(); 
         int count = session.delete("genre.deleteById", id);
         session.close();
         return count;
    }
}
