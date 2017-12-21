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
        var result="<ul>"+
                "<li class='dropdown-header'>ЖАНР ФИЛЬМА</li>";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var name=data[i].name;
            name = name.toUpperCase();
            result += "<li onclick='genreClick(" + id + ")'><a href='#'>" + name + "</a></li>";
        }
        result+="</li></ul>";
        var element =document.getElementById("genre");
        element.innerHTML = result;
    }
}


