/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import java.util.ArrayList;
import java.util.Random;


public class Game {
        //Lists
    private ArrayList<TrainCard> TrainDeck;
    private ArrayList<DestCard> DestDeck;
    private ArrayList<Player> Playerlist;
        //Board
    private Board board;            
        //Counts and indexs
    private int playerindex;        //Index of the current Player  (Is this needed??) 
    private int DDtopIndex;           //Destination Deck, index of top card
    private int TDtopIndex;           //TrainCard Deck, index of top card
        //Other misc variables
    private Display d; 
    private Random rand;

    
    // Game Constructor
    /////////////////
    // Initalizes variables/lists, sets up the game 
    // Collaborates with Display(View) to interact with User
    
    public Game(){
        
        d= new Display();   //initalize Display Variable
        playerindex=0;      //Set index to zero
        
        //Create random object for creating random integers
        rand= new Random();
        
        //Create the Decks and Player list
        TrainDeck = new ArrayList<>();
        DestDeck = new ArrayList<>();
        Playerlist = new ArrayList<>();
        
        //Describe the game at the start, 
        
        d.displayStart();
        
        //Ask if user wants to 
        d.readRules();
        
        
        //Setup
        ///////////////
        
        //Initialize the Players
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

        //Create Dest cards 
        DestCard tempdc = new DestCard("Vancouver","Winnipeg",9,"Grey"); //1 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Seattle", "Los Angeles", 9, "Green"); //2 Card 
        DestDeck.add(tempdc);
        tempdc= new DestCard("Salt Lake City", "Portland", 6, "Blue"); //3 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Phoenix", "Little Rock", 8, "Yellow"); //4 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Denver", "Pittsburg", 11, "Black"); //5 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Ohklahoma City", "Duluth", 5, "Red"); //6 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Seattle", "Vancouver", 1, "Grey"); //7 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Seattle", "Portland", 1, "Grey");//8 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Helena", "Los Angeles", 8, "Blue"); //9 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Miami", "Houston", 8, "Yellow"); //10 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Boston", "Raleigh", 6, "Green"); //11 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("New York", "Chicago", 5, "Black"); //12 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Sault St Marie", "Dallas", 10, "Blue"); //13 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Dallas", "Nashville", 5, "Grey"); //14 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Nashville", "Miami", 5, "Grey"); //15 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Miami", "Charleston", 4, "Blue"); //16 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Chareston", "Washington DC", 4, "Yellow"); //17 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Toronto", "Chicago", 4, "Black"); //18 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Chicago", "St Louis", 2, "Red"); //19 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("St Louis", "Kansis City", 2, "Grey"); //20 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Washington DC", "Montreal", 5, "Green"); //21 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("New York", "Little Rock", 9, "Red"); //22 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Little Rock", "New Orleans", 3, "Green"); //23 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("New Orleans", "Houston", 2, "Grey"); //24 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Houston", "El Paso", 6, "Yellow"); //25 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Nashville", "Charleston", 3, "Black"); //26 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Los Angeles", "Santa Fe", 6, "Black"); //27 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Sante Fe", "Helena", 6, "Green"); //28 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("El Paso", "Dallas", 4, "Grey"); //29 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("Montreal", "Boston", 2, "Yellow"); //30 Card
        DestDeck.add(tempdc);
        //Finished Creating Dest Deck
        
        //Set Destination deck top index to 29
        DDtopIndex=29;
        //Shuffle Destination Deck
        shuffleDestDeck();
        
        //Deal 3 Destination Cards to each Player
        for (int i =0; i<3;i++){
            int randint;
            for(Player p :Playerlist){
                randint=rand.nextInt(DDtopIndex--);
                
                p.AddToDestDeck(DestDeck.get(randint));
                DestDeck.remove(randint);
            }
        }
        
        //Check if user returns a card
        for(Player p: Playerlist){
            DestCard temp= d.displayPlayerDestcards(p);
            if(temp!=null){ //If they do add card back into deck
                DestDeck.add(temp);
                DDtopIndex++;
            }
        }
    
        //Create Train cards 
        for (int i=0; i<6;i++){
            TrainCard traintemp;
            switch(i){
                case 0: //create 15 Red
                    traintemp = new TrainCard("Red");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 1: //create 15 Blue
                    traintemp = new TrainCard("Blue");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 2: //create 15 Green
                    traintemp = new TrainCard("Green");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 3: //create 15 Black
                    traintemp = new TrainCard("Black");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }break;
                case 4: //create 15 Yellow
                    traintemp = new TrainCard("Yellow");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }   
                    break;
                case 5: //create 15 Locomotive
                    traintemp = new TrainCard("Locomotive");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }   
                    break;
            }
                    
        }
        
        //Set TrainCard deck top index to 89
        TDtopIndex=89;
        //Shuffle Destination Deck
        shuffleTrainDeck();
        
        //Deal 4 Train Cards to each Player
        for (int i =0; i<4;i++){
            int randint;
            for(Player p :Playerlist){
                
                p.AddToTrainDeck(TrainDeck.get(TDtopIndex));
                TrainDeck.remove(TDtopIndex--);
            }
        }
        
        //Set top five Train Cards in deck to 'FaceUp' 
        for(int i = 0;i<5;i++){
            TrainDeck.get(TDtopIndex-i).setIsFaceUp(true);
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
        //player at index of winner player 
        d.endGame(Playerlist.get(playerindex));
    } 
    
    public void shuffleDestDeck(){
        //assuming there is 100 dest cards (need to check) 
        DestCard Cardtemp;
        int inttemp; 
        for (int i =0;i<DestDeck.size(); i++){
            inttemp = rand.nextInt(DDtopIndex);
            Cardtemp = DestDeck.get(inttemp);
            DestDeck.set(inttemp, DestDeck.get(i));
            DestDeck.set(i,Cardtemp); 
            
        }
    }
    
 
    

    public boolean makeMove(){ //definition will need to be changed
        //check if valid move 
        //return false if not
        
        //board.UpdateBoard("Abitrary string for now. ");
        return true;
    }

    public void shuffleTrainDeck(){

        TrainCard Cardtemp;
        int inttemp; 
        for (int i =0;i<TrainDeck.size(); i++){
            inttemp = rand.nextInt(TDtopIndex);
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
