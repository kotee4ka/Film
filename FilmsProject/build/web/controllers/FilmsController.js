class FilmsController
{
    constructor()
    {
        this.filmsService = new FilmsService();
    }
    
    // DATAController
    getFilmsByGenreId(id)
    {
        return this.filmsService.getFilmsByGenreId(id);
    }
    
    //ViewController
    getFilmsByGenreIdView(id)  {
         var data=this.getFilmsByGenreId(id);
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var name=data[i].name;
            var description=data[i].description;
            
            var date = new Date(data[i].date);           
            var options = {
                     year: 'numeric',
                     month: 'long',
                     day: 'numeric'
                   };
             date = date.toLocaleString("ru", options);
            
            var image=data[i].image;
            result +=  "<div class='blog-posts'>"+
                        "<div class='post featured'>"+
                          "<a href='#'>"+
                            "<div class='image' style='background-image: url(data:image/png;base64," + image + ")';>"+
                              "<div class='time'>"+
                                "<div class='date'>04</div>"+
                                "<div class='month'>APR</div>"+
                              "</div>"+
                            "</div>"+
                            "<div class='content'>"+
                              "<h1>" + name + "</h1>"+
                              "<p>" + date + "</p>"+
                              "<p>" + description + "</p>"+
                              "<div class='meta'>"+
                                "<div class='icon-comment'>22 Comments</div>"+
                                "<ul class='tags'>"+
                                  "<li></li>"+
                                  "<li></li>"+
                                "</ul>"+
                              "</div>"+
                            "</div>"+
                        "</div>";
        }

        var element =document.getElementById("films");
        element.innerHTML = result;
    }
    
    
}





