/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

public class Display {
    
    public void displayStart(){
        System.out.println("Inside DisplayStart");
        System.out.println("-----------------------");
        //Add details below
        System.out.println("We will be describing the game here");
    }
   
    public void displayBoard(String[][] board) {
       for (int i=0;i<5;i++){
           for(int j=0;j<4;j++){
               System.out.println(board[i][j]);
           }
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
