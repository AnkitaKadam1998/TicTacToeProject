public class GameBoard {
	
	public static char[] createboard()
	{
		char [] board = new char[10];
				for(int i=1;i<10;i++)
				{
					board[i] = ' ';
				}
				
				return board;
    
    }
	
	public static void main(String args[])
	{
		char[] board = createboard();
	}
}


