class GenreController
{
    constructor()
    {
        this.genreService = new GenreService();
    }
    
    // DATAController
    getAllGenre()
    {
        return this.genreService.getAllGenre();
    }
    
    //ViewController
    getAllGenreView()
    {
        var data=this.getAllGenre();
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var name=data[i].name;
            name = name.toUpperCase();
            result += "<li  class='li' style='margin: 0; padding: 10px 0 10px 20px;' onclick='genreClick(" + id + ")'><a href='#'>" + name + "</a></li>";
        
            var element =document.getElementById("genre");
            element.innerHTML = result;
       
    }
    }
}


