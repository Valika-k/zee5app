package com.zee.zee5app.service;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.MovieRepository;

public class MovieService {
	private MovieRepository repository= MovieRepository.getInstance();

	private static MovieService service=null;
	public static MovieService getInstance() {
		//object independent
		//static keyword helps in creating method independent of object
		if(service==null)//local ref
			service = new MovieService();
		return service;
	
	}
	
	
	public String addMovie(Movie movie) {
		return this.repository.addMovie(movie);
	}
	
	public Movie getMovieById(String id) {
		return this.repository.getMovieById(id);
	}
	
	public Movie[] getMovies() {
		return this.repository.getMovies();	
	}

	public String updateMovie(String id, Movie movie) {
		return this.repository.updateMovie(id, movie);
	}
	public String deleteMovie(String id) {
		// TODO Auto-generated method stub
		return this.repository.deleteMovie(id);
	}

}
