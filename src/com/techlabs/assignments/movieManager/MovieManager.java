package com.techlabs.assignments.movieManager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
	private List<Movie> movies;
	static final String pathName = "./MovieData/data.txt";
	public MovieManager() {
		movies = new ArrayList<>();
		loadMovie();
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
		System.out.println("Added the Movie Successfully");
	}
	public void clearMovies() {
		movies = new ArrayList<Movie>();
		System.out.println("Cleared the list successfully");
	}
	
	public int getMovieID(String name) {
		int id = -1;
		for (Movie movie : movies) {
			if(movie.getName().contains(name))
				id = movie.getId();
		}
		return id;
	}
	
	public void loadMovie() {
		try {
            FileInputStream fileIn = new FileInputStream("data.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            movies = (ArrayList<Movie>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("ArrayList deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		
	}
	
	public void saveMovie() {
		try {
            FileOutputStream fileOut = new FileOutputStream("data.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(movies);
            out.close();
            fileOut.close();
            System.out.println("List is saved to the File Successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public List<Movie> getMovies() {
		return movies;
	}
	
}
