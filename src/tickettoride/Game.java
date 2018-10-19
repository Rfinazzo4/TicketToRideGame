/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import java.util.ArrayList;

public class Game {
    //Create List of Train Deck Cards 
    private ArrayList<String> TrainDeck;
    //Create List of Destination Deck Cards 
    private ArrayList<String> DestDeck;
    private ArrayList<Player> Playerlist;
    private Board board;
    private int playerindex;
    private int nextplayer;
    
    Game(){
        //Describe the game at the start, 
        System.out.println("Inside Game Constructor");
        System.out.println("-----------------------");
        //Add details below
        System.out.println("Describe the game here");
        
        //Call set up for initialing attributes
        setUp();
        System.out.println("leaving game constructor");
        
    }
    
    private void setUp(){
        //initialize the Decks
        TrainDeck = new ArrayList<String>();
        DestDeck = new ArrayList<String>();
        
        //initialize the Players
        //put in a getPlayers() method
        Player p = new Player("Inderpreet");
        Playerlist.add(p);
        p = new Player("Ayoub");
        Playerlist.add(p);
    
        //initialize the Board
        board = new Board();
    }
    
    public void endGame(){
        //End game, calulate winner and end program
        System.out.println("You have chosen to end the game");
        System.out.println("-------------------------------");
        //note: playerindex does not accurately calculate the winner, will need to be edited
        System.out.println("The Winner is: "+ Playerlist.at(playerindex).getName());
        
    } 
    
    public static void main(String[] args) {
       Game game = new Game();
        
    } 
}
