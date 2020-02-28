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
        String tempCharacter = keyboard.nextLine().toLowerCase();
        char character;
        char character2;
        GameBoard board = new GameBoard();
        boolean gameStatus = false;
        int row;
        int column;
        boolean bot = false; 

        while(!tempCharacter.equals("x") && !tempCharacter.equals("o")){
            System.out.println("Please Enter x or o.");
            tempCharacter = keyboard.nextLine().toLowerCase();
        }
        character = tempCharacter.charAt(0);
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
        while(i <= 41 && !gameStatus){
            System.out.println(board.toString());
                System.out.println("Which column do you want to place your piece?");
                try{
                    column = keyboard.nextInt()-1;
                } catch(Exception e){
                    String trash = keyboard.nextLine();
                    column = -1;
                }
  
            column = board.checkInput(column);

            if (column == 68) {
                board.rageQuit(character);
                return;
            }
            
            i++;
            if(i%2 == 1){
                if(column == 68){
                    board.rageQuit(character);
                    break;
                } else{
                    row = board.addPiece(column, character);
                } 
            }else{
                if(column == 68){
                    board.rageQuit(character2);
                    break;
                } else{
                    row = board.addPiece(column, character2);
                } 
            }
            gameStatus = board.checkWin(row,column);
        }

        if(gameStatus == true){
            System.out.println("Congratulations! You won!");
            System.out.println(board);
        }
        else if(i == 42){
            System.out.println("Well, looks like it's a tie...");
            System.out.println(board);
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