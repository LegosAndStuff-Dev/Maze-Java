import java.util.*;

class Maze_Mason
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		Maze maze = new Maze();
		
		boolean gameRunning = true;
		boolean vaildMove;
		boolean winGame;
		String move;
		String startGame;
		
		System.out.println("Instructions: ");
		System.out.println("1) use 'w' or 'up' to go up");
		System.out.println("2) use 'a' or 'left' to go left");
		System.out.println("3) use 's' or 'down' to go down");
		System.out.println("4) use 'd' or 'right' to go right");
		
		System.out.println();
		
		System.out.print("Say next to play the game or say 99 to quit: ");
		startGame = input.next();
		
		if (startGame.equalsIgnoreCase("next")) {
			maze.displayOutput();
			
			while (gameRunning) {
				System.out.print("Enter move: ");
				move = input.next();
				
				vaildMove = maze.move(move);
				
				//vaildMove = true;
				
				if (vaildMove == true) {
					maze.displayOutput();
					
					winGame = maze.checkWinGame();
					
					if (winGame == true) {
						gameRunning = false;
					}
				}
				
				else {
					System.out.println("An error happened please try again");
				}
			}
			System.out.println();
			System.out.println("You won, congrats!");
		}
		
		else if (startGame.equalsIgnoreCase("99")) {
			System.out.println("You quit the game");
		}
		
		else {
			System.out.println("Invalid input please run the prgram again.");
		}
	}
}