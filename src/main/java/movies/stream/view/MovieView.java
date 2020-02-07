package movies.stream.view;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import movies.stream.controller.IMovies;
import movies.stream.controller.NomiMovies;
import movies.stream.entity.Movie;



public class MovieView {
	
	
	public void getOption() {
		String opcionSeleccionada = JOptionPane.showInputDialog("Elija una opcion");
		int opcion = opcionSeleccionada != null && !opcionSeleccionada.isEmpty() 
				? Integer.parseInt(opcionSeleccionada) : 0;
		IMovies moviesOp = new NomiMovies();
		
		
		switch (opcion) {
		case 0:
			break;
		case 1:
			JOptionPane
				.showMessageDialog
					(null, "1. --Promedio de calificaciones-- \n"+
							moviesOp.getAverageQualification(getMovies()));
			break;
		case 2:
			JOptionPane
			.showMessageDialog
				(null,
					"2. --Pelicula con mayor calificacion--\n"+	
					mostrarMovie(moviesOp.getMovieMaxQualification(getMovies())));
			break;
		case 3:
			JOptionPane
			.showMessageDialog
				(null, "3. --Pelicula con menor calificacion--\n"+
						mostrarMovie(moviesOp.getMovieMinQualification(getMovies())));
			break;
		case 4:
			JOptionPane.showMessageDialog(null, 
					"4. --Peliculas del genero de Drama--\n"+
					listarMovies(moviesOp.getMoviesGenderDrama(getMovies())));
			break;
		case 5:
			JOptionPane.showMessageDialog(null, 
					"5. --Peliculas del genero de suspenso--\n"+
					listarMovies(moviesOp.getMoviesGenderSuspenso(getMovies())));
			break;
		case 6:
			JOptionPane.showMessageDialog(null, 
					"6. --Obtener 2 peliculas--\n"+
					listarMovies(moviesOp.getTwoMovies(getMovies())));
			break;
		case 7:
			JOptionPane.showMessageDialog(null, 
					"7. --Peliculas con calificacion mayor de 8--\n"+
					listarMovies(moviesOp.getMovieQualificationHigherThan8(getMovies())));
			break;
		case 8:
			JOptionPane.showMessageDialog(null, 
					"8. --Peliculas con calificacion menor de 8--\n"+
					listarMovies(moviesOp.getMovieQualificationLessThan8(getMovies())));
			break;
		case 9:
			JOptionPane.showMessageDialog(null,
					"9. --Peliculas con duracion mayor a 2 Horas--\n"+
					listarMovies(moviesOp.getMovieDuartionHigherThan2H(getMovies())));
			break;
		case 10:
			JOptionPane
				.showMessageDialog
					(null, "10. --Promedio de duracion-- \n"+moviesOp.getAverageDurationTime(getMovies()));
			break;
		case 11:
			JOptionPane
				.showMessageDialog
					(null, "11. --Pelicula con mas duracion-- \n"+mostrarMovie(moviesOp.getMovieMoreDuration(getMovies())));
			break;
		case 12:
			JOptionPane.showMessageDialog(null, 
					"12. --Tres peliculas con duracion mayor a 2 Horas--\n"+
					listarMovies(moviesOp.getThreeMovieHigherThan2H(getMovies())));
			break;
		case 13:
			JOptionPane
				.showMessageDialog
					(null, "13. --Numero de peliculas del genero Drama--\n"+moviesOp.getCountMovieGenderDrama(getMovies()));
			break;
		default:
			getOption();
			break;
		}
		
		if (opcion != 0) getOption();
		
	}
	
	
	public List<Movie> getMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("The irishman", "Drama", 
				8.1, LocalTime.parse("03:29:00")));
		movies.add(new Movie("Parasito", "Suspenso", 
				 8.6, LocalTime.parse("02:12:00")));
		movies.add(new Movie("JoJo Rabit", "Comedia", 
				8.0, LocalTime.parse("01:48:00")));
		movies.add(new Movie("1917", "Drama", 
				8.7, LocalTime.parse("01:59:00")));
		movies.add(new Movie("Once upon a time", "Drama", 
				7.8, LocalTime.parse("02:41:00")));
		movies.add(new Movie("Joker", "Suspenso", 
				 8.6, LocalTime.parse("02:02:00")));
		movies.add(new Movie("Avengers End Game", "Suspenso", 
				 8.6, LocalTime.parse("02:02:00")));
		movies.add(new Movie("Pain and Glory", "Drama", 
				 7.7, LocalTime.parse("01:53:00")));
		movies.add(new Movie("Little Women", "Drama", 
				 8.3, LocalTime.parse("02:15:00")));
		movies.add(new Movie("Ford v Ferrari", "Drama", 
				 8.6, LocalTime.parse("02:32:00")));
		return movies;
	}
	
	public String mostrarMovie(Movie movie) {
		return  "*****MOVIE**** \n"
				+ "Titulo: "+ movie.getTitle() + "\n"
			 + "Genero: "+ movie.getGender() + "\n"
			 + "Calificacion "+ movie.getQualification() + "\n"
			 + "Duracion " + movie.getDuration() +"\n"; 
	}
	
	public String listarMovies(List<Movie> movies) {
		String result = "";
		for (Movie movie : movies) {
			result += mostrarMovie(movie);
		}
		
		return result;
	}

}


