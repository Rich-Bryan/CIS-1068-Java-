import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        // variable to store the rounds play, user win, computer win
        int roundPlays = 0;
        int userWon = 0;
        int computerWon = 0;


        System.out.println("welcome to this game");
        //printing the rules
        rules();

        //create the user input
        Scanner input = new Scanner(System.in);

        // create random number generator for computer choice
        Random random = new Random();

        // asking user for input, using a boolean variable to control the condition of the game. T =>continue, F=>quit
        System.out.println("Would you like to play a round of game? Enter y for playing, Enter n for quit.");

        Boolean gameCondition = helpChoice(input);

        while (gameCondition == true){

            //user move and store into a variable
            String userMove = userChoice(input);
            //computer move and store into a variable
            String computerMove = computerChoice(random);

            // start of the game
            if (winner(userMove, computerMove)){
                // if user win add 1 to the userWon
                System.out.println("user won the round");
                userWon++;
            }
            else{
                //add 1 to the computerWon
                System.out.println("computer won the round");
                computerWon++;
            }
            roundPlays++;


            //  at the end ask the user if they want to play again
            System.out.println("Do you want to play again? Enter y for playing, Enter n for quit.");
            gameCondition = helpChoice(input);
        }

        System.out.println("Rounds Play: " + roundPlays);
        System.out.println("User Won: " + userWon);
        System.out.println("Computer Won: " + computerWon);


    }



    // Rules of the game
    public static void rules(){
        System.out.println("During each round, players choose a move, which may be either Skadis, Tjusig, " +
                "Klyket, Hovolm, or Pershult. The rules are: \n"
                    +"1. Pershult beats Klyket, Skadis \n"
                    + "2. Klyket beats Tjusig, Hovolm \n"
                    + "3. Tjusig beats Pershult, Skadis \n"
                    + "4. Skadis Beats Hovolm, Klyket \n"
                    + "5. Hovolm beats Pershult, Tjusig \n
                    + "6. computer wins in a event of a tie\n");
    }

    //  helper choice for checking yes or no
    public static Boolean helpChoice(Scanner input){
        // turn the user choice to lower case to avoid case-sensitive
        String playerChoice = input.nextLine().toLowerCase();

        // use of a while loop to check if user enter the right choice
        while((!playerChoice.equals("n")) && (!playerChoice.equals("y"))){
            System.out.println("Error! Please enter y or n");
            playerChoice = input.nextLine().toLowerCase();
        }
        // checking if user want to play or not
        if (playerChoice.equals("y")){
            return true;
        }else if(playerChoice.equals("n")){
            System.out.println("Goodbye!");
        }
        return false;

    }

    //get the user input
    public static String userChoice(Scanner input){
        // get the user input
        System.out.println("Pick a move either 'S' for Skadis, 'T' for Tjusig, 'K' for Klyket, 'H' for Hovolm, or " +
                "'P' for Pershult");
        // avoid case-sensitive
        String userMove = input.nextLine().toUpperCase();
        //storing string value
        String nameMove = "";

        // using a while loop until the user pick a right choice
        while(!userMove.equals("S") && !userMove.equals("T") && !userMove.equals("K") && !userMove.equals("H") && !userMove.equals("P") ){
            System.out.println("Error! Please enter either 'S' for Skadis, 'T' for Tjusig, 'K' for Klyket, 'H' for Hovolm, or " +
                    "'P' for Pershult");
            userMove = input.nextLine().toUpperCase();
        }
        if(userMove.equals("S")){
            nameMove = "Skadis";
        }
        else if(userMove.equals("T")){
            nameMove = "Tjusig";
        }
        else if(userMove.equals("K")){
            nameMove = "Klyket";
        }
        else if(userMove.equals("H")){
            nameMove = "Hovolm";
        }
        else if(userMove.equals("P")){
            nameMove = "Pershult";
        }
        System.out.println("Your move is " + nameMove);
        return nameMove;

    }

    //computer choice on the moves
    public static String computerChoice(Random random){

        String computerMove = "";
        //making a random choice
        int number = random.nextInt(5);
        // choice are : 0, 1, 2, 3, 4
        // checking the choice
        if (number == 0){
            computerMove = "Pershult";
        }
        else if(number == 1){
            computerMove = "Klyket";
        }
        else if(number == 2){
            computerMove = "Tjusig";
        }
        else if(number == 3){
            computerMove = "Skadis";
        }
        else{
            computerMove = "Hovolm";
        }
        System.out.println("computer move : " + computerMove);
        return computerMove;
    }


    //determine the winner
    public static Boolean winner(String player, String computer){
        // return true if player win
        if(player.equals("Pershult") && (computer.equals("Klyket") || computer.equals("Skadis"))){
            return true;
        }
        else if(player.equals("Klyket") && (computer.equals("Tjusig") || computer.equals("Hovolm"))){
            return true;
        }
        else if(player.equals("Tjusig") && (computer.equals("Pershult") || computer.equals("Skadis"))){
            return true;
        }
        else if(player.equals("Skadis") && (computer.equals("Hovolm") || computer.equals("Klyket"))){
            return true;
        }
        else if(player.equals("Hovolm") && (computer.equals("Pershult") || computer.equals("Tjusig"))){
            return true;
        }
        return false;

    }

}
