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
		
		maze.displayOutput();
		
		//maze.move("d");
		
		//maze.displayOutput();
		
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
}