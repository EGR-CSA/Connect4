import java.util.*;
public class Connect4{
    public static void main(String[] args) {
        //Set up player pieces
        //ask for column to place piece
        //check column (input) for validity or rageQuit
        //add piece in column
        //check for win condition
        //display updated gameBoard
        //repeat 42 times, alternating between 1st player 
        //and 2nd player until win condition is met
        //

        String columnLine;
        Scanner keyboard = new Scanner(System.in);
        String secretCode = welcomeScreen();
        System.out.println("Select a character: x or o");
        char character = keyboard.nextLine().toLowerCase().charAt(0);
        char character2;
        GameBoard board = new GameBoard();
        boolean gameStatus = false;
        int row;

        while(character != 'x' && character != 'o'){
            System.out.println("Please Enter x or o.");
            character = keyboard.nextLine().toLowerCase().charAt(0);
        }
        if(character == 'x'){
            System.out.println("Player One is x");
            System.out.println("Player Two is o");
            character2 = 'o';
        }else{
            System.out.println("Player One is o");
            System.out.println("Player Two is x");
            character2 = 'x';
        }

        int i = 0; 
        while(i <= 42 && !gameStatus){
            System.out.println(board.toString());
                System.out.println("Which column do you want to place your piece?");
                columnLine = keyboard.nextLine().substring(0,1);
                int column = Integer.parseInt(columnLine) -1;

                column = board.checkInput(column);
            if(i%2 == 0){
                if(column == 69){
                    board.rageQuit(character);
                    break;
                } else{
                    row = board.addPiece(column, character);
                } 
            }else{
                if(column == 69){
                    board.rageQuit(character2);
                    break;
                } else{
                    row = board.addPiece(column, character2);
                } 
            }
            gameStatus = board.checkWin(row,column);
            i++; 
        }

        if(gameStatus == true){
            System.out.println("Congratulations! You won!");
        }
        if(i == 43){
            System.out.println("Well, looks like it's a tie...");
        }

    }

    public static String welcomeScreen(){
        System.out.println("\n\n\n");
        System.out.println(" CCCCCC    OOOOOO   NNN   NN  NNN   NN  EEEEEEEE   CCCCCC   TTTTTTTT");
        System.out.println("CCCCCCCC  OOOOOOOO  NNNN  NN  NNNN  NN  EEEEEEEE  CCCCCCCC  TTTTTTTT");
        System.out.println("CC    CC  OO    OO  NN N  NN  NN N  NN  EE        CC    CC     TT   ");
        System.out.println("CC        OO    OO  NN NN NN  NN NN NN  EEEEEE    CC           TT   ");
        System.out.println("CC        OO    OO  NN NN NN  NN NN NN  EEEEEE    CC           TT   ");
        System.out.println("CC    CC  OO    OO  NN  N NN  NN  N NN  EE        CC    CC     TT   ");
        System.out.println("CCCCCCCC  OOOOOOOO  NN  NNNN  NN  NNNN  EEEEEEEE  CCCCCCCC     TT   ");
        System.out.println(" CCCCCC    OOOOOO   NN   NNN  NN   NNN  EEEEEEEE   CCCCCC      TT   ");
        System.out.println();
        System.out.println();
        System.out.println("                             444444");
        System.out.println("                           444 444");
        System.out.println("                         444  444");
        System.out.println("                       444   444");
        System.out.println("                      444444444444");
        System.out.println("                    44444444444444");
        System.out.println("                           444");
        System.out.println("                          444");
        System.out.println("                         444");
        System.out.println("\n\n\n");
        System.out.println("Press Enter to Continue");
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        return input;


        
    } //Nope

}