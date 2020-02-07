package movies.stream.controller;

import java.time.LocalTime;
import java.util.List;import java.util.stream.Collectors;

import movies.stream.entity.Movie;

public class NomiMovies implements IMovies{
	
	// Ejercicio 1
	@Override
	public double getAverageQualification(List<Movie> movies) {
		return movies.stream()
		.mapToDouble(mov -> mov.getQualification()).average().getAsDouble();
	}
	
	// Ejercicio 2
	@Override
	public Movie getMovieMaxQualification(List<Movie> movies) {
		return movies.stream().max((mv1, mv2) -> Double.compare(mv1.getQualification(), mv2.getQualification())).get();
	}
	
	//Ejercicio 3
	@Override
	public Movie getMovieMinQualification(List<Movie> movies) {
		return movies.stream().min((mv1, mv2) -> Double.compare(mv1.getQualification(), mv2.getQualification())).get();
	}
	
	//Ejercicio 4
	@Override
	public List<Movie> getMoviesGenderDrama(List<Movie> movies) {
		return movies.stream().filter(mv -> "Drama".equalsIgnoreCase(mv.getGender())).collect(Collectors.toList());
	}
	
	//Ejercicio 5
	@Override
	public List<Movie> getMoviesGenderSuspenso(List<Movie> movies) {
		return movies.stream().filter(mv -> "Suspenso".equalsIgnoreCase(mv.getGender())).collect(Collectors.toList());
	}
	
	//EEjercicio 6
	@Override
	public List<Movie> getTwoMovies(List<Movie> movies) {
		return movies.stream().limit(2).collect(Collectors.toList());
	}

	//EJercicio 7
	@Override
	public List<Movie> getMovieQualificationHigherThan8(List<Movie> movies) {
		return movies.stream().filter(mv -> mv.getQualification() > 8).collect(Collectors.toList());
	}

	//Ejercicio 8
	@Override
	public List<Movie> getMovieQualificationLessThan8(List<Movie> movies) {
		return movies.stream().filter(mv -> mv.getQualification() < 8).collect(Collectors.toList());
	}

	//Ejercicio 9
	@Override
	public List<Movie> getMovieDuartionHigherThan2H(List<Movie> movies) {
		return movies.stream().filter(mv -> mv.getDuration().isAfter(LocalTime.parse("02:00:00")))
				.collect(Collectors.toList());
	}
	
	//Ejercicio 10
	@Override
	public LocalTime getAverageDurationTime(List<Movie> movies) {
		return LocalTime.ofSecondOfDay((int) movies.stream()
				 .mapToLong(mv -> mv.getDuration().toSecondOfDay()).average().getAsDouble());
	}

	//Ejercicio 11
	@Override
	public Movie getMovieMoreDuration(List<Movie> movies) {
		return movies.stream().max((mv1, mv2) -> mv1.getDuration().compareTo(mv2.getDuration())).get();
	}

	//Ejercicio 12
	@Override
	public List<Movie> getThreeMovieHigherThan2H(List<Movie> movies) {
		return movies.stream().filter(mv -> mv.getDuration().isAfter(LocalTime.parse("02:00:00")))
				.limit(3).collect(Collectors.toList());
	}

	//Ejercicio 13
	@Override
	public long getCountMovieGenderDrama(List<Movie> movies) {
		return movies.stream().filter(mv -> "Drama".equalsIgnoreCase(mv.getGender())).count();
	}
	
}
