import java.util.*;

class Maze_MasonN
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		Maze maze = new Maze();
		
		boolean gameRunning = true;
		boolean vaildMove;
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
			}
			
			else {
				System.out.println("An error happened please try again");
			}
		}
	}
}