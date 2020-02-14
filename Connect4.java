import java.util.*;
public class Connect4 {
    public static void main(String[] args) {
        String secretCode = welcomeScreen();
        //Set up player pieces
        //ask for column to place piece
        //check column (input) for validity or rageQuit
        //add piece in column
        //check for win condition
        //display updated gameBoard
        //repeat 42 times, alternating between 1st player 
        //and 2nd player until win condition is met
        //




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

    }

}