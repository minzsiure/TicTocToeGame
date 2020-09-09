import java.util.Scanner; 
public class TTTGame
{
 public static void main(String [] args)
 {
  int moveCount = 0;
  Scanner keyboard = new Scanner(System.in); //create scanner//
  int userInput; 
  int user2Input;
  
  TicTacToeGame myBoard = new TicTacToeGame(); //initialize game//
  
  //choose WHO TO BE player//
  System.out.println("Do you want to play with 1.Computer OR 2.Another player?");
  System.out.println("Enter your choice(1 OR 2): ");
  int choice = keyboard.nextInt();
  
  //choose computer//
  if (choice == 1){
  System.out.println("Let's play Tic Tac Toe Game with computer!");
  
  myBoard.toString(); 
  
  System.out.println();
  System.out.println(myBoard);
  
  while(true)
  {
   myBoard.makeComputerMove();
   moveCount++;
   //computer moves//
   if (moveCount == 9 && myBoard.thereIsAWinner() == false)
   {
    System.out.println("Tie.");
    break;
   }
   System.out.println("Computer moves.");
   System.out.println(myBoard);
   
   if (myBoard.thereIsAWinner())
   {
    System.out.println("Computer Wins!");
    break;
   }
   //player move//
   System.out.print("Put your 'O' in what position: ");
   userInput = keyboard.nextInt();
   
   myBoard.makePlayerMove(userInput);
   moveCount++;
   
   if (moveCount == 9 && myBoard.thereIsAWinner() == false)
   {
    System.out.println("Tie.");
    break;
   }
   
   if(myBoard.thereIsAWinner())
   {
    System.out.println("You Win!");
    break;
   }
   
   
   System.out.println("You move.");
   System.out.println(myBoard);
   
   
   
  
  }
   
  
 } 
//computer mode ends//
//.............................................................// 
  
  
//Choose another player//
  if (choice == 2){
  System.out.println("Let's play Tic Tac Toe Game with your friend!");
  
  myBoard.toString(); 
  
  System.out.println();
  System.out.println(myBoard);
  
  //player 1 moves//
    while(true)
  {
   System.out.print("Put your 'X' in what position: ");
   userInput = keyboard.nextInt();
   
   myBoard.makePlayerXMove(userInput);
   moveCount++;
   if (moveCount == 9 && myBoard.thereIsAWinner() == false)
   {
    System.out.println("Tie.");
    break;
   }
   
   if(myBoard.thereIsAWinner())
   {
    System.out.println("Plyer 1 Wins (with O)!");
    break;
   }
   
   System.out.println("Player 1 moves.");
   System.out.println(myBoard);
   System.out.println();

   //player 2 move//
   System.out.print("Put your 'O' in what position: ");
   user2Input = keyboard.nextInt();
   
   //////if same input///////
   if (userInput == user2Input)
   {
     System.out.println("Invalid input. Try again...");
     System.out.print("Put your 'O' in what position: ");
   
     user2Input = keyboard.nextInt();
   
     myBoard.makePlayerMove(user2Input);
     System.out.println("Player 1 moves.");
     System.out.println(myBoard);
     System.out.println();
   }
   
   else{
   myBoard.makePlayerMove(user2Input);  
   moveCount++;
   if (moveCount == 9 && myBoard.thereIsAWinner() == false)
   {
    System.out.println("Tie.");
    break;
   }
   
   if(myBoard.thereIsAWinner())
   {
    System.out.println("Plyer 2 Wins (with O)!");
    break;
   }
   System.out.println("Player 2 moves.");
   System.out.println(myBoard);
   System.out.println();
    
   }
  }
   
  
 }
  
  
  
}
}
