import java.util.Scanner;

public class Rock
{
public static void main(String[] args)
{
  String personPlay; //User's play -- "R", "P", or "S"
 
  String computerPlay = "U"; //Computer's play -- "R", "P", or "S"
 
  int computerInt; //Randomly generated number for computer play

  int playerWin = 0;
  int playerLoss = 0;
  int playerTie = 0;
 
  Scanner scan = new Scanner(System.in);

for (int i = 0; i <= 10; i++) 
{
  //PHASE 1: GET USER INPUT
System.out.println("Enter your play: Rock, Paper, or Scissors:");
personPlay = scan.nextLine().toUpperCase();   //Get player's play -- note that this is stored as a string
  //Make player's play uppercase for ease of comparison

  //IF USER INPUT INVALID, STATE INVALID, REPROMPT QUESTION
if (personPlay.substring(0,1).equals("R") ||
    personPlay.substring(0,1).equals("P") ||
    personPlay.substring(0,1).equals("S") ||
    personPlay.substring(0,2).equals("RO") ||
    personPlay.substring(0,2).equals("PA") || 
    personPlay.substring(0,2).equals("SC")) {
} else {
System.out.println("Invalid, try again");
personPlay = scan.nextLine(); 
}
  
//COMPUTER GENERATES 0, 1, 2
computerInt = (int) (Math.random() * 3);    //Generate computer's play (0,1,2). Use the Math.random() method

//TAKE RANDOM NUMBER AND ASSIGN TO STRING R, P, S
switch (computerInt) {    //Translate computer's randomly generated play to string
    case 0:
     // System.out.println("Rock");
      computerPlay = "Rock";
      break;
    case 1:
   //   System.out.println("Paper");
      computerPlay = "Paper";
      break;
    case 2:
     // System.out.println("Scissors");
      computerPlay = "Scissors";
      break;
}

    //... Fill in rest of code
    //Print computer's play
    //See who won. Use nested ifs instead of &&.
  //System.out.println(personPlay.substring(0, 2));
  System.out.print("Computer Plays: ");
  System.out.println(computerPlay);

  if ((personPlay.toUpperCase().equals(computerPlay.toUpperCase())))
  {
    System.out.println("It's a tie!");
    playerTie ++;
    
  } else if ((personPlay.substring(0, 2).toUpperCase().equals("RO") || (personPlay.substring(0, 1).toUpperCase().equals("R"))) && (computerPlay.equals("Scissors"))) {
    System.out.println("Rock crushes scissors. You win!!");
    playerWin ++;
    
  } else if ((personPlay.substring(0, 2).toUpperCase().equals("SC") || (personPlay.substring(0, 1).toUpperCase().equals("S"))) && (computerPlay.equals("Rock"))) {
    System.out.println("Rock crushes scissors. You lose.");
    playerLoss ++;
    
  } else if ((personPlay.substring(0, 2).toUpperCase().equals("PA") || (personPlay.substring(0, 1).toUpperCase().equals("P"))) && (computerPlay.equals("Rock"))) {
    System.out.println("Paper covers rock. You win!!");
    playerWin ++;
    
  } else if ((personPlay.substring(0, 2).toUpperCase().equals("RO") || (personPlay.substring(0, 1).toUpperCase().equals("R"))) && (computerPlay.equals("Paper"))) {
    System.out.println("Paper covers rock. You lose.");
    playerLoss ++;
    
  } else if ((personPlay.substring(0, 2).toUpperCase().equals("SC") || (personPlay.substring(0, 1).toUpperCase().equals("S"))) && (computerPlay.equals("Paper"))) {
    System.out.println("Scissors cuts paper. You win!!");
    playerWin ++;
    
  } else if ((personPlay.substring(0, 2).toUpperCase().equals("Paper") || (personPlay.substring(0, 1).toUpperCase().equals("P"))) && (computerPlay.equals("Scissors"))) {
    System.out.println("Scissors cuts paper. You lose.");
    playerLoss ++;
  }

}
//player wins, ties, losses
System.out.println("Player won: " + playerWin);
System.out.println("Player loss: " + playerLoss);
System.out.println("Player ties: " + playerTie);

}
}
