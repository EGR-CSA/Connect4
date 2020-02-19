public class GameBoard{
    private final int rows = 6;
    private final int columns = 7;
    private char[][] gameBoard = new char[rows][columns]; 
    
    public GameBoard(){
        //initializes gameBoard with empty spaces
        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 7; j++){
                gameBoard[i][j] = '-';
            }
        }
    }

    public int addPiece(int column, char player){
        //adds the players chose piece to the correct location in the give column
        //returns the row that the piece was added to
        for(int i=rows;i>0;i--){
            if(gameBoard[i][column] == '-'){
                gameBoard[i][column] = player;
                return i;
            }
        }
        //return 1;
    }

    boolean checkWin(int row, int column){
        //checks to see if current player has won the game based on the given 
        //row and column locations from the parameters
        //returns true if win condition is met
        
        return false;
    }

    int checkInput(int column){
        //check if the column is a valid location to place the player piece
        //if not, ask for a valid column
        //return the original column, or the updated column if it was not a valid location
        
        return column;
    }

    public String toString(){
        //return a string with the gameBoard 2D array formatted
        //to look like a connect 4 game.
        String connect4Board = "";
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                connect4Board += "- "+gameBoard[i][j]+" -";
            }
            connect4Board += "\n"; 
        }
        return connect4Board;
    }

    public void rageQuit(char player){
        System.out.println("You have rage quit the game!");
        //Display a broken connect 4 game and a 
        //message about the rageQuit
        System.out.println("|_|_|_|_|_|_|_|	/        /_|_|_|_|_|_|_|		X");
        System.out.println("|_|_|_|_|_|_|_|	\\        \\_|_|_|_|_|_|_|		       O");
        System.out.println("|_|_|_|_|_|_|_|	/        /_|_|_|_|_|_|_| 	X	");
        System.out.println("|_|_|_|_|_|_|_|	\\        \\_|_|_|_|_|_|_|		O");
        System.out.println("|_|_|_|_|_|_|_| /       / _|_|_|_|_|_|_|                            O  X  ");
        System.out.println("|_|_|_|_|_|_|_|	\\       \\ _|_|_|_|_|_|_| 	        	X");
        System.out.println("|_|_|_|_|_|_|_|/       /_|_|_|_|_|_|_|_|    O   O");
        System.out.println("|	X		O	                       |		X");
        System.out.println("|		X		O                      |	    O");
        System.out.println("|	X	                O	X	O      |");

    }
}