class FilmsService
{
    getFilmsByGenreId(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/FilmsProject/GetGenreById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var genre= JSON.parse(request.responseText );
             return genre.films;
         }
         return null;
    }
        
    getFilmsById(id) {
         var request = new XMLHttpRequest();
         request.open('GET', '/FilmsProject/GetFilmsById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var films= JSON.parse(request.responseText );
             return films;
         }
         return null;
    }
}


