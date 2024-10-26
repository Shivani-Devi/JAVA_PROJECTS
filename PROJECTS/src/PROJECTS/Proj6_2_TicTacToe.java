package PROJECTS;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
	public static void main(String[] args) {
		runGame();
	}
	
	public static void runGame() {
		String winner = "";
		
		boolean xTurn= true;
		String[][] gameBoard = new String[3][3];
		
		initializeGameBoard(gameBoard);
		printGameBoard(gameBoard);
		
		while(winner.equals("")) {
			if(xTurn) {
				System.out.println("It`s X`s turn");
			}
			else {
				System.out.println("It`s 0`s turn");
			}
			
			getUserInput(xTurn, gameBoard);
			System.out.println();
			
			printGameBoard(gameBoard);
			winner = getWinner(gameBoard);
			xTurn = !xTurn;
			
			if(winner.equals("") && isBoardFull(gameBoard)) {
				winner="C";
			}
		}//end while
		System.out.println();
		
		if(winner.equals("C")) {
			System.out.println("It was the Cat`s game! No WINNER");
		}
		else {
			System.out.println("The winner is "+winner);
		}
	}
	
	//initializing the empty game board with only spaces 
	// if not then null will be assigned and cause exceptions later
	public static void initializeGameBoard(String[][] gameBoard) {
		for(int i=0; i<gameBoard.length; i++) {
			for(int j=0; j<gameBoard[i].length; j++) {
				gameBoard[i][j] =" "; //initializing the space 
			}
		}
	}
	
	public static void printGameBoard(String[][] gameBoard) {
		for(int i=0; i<gameBoard.length; i++) {
			for(int j=0; j<gameBoard[i].length; j++) {
				System.out.print(gameBoard[i][j]);
				if(j<2) {// 0, 1
					System.out.print(" | ");
				}
			}//end j
			System.out.println();
			if(i<2) {
				System.out.print("- - - - - -");
			}
			System.out.println();
		}//end i
	}

	public static void getUserInput(boolean xTurn, String[][] gameBoard) {
		Scanner sc = new Scanner(System.in);
		int row = -1;
		int col = -1;
		//boolean keepAsking = true;
		
		while(true) {// (keepAsking)
			System.out.println("Please enter the row"
					+" then the column from 0, 1, 2"
					+ " separated by a space.");
			row=sc.nextInt();
			col=sc.nextInt();
			sc.nextLine();
			
			if(row>=0 && row<=2 && col>=0 && col<=2) {
				if(!cellAlreadyOccupied(row, col, gameBoard)) {
					break;// keepAsking=false; means not occupied then move to take "X" or "O"
				}
				else {
					System.out.println("The cell is already occupied");
				}
			}//end if
		}//end while
		
		if(xTurn) {
			gameBoard[row][col]="X";
		}
		else {
			gameBoard[row][col]="O";
		}
		
	}
	
	public static boolean cellAlreadyOccupied(int row, int col, String[][] gameBoard) {
		return !gameBoard[row][col].equals(" ");//means no empty space
	}
	
	public static String getWinner(String[][] gameBoard) {
		final int ROWS = gameBoard.length;
		final int COLS = gameBoard[0].length; //will give the number of columns from the first row as it will be same along the rows
		
		for(int i=0; i<ROWS; i++) {
			if(!gameBoard[i][0].equals(" ") && gameBoard[i][0].equals(gameBoard[i][1])
					&& gameBoard[i][1].equals(gameBoard[i][2])) {
				return gameBoard[i][0];
			}
		}//end for
		
		for(int i=0; i<COLS; i++) {
			if(!gameBoard[0][i].equals(" ") && gameBoard[0][i].equals(gameBoard[1][i])
					&& gameBoard[1][i].equals(gameBoard[2][i])) {
				return gameBoard[0][i];
			}
		}//end for
		
		if(!gameBoard[0][0].equals(" ") && gameBoard[0][0].equals(gameBoard[1][1])
				&& gameBoard[1][1].equals(gameBoard[2][2])) {
			return gameBoard[0][0];
		}
		
		if(!gameBoard[2][0].equals(" ") && gameBoard[2][0].equals(gameBoard[1][1])
				&& gameBoard[1][1].equals(gameBoard[0][2])) {
			return gameBoard[2][0];
		}
		
		return "";
		}
	
	public static boolean isBoardFull(String[][] gameBoard) {
		int countFill=0;
		
		for(int i=0; i<gameBoard.length; i++) {
			for(int j=0; j<gameBoard[i].length; j++) {
				if(!gameBoard[i][j].equals(" ")) {//cell either contain X or 0
					countFill++; // then increment the countFill
				}
			}//end j
		}//end i
		return countFill == 9; 
	}
}
