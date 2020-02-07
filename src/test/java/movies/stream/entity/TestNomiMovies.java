package movies.stream.entity;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import movies.stream.controller.NomiMovies;

public class TestNomiMovies {
	private List<Movie> movies;
	private NomiMovies nomiMovies;
	
	
	@Before
	public void setUp() {
		nomiMovies = new NomiMovies();
		 Movie movie1 = new Movie("Parasito", "Suspenso", 
				 8.6, LocalTime.parse("02:12:00")); 
		 Movie movie2 = new Movie("The irishman", "Drama", 
				 8.1, LocalTime.parse("03:29:00")); 
		 Movie movie3 = new Movie("Avengers End Game", "Suspenso", 
				 8.9, LocalTime.parse("02:02:00")); 
		 Movie movie4 = new Movie("JoJo Rabit", "Comedia", 
				 7, LocalTime.parse("01:02:00")); 
		 movies = Arrays.asList(movie1, movie2, movie3, movie4);
	}
	
	
	@Test
	public void testGetAverageQualification() {
		double result = nomiMovies.getAverageQualification(movies);
		assertEquals(8.15, result, 0.01);
	}
	
	@Test
	public void testGetMovieMaxCalification() {
		Movie movieExpect = new Movie("Avengers End Game", "Suspenso", 
				 8.9, LocalTime.parse("02:02:00")); 
		Movie result = nomiMovies.getMovieMaxQualification(movies);
		assertEquals(movieExpect.getTitle(), result.getTitle());
	}
	
	
	@Test
	public void testGetMovieMinCalification() {
		Movie movieExpect = new Movie("JoJo Rabit", "Comedia", 
				 7, LocalTime.parse("02:02:00")); 
		Movie result = nomiMovies.getMovieMinQualification(movies);
		assertEquals(movieExpect.getTitle(), result.getTitle());
	}
	
	@Test
	public void testGeMovieGenderDrama() {
		Movie movieExpect = new Movie("The irishman", "Drama", 
				 8.1, LocalTime.parse("03:29:00"));
		List<Movie> result = nomiMovies.getMoviesGenderDrama(movies);
		assertEquals(movieExpect.getTitle(), result.get(0).getTitle());
	}
	
	@Test
	public void testGeMovieGenderSupenso() {
		List<Movie> result = nomiMovies.getMoviesGenderSuspenso(movies);
		assertEquals(2, result.size());
	}
	
	@Test
	public void testGeTwoMovies() {
		List<Movie> result = nomiMovies.getTwoMovies(movies);
		assertEquals(2, result.size());
	}
	
	@Test
	public void testgetMovieQualificationHigherThan8() {
		List<Movie> result = nomiMovies.getMovieQualificationHigherThan8(movies);
		assertEquals(3, result.size());
	}
	
	@Test
	public void testgetMovieQualificationLessThan8() {
		List<Movie> result = nomiMovies.getMovieQualificationLessThan8(movies);
		assertEquals(1, result.size());
	}
	
	@Test
	public void testGetMovieDuartionHigherThan2H() {
		List<Movie> result = nomiMovies.getMovieDuartionHigherThan2H(movies);
		assertEquals(3, result.size());
	}
	
	@Test
	public void testGetAverageDurationTime() {
		LocalTime result = nomiMovies.getAverageDurationTime(movies);
		assertNotNull(result);
	}
	
	@Test
	public void testGetMovieMoreDuration() {
		Movie movieExpect = new Movie("The irishman", "Drama", 
				 8.1, LocalTime.parse("03:29:00")); 
		Movie result = nomiMovies.getMovieMoreDuration(movies);
		assertEquals(movieExpect.getTitle(), result.getTitle());
	}
	
	@Test
	public void testGetThreeMovieHigherThan3H() {
		List<Movie> result = nomiMovies.getThreeMovieHigherThan2H(movies);
		assertEquals(3, result.size());
	}
	
	@Test
	public void testGetCountMovieGenderDrama() {
		long result = nomiMovies.getCountMovieGenderDrama(movies);
		assertEquals(1, result);;
	}
}
