package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Register;
public class MovieRepository {
	private Movie[] movies=new Movie[10];
	private static int count=-1;
	//add new user
	public String addMovie(Movie movie) {

		
		if(count==movies.length-1)
		{
			Movie temp[]=new Movie[movies.length*2];
			//add old contents to new
			System.arraycopy(movies,0,temp,0,movies.length);
			movies=temp;
			movies[++count]=movie;
			return "array is full";
		}
		movies[++count]=movie;
		return "success";
		
		
	}
	
	//return user details by id
	public Movie getMovieById(String Id) {
		//we need to traverse array
		for(Movie movie : movies) {
			if(movie!=null && movie.getId().equals(Id)  ) {
				return movie;
			}
		}
		return null;
	}
	
	//return all user details
	public Movie[] getMovies() {
		return movies;
	}
	
	public String updateMovie(String id, Movie movie)
	{

			int counter=-1;

			for(Movie movie1 : movies) {
				++counter;
				if(movie1!=null && movie1.getId().equals(id)  ) {
					movies[counter].setName(movie.getName());
					movies[counter].setReleasedate(movie.getReleasedate());
					//registers[counter].setEmail(register.getEmail());
					//registers[counter].setPassword(register.getPassword());
					
				}
			}
			return "Movies updated";
		
	}
	
	public String deleteMovie(String id)
	{
	
		int counter=-1;
		for(Movie movie : movies) {
			
			++counter;
			if(movie!=null && movie.getId().equals(id)  ) {
				Movie rem= movie;
					for(int i=counter;i<movies.length;i++) {
						movies[i]=movies[i+1];
					}
					
			}
			return "deleted "+id ;
		}
		return null;
	}
	
	
	
	
	private static MovieRepository movieRepository;
	public static MovieRepository getInstance()
	{
		if(movieRepository==null)
			movieRepository=new MovieRepository();
		return movieRepository;
	}
}
