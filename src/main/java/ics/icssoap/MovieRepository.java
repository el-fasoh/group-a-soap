package ics.icssoap;

import localhost.movies.Movie;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieRepository  {

    private  static Map<String, Movie>  movies = new HashMap<>();
    @PostConstruct
    public void populateMovies(){
        Movie movie = new Movie();
        movie.setGenre("Science Fiction");
        movie.setName("Flash");
        movie.setYearRelease(2016);

        Movie movie1 = new Movie();
        movie1.setGenre("Thriller");
        movie1.setName("Scandal");
        movie1.setYearRelease(2016);

        Movie movie2 = new Movie();
        movie2.setGenre("Action");
        movie2.setName("Arrow");
        movie2.setYearRelease(2016);

        movies.put(movie.getName(), movie);
        movies.put(movie1.getName(), movie1);
        movies.put(movie2.getName(), movie2);
    }

    public Movie getMovie(String name){
        return movies.get(name);
    }
}
