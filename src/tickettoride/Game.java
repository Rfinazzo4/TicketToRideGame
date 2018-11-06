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
        this.DestOne=dest;
        System.out.println("Dest2: "+dest);
    }
    
    public boolean makeMove(Player P){ //definition will need to be changed
        int move=d.displayMoveOptions();
      
        
        // if move equals 1 draw train Card
        if (move == 1){
            //Deal 2 Train Cards to Player P
            for (int i =0; i<2;i++){
                P.AddToTrainDeck(TrainDeck.get(TDtopIndex));
                TrainDeck.remove(TDtopIndex--);
            }
            return true;
        }
        
        //if move equals 2 draw Dest Card
        else if(move==2){
            //Deal 3 Destination Cards to each Player
            for (int i =0; i<3;i++){
                int randint;
                randint=rand.nextInt(DDtopIndex--);
                P.AddToDestDeck(DestDeck.get(randint));
                DestDeck.remove(randint);
                }
        
            //Check if user returns a card
            DestCard temp= d.displayDestcardReturn(P);
            if(temp!=null){ //If they do add card back into deck
                DestDeck.add(temp);
                DDtopIndex++;
                P.DecrementDestDeck(); //decrement the player Destdeck index
            }
            //Display Current Deck
            
            //HOW DOES THIS PLAY INTO THE SCENE???
            return true;
        }
        
        //if move equals 3 Claim Route
        else {
            //check if player can Claim route
            
        //d.displayPlayerDestcards(P);
            //DestCard D = d.displayClaimRoute();
            
            //At this point we will check 3 things
            //1. if the Destcard they chose, matches up with a destination
            //2. Do they have the proper trainCards for the move
            //3. Do they have enough train cars to place
            
        }
        //check if valid move
        //return false if not
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
