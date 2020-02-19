public class GameBoard{
    private final int rows = 6;
    private final int columns = 7;
    private String[][] gameBoard = new String[rows][columns]; 
    
    public GameBoard(){
        //initializes gameBoard with empty spaces
        String[][] gameBoard = new String[6][7];//this line needs to be removed as it is redundant with the private attribute for gameBoard
        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 7; j++){
                gameBoard[i][j] = "--";
            }
        }
    }

    public int addPiece(int column, char player){
        //adds the players chose piece to the correct location in the give column
        //returns the row that the piece was added to
        for(int i=rows;i>0;i--){
            if(gameBoard[i][column].equals("--")){
                gameBoard[i][column] = player+"";
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
            System.out.println(); 
        }
        return "| "+gameBoard[0][0]+" - "+gameBoard[0][1]+" - "+gameBoard[0][2]+" - "+gameBoard[0][3]+" - "+gameBoard[0][4]+" - "+gameBoard[0][5]+" - "+gameBoard[0][6]+" |\n"+"| "+gameBoard[1][0]+" - "+gameBoard[1][1]+" - "+gameBoard[1][2]+" - "+gameBoard[1][3]+" - "+gameBoard[1][4]+" - "+gameBoard[1][5]+" - "+gameBoard[1][6]+" |\n"+"| "+gameBoard[2][0]+" - "+gameBoard[2][1]+" - "+gameBoard[2][2]+" - "+gameBoard[2][3]+" - "+gameBoard[2][4]+" - "+gameBoard[2][5]+" - "+gameBoard[2][6]+" |\n"+"| "+gameBoard[3][0]+" - "+gameBoard[3][1]+" - "+gameBoard[3][2]+" - "+gameBoard[3][3]+" - "+gameBoard[3][4]+" - "+gameBoard[3][5]+" - "+gameBoard[3][6]+" |\n"+"| "+gameBoard[4][0]+" - "+gameBoard[4][1]+" - "+gameBoard[4][2]+" - "+gameBoard[4][3]+" - "+gameBoard[4][4]+" - "+gameBoard[4][5]+" - "+gameBoard[4][6]+" |\n"+"| "+gameBoard[5][0]+" - "+gameBoard[5][1]+" - "+gameBoard[5][2]+" - "+gameBoard[5][3]+" - "+gameBoard[5][4]+" - "+gameBoard[5][5]+" - "+gameBoard[5][6]+" |\n"+"-----------------------------";
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