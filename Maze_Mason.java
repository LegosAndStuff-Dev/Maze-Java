import java.util.*;

class Maze_Mason
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
			
			System.out.println(move);
			//vaildMove = maze.move(move);
			maze.move("d");
			vaildMove = true;
			
			if (vaildMove == true) {
				maze.displayOutput();
			}
			
			else {
				System.out.println("An error happened please try again");
			}
		}
	}
}