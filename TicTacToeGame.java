public class TicTacToeGame
{
  //////////////create variables/////////////////////
 private char p1, p2, p3, p4, p5, p6, p7, p8, p9;
 /////////////////////////////////////////////////////
 
 public TicTacToeGame()
 {
  p1 = '1';
  p2 = '2';
  p3 = '3';
  p4 = '4';
  p5 = '5';
  p6 = '6';
  p7 = '7';
  p8 = '8';
  p9 = '9';
 }
 
 public String toString()
 {
  String rstr = "";
  rstr = p1 + "|" + p2 + "|" + p3 + "\n" +
        "_" + " " + "_" + " " + "_" + "\n" + 
        p4 + "|" + p5 + "|" + p6 + "\n" +
        "_" + " " + "_" + " " + "_" + "\n" + 
        p7 + "|" + p8 + "|" + p9 + "\n";
  return rstr;
 }
 
 ////////////////////////////////////////////////
 /////////Decide Winner//////////////////////////
 ////////////////////////////////////////////////
 public boolean thereIsAWinner()
 {
  if (p1 == 'X' && p2 == 'X' && p3 == 'X')
   return true;
  if (p4 == 'X' && p5 == 'X' && p6 == 'X')
   return true;
  if (p7 == 'X' && p8 == 'X' && p9 == 'X')
   return true;
  if (p1 == 'X' && p4 == 'X' && p7 == 'X')
   return true;
  if (p2 == 'X' && p5 == 'X' && p8 == 'X')
   return true;
  if (p3 == 'X' && p6 == 'X' && p9 == 'X')
   return true;
  if (p1 == 'X' && p5 == 'X' && p9 == 'X')
   return true;
  if (p3 == 'X' && p5 == 'X' && p7 == 'X')
   return true;
  
  if (p1 == 'O' && p2 == 'O' && p3 == 'O')
   return true;
  if (p4 == 'O' && p5 == 'O' && p6 == 'O')
   return true;
  if (p7 == 'O' && p8 == 'O' && p9 == 'O')
   return true;
  if (p1 == 'O' && p4 == 'O' && p7 == 'O')
   return true;
  if (p2 == 'O' && p5 == 'O' && p8 == 'O')
   return true;
  if (p3 == 'O' && p6 == 'O' && p9 == 'O')
   return true;
  if (p1 == 'O' && p5 == 'O' && p9 == 'O')
   return true;
  if (p3 == 'O' && p5 == 'O' && p7 == 'O')
   return true;
  
  else
   return false;
 }

 ////////////////////////////////////////////////////////////////
//////////////// //Computer Action// ////////////////////////////
 public void makeComputerMove()
 {
  while (true)
  {
   int move = ((int)(Math.random() * 9) + 1);
   
   if( move == 1 && p1 != 'X' && p1 !='O')
   {
    p1= 'X';
    break;
   }
 
   if( move == 2 && p2 != 'X' && p2 !='O')
   {
    p2= 'X';
    break;
   }
 
   if( move == 3 && p3 != 'X' && p3 !='O')
   {
    p3= 'X';
    break;
   }
 
   if( move == 4 && p4 != 'X' && p4 !='O')
   {
    p4= 'X';
    break;
   }
 
   if( move == 5 && p5 != 'X' && p5 !='O')
   {
    p5= 'X';
    break;
   }
 
   if( move == 6 && p6 != 'X' && p6 !='O')
   {
    p6= 'X';
    break;
   }
   
   if( move == 7 && p7 != 'X' && p7 !='O')
   {
    p7= 'X';
    break;
   }
 
   if( move == 8 && p8 != 'X' && p8 !='O')
   {
    p8= 'X';
    break;
   }
 
   if( move == 9 && p9 != 'X' && p9 !='O')
   {
    p9= 'X';
    break;
   }
  }
 }
 
  public void makePlayerXMove(int num)
 {
if(num == 1)
   p1= 'X';
  
  if(num == 2)
   p2= 'X';
  
  if(num == 3)
   p3= 'X';
  
  if(num == 4)
   p4= 'X';
  
  if(num == 5)
   p5= 'X';
  
  if(num == 6)
   p6= 'X';
  
  if(num == 7)
   p7= 'X';
  
  if(num == 8)
   p8= 'X';
  
  if(num == 9)
   p9= 'X';
  }

 
 
 
 ////////////////////////////////////////////////////////////////////
 //////// Player 2 Action /////////////////////////////////////////////
 public void makePlayerMove(int num)
 {
  if(num == 1)
   p1= 'O';
  
  if(num == 2)
   p2= 'O';
  
  if(num == 3)
   p3= 'O';
  
  if(num == 4)
   p4= 'O';
  
  if(num == 5)
   p5= 'O';
  
  if(num == 6)
   p6= 'O';
  
  if(num == 7)
   p7= 'O';
  
  if(num == 8)
   p8= 'O';
  
  if(num == 9)
   p9= 'O';
  
 }
}