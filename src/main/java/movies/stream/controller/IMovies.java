package movies.stream.controller;

import java.time.LocalTime;
import java.util.List;

import movies.stream.entity.Movie;

public interface IMovies {
	//Eejeercicio 1
	public double getAverageQualification(List<Movie> movies);
	
	// Ejercicio 2
	public Movie getMovieMaxQualification(List<Movie> movies);
	
	//Ejercicio 3
	public Movie getMovieMinQualification(List<Movie> movies);
	
	//Ejercicio 4
	public List<Movie> getMoviesGenderDrama(List<Movie> movies);
	
	//Ejercicio 5
	public List<Movie> getMoviesGenderSuspenso(List<Movie> movies);
	
	//EEjercicio 6
	public List<Movie> getTwoMovies(List<Movie> movies);
	
	//Eejercicio 7
	public List<Movie> getMovieQualificationHigherThan8(List<Movie> movies);
	
	//Ejercicio 8
	public List<Movie> getMovieQualificationLessThan8(List<Movie> movies);
	
	//Ejeercicio 9
	public List<Movie> getMovieDuartionHigherThan2H(List<Movie> movies);
	
	//Ejercicio 10
	public LocalTime getAverageDurationTime(List<Movie> movies);
	
	//Ejercicio 11
	public Movie getMovieMoreDuration(List<Movie> movies);
	
	//Ejercicio 12
	public List<Movie> getThreeMovieHigherThan2H(List<Movie> movies);
	
	//Ejercicio 13
	public long getCountMovieGenderDrama(List<Movie> movies);
	
}
