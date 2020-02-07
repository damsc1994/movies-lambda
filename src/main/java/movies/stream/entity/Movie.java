package movies.stream.entity;

import java.time.LocalTime;

public class Movie {
	private String title;
	private String gender;
	private double qualification;
	private LocalTime Duration;

	public Movie(String title, String gender, double qualification, LocalTime duration) {
		this.title = title;
		this.gender = gender;
		this.qualification = qualification;
		Duration = duration;
	}

	public String getTitle() {
		return title;
	}


	public String getGender() {
		return gender;
	}

	public double getQualification() {
		return qualification;
	}


	public LocalTime getDuration() {
		return Duration;
	}
	
}
