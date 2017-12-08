class GenreService
{
    getAllGenre()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/FilmsPin1/GetAllGenre', false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var genreList= JSON.parse(request.responseText );
             return genreList;
         }
         return null;
    }
    
    getGenreById(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/FilmsPin1/GetGenreById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var genre= JSON.parse(request.responseText );
             return genre;
         }
         return null;
    }
}


