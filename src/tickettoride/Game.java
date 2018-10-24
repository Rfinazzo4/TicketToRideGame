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
    private ArrayList<TrainCard> TrainDeck;
    //Create List of Destination Deck Cards 
    private ArrayList<DestCard> DestDeck;
    private ArrayList<Player> Playerlist;
    private Board board;
    private int playerindex;
    Display d;


    public Game(){
        
        //initalize Display Variable
        d= new Display();
        //Set index to zero
        playerindex=0;
        
        //Initialize the Decks and Player list
        TrainDeck = new ArrayList<>();
        DestDeck = new ArrayList<>();
        Playerlist = new ArrayList<>();
        //Describe the game at the start, 
        d.displayStart();
        
        ///////////////////////////////////////
        //Setup
        //initialize the Players
        Player P;
        for (int i=0; i<5;i++){
            if(i>1){
                if(!d.morePlayers()){
                    break;
                }
            }
            P = d.readPlayer();
            Playerlist.add(i,P);
        }

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
    
    public void shuffleDestDeck(ArrayList<DestCard> DestDeck){
        //assuming there is 100 dest cards (need to check) 
        Random rand = new Random();
        DestCard Cardtemp;
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
        
        
        
       //board.UpdateBoard();
        return true;
    }
    

    public boolean makeMove(){ //definition will need to be changed
        //check if valid move 
        //return false if not
        board.UpdateBoard("Abitrary string for now. ");
        return true;
    }

    public void shuffleTrainDeck(ArrayList<String> TrainDeck){

        Random rand = new Random();
        TrainCard Cardtemp;
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
        
        game.endGame();
        

       
     
    } 
}
