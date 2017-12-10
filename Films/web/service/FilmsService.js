class NewsService
{
    getNewsByCategoryId(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/NewsPin1/GetCategoryById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var category= JSON.parse(request.responseText );
             return category.news;
         }
         return null;
    }
}


