import java.util.*;
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
        /** This method checks the rows of one column from bottom to top to find the first open space that a piece can go
         * Once it finds this place it then puts the char that the current player is associated with into that array slot
         * and then it returns the value of the row the piece was put in.
         * @param column an int that is used to determine whch column a connect4 piece goes into
         * @param player a char that deermines which players piece goes into the selected spot
         * @return i
         */
        //adds the players chose piece to the correct location in the give column
        //returns the row that the piece was added to
        for(int i=rows-1;i>=0;i--){
            if(gameBoard[i][column] == '-'){
                gameBoard[i][column] = player;
                return i;
            }
        }
        return 1;
    }

    boolean checkWin(int row, int column){
        char check = gameBoard[row][column];


        //check 1 - verticle

        //set end checkpoint
        int j = 4;
        if((row+3)>5){
            j--;
            if((row+2)>5){
                j--;
                if((row+1)>5){
                    j--;
                }
            }
        }

        //set begining point
        int k = 0;
        if((row-3)<0){
            k++;
            if((row-2)<0){
                k++;
                if((row-1)<0){
                    k++;
                }
            }
        }

        //Do all viable verticle checks
        for(int i=k; i<j; i++){
            if(gameBoard[row+i-3][column]==(check) && gameBoard[row+i-2][column]==(check) && gameBoard[row+i-1][column]==(check) && gameBoard[row+i][column]==(check)){
                return true;
            }
        }

        //check 2 - horizontal (refrence comments on verticle check on how it works)

        j = 4;
        if((column+3)>6){
            j--;
            if((column+2)>6){
                j--;
                if((column+1)>6){
                    j--;
                }
            }
        }

        k = 0;
        if((column-3)<0){
            k++;
            if((column-2)<0){
                k++;
                if((column-1)<0){
                    k++;
                }
            }
        }

        for(int i=k; i<j; i++){
            if(gameBoard[row][column+i-3]==(check) && gameBoard[row][column+i-2]==(check) && gameBoard[row][column+i-1]==(check) && gameBoard[row][column+i]==(check)){
                return true;
            }
        }

        //check 3 - LU to RD (refrence comments on verticle check on how it works)

        j = 4;
        if((column+3)>6 || (row+3)>5){
            j--;
            if((column+2)>6 || (row+2)>5){
                j--;
                if((column+1)>6 || (row+1)>5){
                    j--;
                }
            }
        }

        k = 0;
        if((column-3)<0 || (row-3)<0){
            k++;
            if((column-2)<0 || (row-2)<0){
                k++;
                if((column-1)<0 || (row-1)<0){
                    k++;
                }
            }
        }

        for(int i=k; i<j; i++){
            if(gameBoard[row+i-3][column+i-3]==(check) && gameBoard[row+i-2][column+i-2]==(check) && gameBoard[row+i-1][column+i-1]==(check) && gameBoard[row+i][column+i]==(check)){
                return true;
            }
        }

        //check 4 - LD to RU (refrence comments on verticle check on how it works)
        
        j = 4;
        if((column+3)>6 || (row-3)<0){
            j--;
            if((column+2)>6 || (row-2)<0){
                j--;
                if((column+1)>6 || (row-1)<0){
                    j--;
                }
            }
        }

        k = 0;
        if((column-3)<0 || (row+3)>5){
            k++;
            if((column-2)<0 || (row+2)>5){
                k++;
                if((column-1)<0 || (row+1)>5){
                    k++;
                }
            }
        }

        for(int i=k; i<j; i++){
            if(gameBoard[row-i+3][column+i-3]==(check) && gameBoard[row-i+2][column+i-2]==(check) && gameBoard[row-i+1][column+i-1]==(check) && gameBoard[row-i][column+i]==(check)){
                return true;
            }
        }

        return false;
    }

    int checkInput(int column){
        if (column == 68) {
            return 68;
        }
        //check if the column is a valid location to place the player piece
        Scanner marsh = new Scanner(System.in);
        boolean x =false;
        int input1 = column;
        String trash = "";
        boolean needsCorrection = true;
            if(!((input1 <= 6 && input1 >= 0) || input1 == 68)||isFull(input1)){
                while (needsCorrection==true){
                    System.out.println("Please enter an integer between 1 and 7");
                    try{
                        input1 = marsh.nextInt()-1;
                        if (input1 == 68) {
                            return 68;
                        }
                        if ((input1 <= 6 && input1 >= 0)||input1==68){
                            if(gameBoard[0][input1]=='-'){
                                needsCorrection=false;
                            } else{
                                System.out.println("That column is full please enter another column.");
                            }
                                                       
                        }
                    }catch(Exception e){
                        System.out.println("Homie you best enter an integer now!");
                        input1 = -1;
                        trash = marsh.nextLine();
                    }
                }
                return input1;
            
            } else

                return input1;
        }
        public boolean isFull(int column){
            if(column!=68){
            if(gameBoard[0][column]=='-'){
                return false;
            }else {
                System.out.println("column is full");
                return true;
            }
        }else
        return false;
        }
        
    
    

    public String toString(){
        //return a string with the gameBoard 2D array formatted
        //to look like a connect 4 game.
        String connect4Board = "";
        for(int i = 0; i<rows; i++){
            connect4Board += "- ";
            for(int j = 0; j<columns; j++){
                connect4Board += gameBoard[i][j]+"-";
            }
            connect4Board += " -\n"; 
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














/*
int checkInput(int column){
    //check if the column is a valid location to place the player piece
    Scanner marsh = new Scanner(System.in);
    boolean x =false;
    int input1 = column;
    boolean needsCorrection = true;
    
        if(!((input1 <= 6 && input1 >= 0) || input1 == 68)){
            
            while (needsCorrection==true){
                System.out.println("Please enter an integer between 1 and 7");
                try{
                    input1 = marsh.nextInt()-1;
                    if ((input1 < 7 && input1 > -1)||input1==68){
                        needsCorrection=false;
                    }
                }catch(Exception e){
                    System.out.println("Homie you best enter an integer now!");
                }
            }
            return input1;
        
        } else
            return input1;
    }
    */