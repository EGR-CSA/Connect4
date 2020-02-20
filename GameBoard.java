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

        for(int i=k; i<j; i++){
            if(gameBoard[row+i-3][column]==(check) && gameBoard[row+i-2][column]==(check) && gameBoard[row+i-1][column]==(check) && gameBoard[row+i][column]==(check)){
                return true;
            }
        }

        //check 2 - horizontal

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

        //check 3 - LU to RD

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

        //check 4 - LD to RU
        
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
        //check if the column is a valid location to place the player piece
        Scanner marsh = new Scanner(System.in);
        boolean x =false;
        int input1 = column;
        while(x = false){
        if(input1<7&&input1>-1||input1==69){
        if(gameBoard[input1][0]=='-'){
            x=true;
        }
        else{
            System.out.println("That column is full please enter another column");
            input1 = marsh.nextInt();
        }
    }
        //if not, ask for a valid column
        else{
            System.out.println("That Column does not exist please enter a number between 1 and 6");
            input1 = marsh.nextInt();
        }
    }




        //return the original column, or the updated column if it was not a valid location
        return input1;
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