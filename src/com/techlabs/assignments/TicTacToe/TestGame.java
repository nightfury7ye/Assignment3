package com.techlabs.assignments.TicTacToe;

import java.util.Scanner;

public class TestGame {

	public static void main(String[] args) {
		Board board = new Board();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe");
		int option = 2;
		gameRunner(board, scanner, option);
	}

	private static void gameRunner(Board board, Scanner scanner, int option) {
		if(board.getStatus() != 0) {
			displayBoard(board);
//			System.out.println("Enter your choice\n1. X \n2. O");
			option = option == 1 ? 2 : 1;
//			option = scanner.nextInt();
			System.out.println("Enter in which position you want to insert(1 to 9)");
			int position = scanner.nextInt();
			switch (option) {
			case 1:
				try {
					board.setCellMark(position, MarkType.X);
				} catch (CellAlreadyMarkedException e) {
					System.out.println(e.getMessage());
				}
				gameRunner(board, scanner, option);
				break;
			case 2:
				try {
					board.setCellMark(position, MarkType.O);
				} catch (CellAlreadyMarkedException e) {
					System.out.println(e.getMessage());
				}
				gameRunner(board, scanner, option);
				break;
			default:
				System.out.println("Sorry Select right option");
				gameRunner(board, scanner, option);
				break;
			}
		}
		displayBoard(board);
		System.out.println("Game Over");
		System.exit(01);
		
	}

	private static void displayBoard(Board board) {
		MarkType mark = MarkType.EMPTY;
		int count = 1;
		System.out.println();
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				mark = board.getCell()[i][j].getMark();
				System.out.print((mark == MarkType.EMPTY ? count : mark) +"\t");
				count++;
			}
			System.out.println();	
		}
		System.out.println();
	}

}
