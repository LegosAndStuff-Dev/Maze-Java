/**
 * @(#)Maze.java
 *
 *
 * @author 
 * @version 1.00 2022/4/22
 */


public class Maze {
	
	String[][] maze = {
		{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
		{"O", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "|"},
		{"|", " ", "-", "-", " ", "-", "-", "|", "|", " ", "|", "-", "|", " ", "|"},
		{"|", " ", "|", "|", " ", "|", " ", "|", "|", " ", "|", " ", "|", " ", "|"},
		{"|", "-", "|", "|", " ", "|", " ", "|", "|", " ", "|", " ", "|", " ", "|"},
		{"|", " ", " ", " ", " ", "|", " ", "|", "|", " ", " ", " ", "|", " ", "|"}, 
		{"|", " ", "-", " ", "-", "-", "-", "|", "|", "-", "-", "-", "|", " ", "|"},
		{"|", " ", "|", "_", "|", "_", "_", "_", "|", " ", " ", " ", " ", " ", "|"},
		{"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", "-", "-", "-", "-", "|"},
		{"|", " ", "-", "-", "-", " ", "-", " ", "|", " ", " ", " ", " ", " ", "|"},
		{"|", "_", "|", " ", "|", "_", "|", "_", "|", "-", "-", "-", "-", " ", "|"}
							};
							
	private boolean foundRow;
	private boolean foundCol;
	private boolean vaildMove;
	private int row;
	private int col;
	private int tempRow;
	private int tempCol;
	private int newCol;
	private int newRow;

    public Maze() {
    }
    
    public void displayOutput () {
    	for (int r = 0; r < 11; r ++) {
    		for (int c = 0; c < 15; c ++) {
    			System.out.print(maze[r][c]);
    		}
    		System.out.println();
    	}
    }
    
    private int getRow () {
    	for (int r = 0; r < 11; r ++) {
    		for (int c = 0; c < 15; c ++) {
    			if (maze[r][c].equals("O")) {
    				foundRow = true;
    				row = r;
    				break;
    			}
    		}
    		
    		if (foundRow == true) {
    			break;
    		}
    	}
    	foundRow = false;
    	return  row;
    }
    
     private int getCol () {
    	for (int r = 0; r < 11; r ++) {
    		for (int c = 0; c < 15; c ++) {
    			if (maze[r][c].equals("O")) {
    				foundCol = true;
    				col = c;
    				break;
    			}
    		}
    		
    		if (foundCol == true) {
    			break;
    		}
    	}
    	
    	foundCol = false;
    	return  col;
    }
    
    public boolean move (String move) {
    	//w row +1
    	//a col -1
    	//s row -1
    	//d col +1
    	/*
    	if (move.equalsIgnoreCase("w") || move.equalsIgnoreCase("up")) {
    		if (maze[getRow() + 1][getCol()].equals("-") || maze[getRow() + 1][getCol()].equals("|") || maze[getRow() + 1][getCol()].equals("_")) {
    			vaildMove = false;
    		}
    		
    		else if (maze[getRow() + 1][getCol()].equals(" ")) {
    			tempRow = getRow();
    			tempCol = getCol();
    			
    			maze[getRow() + 1][getCol()] = "O"; 
    			maze[getRow()][getCol()] = " ";
    			
    			vaildMove = true;
    			
    		}
    	}
    	*/
    	if (move.equalsIgnoreCase("a") || move.equalsIgnoreCase("left")) {
    		tempRow = getRow();
    		tempCol = getCol();
    		
    		newRow = tempRow;
    		newCol = tempCol -1;
    		
    		if (newCol <= -1) {
    			vaildMove = false;
    		}
    		
    		else if (maze[newRow][newCol].equals("-") || maze[newRow][newCol].equals("|") || maze[newRow][newCol].equals("_")) {
    			vaildMove = false;
    		}
    		
    		else if (maze[getRow()][getCol() - 1].equals(" ")) {
    			maze[tempRow][tempCol - 1] = "O"; 
    			maze[tempRow][tempCol] = " ";
    			
    			vaildMove = true;
    			
    		}
    	}
    	
    	else if (move.equalsIgnoreCase("s") || move.equalsIgnoreCase("down")) {
    		tempRow = getRow();
    		tempCol = getCol();
    		
    		newRow = tempRow + 1;
    		newCol = tempCol;
    		
    		if (maze[newRow][newCol].equals("-") || maze[newRow][newCol].equals("|") || maze[newRow][newCol].equals("_")) {
    			vaildMove = false;
    		}
    		
    		else if (maze[newRow][newCol].equals(" ")) {
    			System.out.println("got 2nd");
    			maze[newRow][newCol] = "O"; 
    			maze[tempRow][newCol] = " ";
    			
    			vaildMove = true;
    			
    		}
    	}
    	
    	
    	else if (move.equalsIgnoreCase("d") || move.equalsIgnoreCase("right")) {
    		tempRow = getRow();
    		tempCol = getCol();
    		
    		newRow = tempRow;
    		newCol = tempCol + 1;
    		
    		if (maze[newRow][newCol].equals("-") || maze[newRow][newCol].equals("|") || maze[newRow][newCol].equals("_")) {
    			vaildMove = false;
    		}
    		
    		else if (maze[newRow][newCol].equals(" ")) {
    			System.out.println("2nd part");
    			maze[tempRow][newCol] = "O"; 
    			maze[tempRow][tempCol] = " ";
    			
    			vaildMove = true;
    			
    		}
    	}
    	
    	return vaildMove;
    	
    }
    
    public boolean checkWinGame () {
    	//10
    	//13
    	
    	tempRow = getRow();
    	tempCol = getCol();
    	
    	if (tempRow == 10 && tempCol == 13) {
    		return true;
    	}
    	
    	else {
    		return false;
    	}
    }
}