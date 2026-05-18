package OOP.Movies;

public class Store {
    private Movie[] movies;

    public Store(){
        this.movies = new Movie[10];
    }
    public  Movie getMovie(int index)
    {
        Movie copy =new  Movie(movies[index]);
        return copy;

    }
    public void setMovie(  int index, Movie movie )
    {
        this.movies[index] = new Movie(movie);
    }
    public void printMovies()
    {
         for(int i =0;i<movies.length;i++)
        {
            if(movies[i]!=null)
            System.out.println(movies[i].toString());
        }
    }
}
