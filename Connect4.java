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

        Scanner keyboard = new Scanner(System.in);
        String secretCode = welcomeScreen();
        System.out.println("Select a character: X or O");
        char character = keyboard.next().charAt(0);
        char character2;

        while(character != 'X' || character != 'O'){
            System.out.println("Please Enter X or O.");
            character = keyboard.next().charAt(0);
        }
        if(character == 'x'){
            System.out.println("Player One is X");
            System.out.println("Player Two is O");
            character2 = 'O';
        }else{
            System.out.println("Player One is O");
            System.out.println("Player Two is X");
            character2 = 'X';
        }

        System.out.println(temp); // Gonna be the board object
        System.out.println("Which column do you want to place your piece?");
        int column = keyboard.nextInt()-1;
     
        while(column <= 0 || column > 8){
            System.out.println("Please enter a valid column (1-7)");
            column = keyboard.nextInt()-1;
        }
        addPiece(column, character);
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