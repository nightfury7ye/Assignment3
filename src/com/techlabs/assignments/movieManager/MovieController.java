package com.techlabs.assignments.movieManager;

import java.util.Scanner;

public class MovieController {
	private MovieManager movieManager;
	Scanner scanner = new Scanner(System.in);
	MovieController() {
		movieManager = new MovieManager();
	}
	
	public void start() {
		displayMenu();
	}
	
	private void displayMenu() {
		System.out.println("\nMenu (type option Name)\n"
				+ "1. Fetch all Movies\n"
				+ "2. Add movie\n"
				+ "3. Get movie Id\n"
				+ "4. Clear Movie List\n"
				+ "5. Save Movie list to File\n"
				+ "6. Exit\n");
		int option = -1;
//		scanner.next();
		option = scanner.nextInt();
		
		switch (option) {
		case 1:
			if(movieManager.getMovies().isEmpty())
				System.out.println("No movies Found");
			else
				movieManager.getMovies().forEach(movie -> System.out.println(movie));
			displayMenu();
			break;
		case 2:
			setMovieDetails();
			displayMenu();
			break;
		case 3:
			scanner.next();
			String MovieName = scanner.nextLine();
			int id = movieManager.getMovieID(MovieName);
			System.out.println("Movies ID:"+ id );
			displayMenu();
			break;
		case 4:
			movieManager.clearMovies();
			displayMenu();
			break;
		case 5:
			movieManager.saveMovie();
			displayMenu();
			break;
		case 6:
			System.out.println("Exiting Application");
			break;
		default:
			displayMenu();
			break;
		}
		
	}
	private void setMovieDetails() {
		System.out.println("Enter Movie id followed by year, Name and Genre");
		int id =scanner.nextInt();
		int year = scanner.nextInt();
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println();
		String genre = scanner.nextLine();
		Movie movie = new Movie(id, year, name, genre);
		movieManager.addMovie(movie);
	}
	
}
