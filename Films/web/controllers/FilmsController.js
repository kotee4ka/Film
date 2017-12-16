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
            var name=data[i].title;
            var description=data[i].description;
            var date=data[i].date;
            var image=data[i].image;
            result +=  "<div class='row'>"+
                        "<div class='col-sm-12 col-md-12'>"+
                          "<div class='thumbnail'>"+
                            "<img src='data:image/png;base64,"+ image +"'/>"+
                            "<div class='caption'>"+
                              "<h3>"+name+"</h3>"+
                              "<p>"+description+"</p>"+
                              "<p align='right'>"+date+"</p>"+
                            "</div>"+
                          "</div>"+
                        "</div>"+
                      "</div>";
        }

        var element =document.getElementById("films");
        element.innerHTML = result;
    }
    
    
}





