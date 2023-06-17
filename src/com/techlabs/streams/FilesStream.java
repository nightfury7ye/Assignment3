package com.techlabs.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesStream {

	public static void main(String[] args) throws IOException {
		Files.lines(Paths.get("/Users/praveenvemula/Documents/Monocept/TestStreams.txt")).forEach(name -> System.out.println(name));

	}

}
