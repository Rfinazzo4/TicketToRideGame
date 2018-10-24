/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;
import java.util.Scanner;




public class Display {
    Scanner reader;
    int count;

    Display(){
        reader = new Scanner(System.in);  // Reading from System.in
        count=0; //set count to zero
    }
        
    public void displayStart(){
        
        System.out.println("Inside the methood that wil describe the game");
        System.out.println("-----------------------");
        //Add details below
        System.out.println("We will be describing the game here");
        System.out.println("");
    }
   
    public void displayBoard(Space[][] board) {
       for (int i=0;i<5;i++){
           for(int j=0;j<5;j++){
               System.out.print(board[i][j].getMark());
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
        reader.close();
    
    }

    public Player readPlayer() {
        System.out.println("--------------------------------------");
        System.out.print("Player "+ ++count +" Please enter you name : ");
        String name = reader.nextLine();
        Player P = new Player(name);
        return P;
    }

    boolean morePlayers() {
        System.out.println("Another PLayer? Yes or other key for no");
        String input = reader.nextLine();
        if (input.equals("Yes") || input.equals("Yes")){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
