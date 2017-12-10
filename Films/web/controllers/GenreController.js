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
        var result="<div class='btn-group-vertical'>";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var name=data[i].name;
            result += "<button onclick='genreClick(" + id+ ")' type='button' class='btn btn-default'>"+ name +"</button>";
        }
        result+="</div>";
        var element =document.getElementById("genre");
        element.innerHTML = result;
    }
    
    
}


