import java.util.Scanner;

public class ShowBoard {

	static char playerSymbol, computerSymbol;
	static Scanner sc = new Scanner(System.in);

	 
	public static char[] createEmptyBoard() 
	{
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) 
		{
			board[i] = ' ';
		}
		return board;
	}

	 
	public static char chooseXorO() {
		System.out.println("Enter the symbol:'X' or 'O' ");
		char symbol = Character.toUpperCase(sc.next().charAt(0));
		if (symbol == 'X' || symbol == 'O') {
			playerSymbol(symbol);
			return symbol;
		} else {
			System.out.println("Invalid Character. Try Again.");
			return chooseXorO();
		}
	}

	 
	public static void playerSymbol(char playerSymbols) {

		if(playerSymbols == 'X')
		{
			playerSymbol = 'X';
			computerSymbol = 'O';
		}
		else if(playerSymbols == 'O')
		{
			playerSymbol = 'O';
			computerSymbol = 'X';
		}
		System.out.println("player letter to play is "+playerSymbol);
		System.out.println("computer letter to play is "+computerSymbol);

	}


	
	public static void displayBoard(char[] board) {
		System.out.println("\n\t " + board[1] + " | " + board[2] + " | " + board[3] + "\n\t-----------");
		System.out.println("\t " + board[4] + " | " + board[5] + " | " + board[6] + "\n\t-----------");
		System.out.println("\t " + board[7] + " | " + board[8] + " | " + board[9] + "\n\t");
	}

	private static boolean isEmpty(char[] board) {
		for(char cell: board) {
			if(cell == ' ')
				return true;
		}
		return false;
	}

	public static void chooseLocatin(char [] board)
	{	
		System.out.println("check the index you want to play");
		Scanner sc1 = new Scanner(System.in);
		int location = sc1.nextInt();
		while(location > 8 || location < 0)
		{
			System.out.println("enter the valid index to make move");
			location = sc1.nextInt();
		}
		if(location >= 0 && location <= 8) {
			switch(location)
			{
			case 0:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 1:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 2:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 3:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 4:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 5:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 6:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 7:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 8:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			}
		}
	}

	
	//to take player move
	public static void movePlayer(char[] board) {
		System.out.print("Enter the index you want to move to: ");
		int index = sc.nextInt();
		while (index < 0 || index > 8) {
			System.out.print("Wrong Input. Try Again : ");
			index = sc.nextInt();
		}
		if (board[index] == ' ') {
			board[index] = playerSymbol;
			displayBoard(board);
		} else {
			System.out.println("Index not available. Choose another");
			movePlayer(board);
		}	
	}

	// toss to who plays first
		public static void toss(char[] board) {
			int toss = (int) (Math.random() * 2 % 2);
			if (toss == HEAD) {
				System.out.println("Player Wins the Toss.");
				lastPlayed = "Player";
				movePlayer(board);						
			}else {
				System.out.println("Computer Wins the Toss.");
				lastPlayed = "Computer";

			}
		}

	public static void main(String[] args) {

		char[] board = createEmptyBoard();
		playerSymbol = chooseXorO();
		displayBoard(board);
		chooseLocatin(board);
		movePlayer(board);
	}
}


