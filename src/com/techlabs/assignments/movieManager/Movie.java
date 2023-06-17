package com.techlabs.assignments.movieManager;

import java.io.Serializable;

public class Movie implements Serializable {
	int id, year;
	String name, genre;
	public Movie(int id, int year, String name, String genre) {
		super();
		this.id = id;
		this.year = year;
		this.name = name;
		this.genre = genre;
	}
	public Movie() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [id: " + id + ", year: " + year + ", name: " + name + ", genre: " + genre + "]";
	}
	
}
