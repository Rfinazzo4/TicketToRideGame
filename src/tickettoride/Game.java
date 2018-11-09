/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Game {
    
        //Lists
    private ArrayList<TrainCard> TrainDeck;
    private ArrayList<DestCard> DestDeck;
    private ArrayList<Player> Playerlist;
    private String DestOne;
    private String DestTwo;
    
    
    
    //Board
    private Board board;            
        //Counts and indexs
    private int playerindex;        //Index of the current Player  (Is this needed??) 
    private int DDtopIndex;           //Destination Deck, index of top card
    private int TDtopIndex;           //TrainCard Deck, index of top card
        //Other misc variables
    private Display d; 
    private Random rand;
    private boolean play; //Determines whther the game is over (1=Continue playing
    //, 0 = game over)

    
    // Game Constructor
    /////////////////
    // Initalizes variables/lists, sets up the game 
    // Controller
 
    public Game(){
        
        //Initalize Variables
        playerindex=0;      //Set index to zero
        play=true;          //Set play to true; 
        //Create random object for creating random integers
        rand= new Random();
        
        d=new Display();
        //Create the Decks and Player list
        TrainDeck = new ArrayList<>();
        DestDeck = new ArrayList<>();
        Playerlist = new ArrayList<>();
        
        //Describe the game at the start, 
        
        //d.displayStart();
        
        //Ask if user wants to 
        //d.readRules();
        
        
        //Setup
        ///////////////
        
        //Initialize the Players
        Player P=new Player("Player 1", "Red");
        Playerlist.add(P);
        P=new Player("Player 2", "Blue");
        Playerlist.add(P);
        

        //Create Dest cards 
        DestCard tempdc = new DestCard("VAN","WIN",9,"Grey"); //1 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("SEA", "LA", 9, "White"); //2 Card 
        DestDeck.add(tempdc);
        for(Player p :Playerlist){
            p.AddToDestDeck(tempdc);
        }
        tempdc= new DestCard("SLC", "POR", 6, "Blue"); //3 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("PHE", "LR", 8, "Purple"); //4 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("DEN", "BIS", 6, "Black"); //5 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("OKC", "DUL", 8, "Red"); //6 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("SEA", "VAN", 1, "Grey"); //7 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("SEA", "POR", 1, "Grey");//8 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("HEL", "LA", 8, "Blue"); //9 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("MIA", "HOU", 8, "Purple"); //10 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("BOS", "RAE", 6, "White"); //11 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("NYC", "CHI", 5, "Black"); //12 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("STM", "DAL", 10, "Blue"); //13 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("DAL", "NAS", 5, "Grey"); //14 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("NAS", "MIA", 5, "Grey"); //15 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("MIA", "CHA", 4, "Blue"); //16 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("CHA", "DC", 4, "Purple"); //17 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("TOR", "CHI", 4, "Black"); //18 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("CHI", "STL", 2, "Red"); //19 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("STL", "KSC", 2, "Grey"); //20 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("DC", "MON", 5, "White"); //21 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("NYC", "LR", 9, "Red"); //22 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("LR", "NWO", 3, "White"); //23 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("NWO", "HOU", 2, "Grey"); //24 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("HOU", "ELP", 6, "Red"); //25 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("NAS", "CHA", 3, "Black"); //26 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("LA", "STF", 6, "Black"); //27 Card
        DestDeck.add(tempdc);
//        tempdc= new DestCard("STF", "HEL", 6, "White"); //28 Card
//        DestDeck.add(tempdc);
        tempdc= new DestCard("ELP", "DAL", 4, "Grey"); //28 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("MON", "BOS", 2, "Purple"); //29 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("DEN", "SLC", 5, "Red"); //30 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("PHE", "LA", 5, "Blue"); //31 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("RAE", "CHA", 3, "Red"); //32 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("WIN", "DUL", 4, "White"); //33 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("DUL", "STM", 4, "Purple"); //34 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("STM", "MON", 7, "Red"); //35 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("TOR", "MON", 3, "Black"); //36 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("KSC", "DEN", 8, "Grey"); //37 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("OKC", "SFE", 4, "Red"); //38 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("NWO", "HOU", 2, "Blue"); //39 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("PHE", "ELP", 3, "Purple"); //40 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("BIS", "WIN", 5, "White"); //41 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("HEL", "BIS", 8, "Grey"); //42 Card
        DestDeck.add(tempdc);
        
        //Finished Creating Dest Deck
        
        //Set Destination deck top index to 29
        DDtopIndex=29;
        //Shuffle Destination Deck
        Collections.shuffle(DestDeck);
        
        //Deal 3 Destination Cards to each Player
        for (int i =0; i<3;i++){
            int randint;
            for(Player p :Playerlist){
                randint=rand.nextInt(DDtopIndex--);
        
                p.AddToDestDeck(DestDeck.get(randint));
                DestDeck.remove(randint);
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
                case 2: //create 15 White
                    traintemp = new TrainCard("White");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 3: //create 15 Black
                    traintemp = new TrainCard("Black");
                    for (int j=0;j<15;j++){
                        TrainDeck.add(traintemp);
                    }break;
                case 4: //create 15 Purple
                    traintemp = new TrainCard("Purple");
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
            for(Player p :Playerlist){
                
                p.AddToTrainDeck(TrainDeck.get(TDtopIndex));
                TrainDeck.remove(TDtopIndex--);
            }
        }
        
        //Set top five Train Cards in deck to 'FaceUp' 
        for(int i = 0;i<5;i++){
            TrainDeck.get(TDtopIndex-i).setIsFaceUp(true);
        }
        
        //GAME SETUP IS DONE
        //START PLAYING GAME
        playGame();
         
    }
    
    //Adding a player to the Playerlist
     void addPlayer(Player p) {
        Playerlist.add(p);
    }
    
    
    public void playGame(){
        
    }
    
    public void endGame(){
        //End game, calulate winner and call Display endgame
        //here is where the caluation woudl occur

        
        //compare scores
       
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
    
    //Setting the potential Destination to button clicked
    public void setDestOne(String dest){
        this.DestOne=dest;
        System.out.println("Dest1: "+dest);
    }
    
    //Setting the potential Destination to button clicked
    public void setDestTwo(String dest){
        this.DestTwo=dest;
        System.out.println("Dest2: "+dest);
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

    void drawDestCard(Player P) {
        int randint;
        randint=rand.nextInt(DDtopIndex--);
        P.AddToDestDeck(DestDeck.get(randint));
        DestDeck.remove(randint);
    }

    void drawTrainCard(Player P) {
        P.AddToTrainDeck(TrainDeck.get(TDtopIndex));
        TrainDeck.remove(TDtopIndex--);
    }

    	//Getter for DestOne 
    public String getDestOne(){
        return this.DestOne;  
    }
    //getter for DestTwo
    public String getDestTwo(){
        return this.DestTwo;
    }

}
