/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import java.util.ArrayList;
import java.util.Random;


public class Game {
    //Create List of Train Deck Cards 
    private ArrayList<String> TrainDeck;
    //Create List of Destination Deck Cards 
    private ArrayList<String> DestDeck;
    private ArrayList<Player> Playerlist;
    private Board board;
    private int playerindex=0;
    private int nextplayer;
    Display d;
   

    
    Game(){
        //initalize Display Variabke
        d= new Display();
        TrainDeck = new ArrayList<>();
        DestDeck = new ArrayList<>();
        Playerlist = new ArrayList<>();
        //Describe the game at the start, 
        d.displayStart();
        
        
        
    }
    
    public void setUp(){
        //initialize the Decks, this will be changed in the future to the trainDeck Class
        
        //initialize the Players
     
        Player p1 = new Player("Inderpreet");
        Playerlist.add(p1);
        Player p2 = new Player("Ayoub");
        Playerlist.add(p2);
    
        //initialize the Board
        board = new Board();
        board.DisplayB();
        
    }
    
    public void endGame(){
        //End game, calulate winner and call Display endgame
        //here is where the caluation woudl occur

        
        //compare scores
        
        //sending an arbitrary player
        d.endGame(Playerlist.get(playerindex));
    } 
    
    public void shuffleDestDeck(ArrayList<String> DestDeck){
        //assuming there is 100 dest cards (need to check) 
        Random rand = new Random();
        String Cardtemp;
        int inttemp; 
        for (int i =0;i<DestDeck.size(); i++){
            inttemp = rand.nextInt(99);
            Cardtemp = DestDeck.get(inttemp);
            DestDeck.set(inttemp, DestDeck.get(i));
            DestDeck.set(i,Cardtemp); 
            
        }
        
    }
    
    public boolean makeMove(){ //definition will need to be changed
        //check if valid move 
        //return false if not
        board.UpdateBoard("Abitrary string for now. ");
        return true;
    }

    public void shuffleTrainDeck(ArrayList<String> TrainDeck){
        Random rand = new Random();
        String Cardtemp;
        int inttemp; 
        for (int i =0;i<TrainDeck.size(); i++){
            inttemp = rand.nextInt(99);
            Cardtemp = TrainDeck.get(inttemp);
            TrainDeck.set(inttemp, TrainDeck.get(i));
            TrainDeck.set(i,Cardtemp); 
        }
        
    }
    
    public  ArrayList<Player> getPlayers(){
        return Playerlist;
    }
    
    public static void main(String[] args) {

        Display d = new Display();
        Game game = new Game();
        game.setUp();
        if(game.makeMove()){
            
        }
        
        game.endGame();

       
     
    } 
}
