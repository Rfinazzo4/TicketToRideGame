/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

public class Display {
    
    public void displayStart(){
        System.out.println("Inside the mehtod that wil describe the game");
        System.out.println("-----------------------");
        //Add details below
        System.out.println("We will be describing the game here");
        System.out.println("");
    }
   
    public void displayBoard(String[][] board) {
       for (int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               System.out.print(board[i][j]);
           }
           System.out.println("");
       }
    }
    
    public void endGame(Player winner){
        System.out.println("The game is over! Thank you all for playing. ");
        System.out.println("-------------------------------");
        //Winenr will be sent, for the purposes of the Skeleton we simply 
        //sent an arbitrary Player
        System.out.println("The Winner is: "+ winner.GetName());
    
    }
    
}
