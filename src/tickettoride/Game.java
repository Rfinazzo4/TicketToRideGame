/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Game {
    
        //Lists
    private ArrayList<TrainCard> TrainDeck;
    private ArrayList<DestCard> DestDeck;
    private Player user;
    private AIPlayer AI;

    private String DestOne;
    private String DestTwo;
    
        //Counts and indexs
    private int playerindex;        //Index of the current Player  (Is this needed??) 
    private int DDtopIndex;           //Destination Deck, index of top card
    private int TDtopIndex;           //TrainCard Deck, index of top card
        //Other misc variable
    private Random rand;
    // Labels and Button for refresh method
    Label gameCardData = new Label();
    Label FaceUpCards = new Label();
    Label gameBlackTrainCardcounter = new Label();
    Label gameBlueTrainCardcounter = new Label();
    Label gamePurpleTrainCardcounter = new Label();
    Label gameRedTrainCardcounter = new Label();
    Label gameWhiteTrainCardcounter = new Label();
    Label gameLocoTrainCardcounter = new Label();
    Label gamePlayerNameDisplay = new Label();
    Label gamePlayerScore = new Label();
    Label gamePlayerTrains = new Label();
    
    Label AImoveDisplay = new Label();
    Label AIScore = new Label();
    Label AITrainCardNum = new Label();
    Label AIDestCardNum = new Label();
    
    Button gameReady = new Button();
    

    
    // Game Constructor
    /////////////////
    // Initalizes variables/lists, sets up the game 
    // Controller
 
    public Game(){
        
        //Initalize Variables
        playerindex=0;      //Set index to zero
        //Create random object for creating random integers
        rand= new Random();
       
        //Create the Decks and Player list
        TrainDeck = new ArrayList<>();
        DestDeck = new ArrayList<>();
        
        user = new Player("Player 1", "Red");
        
        AI =new AIPlayer("AI PLayer", "Blue");
       
        //Setup
        ///////////////
        
        //Initialize the Players
//        Player P1=new Player("Player 1", "Red");
//        Playerlist.add(P1);
//        AIPlayer P2=new AIPlayer("AI PLayer", "Blue");
//        Playerlist.add(P2);
        

        //Create Dest cards 
        DestCard tempdc = new DestCard("VAN","WIN",9,"Grey"); //1 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("SEA", "LA", 9, "White"); //2 Card 
        DestDeck.add(tempdc);
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
        tempdc= new DestCard("STM", "DAL", 9, "Blue"); //13 Card
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
        tempdc= new DestCard("NWO", "HOU", 2, "Blue"); //24 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("HOU", "ELP", 6, "Red"); //25 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("NAS", "CHA", 3, "Black"); //26 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("LA", "STF", 6, "Black"); //27 Card
        DestDeck.add(tempdc);
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
        tempdc= new DestCard("OKC", "STF", 4, "Red"); //38 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("PHE", "ELP", 3, "Purple"); //39 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("BIS", "WIN", 5, "White"); //40 Card
        DestDeck.add(tempdc);
        tempdc= new DestCard("HEL", "BIS", 8, "Grey"); //41 Card
        DestDeck.add(tempdc);
        
        //Finished Creating Dest Deck
        
        //Set Destination deck top index to 29
        DDtopIndex=40;
        //Shuffle Destination Deck
        Collections.shuffle(DestDeck);
        
        //Deal 5 Destination Cards to each Player
        for (int i =0; i<5;i++){
            int randint;
            //Deal card to user
            randint=rand.nextInt(DDtopIndex--);
            user.AddToDestDeck(DestDeck.get(randint));
            DestDeck.remove(randint);
            
            //Deal card to AI
            randint=rand.nextInt(DDtopIndex--);
            AI.AddToDestDeck(DestDeck.get(randint));
            DestDeck.remove(randint);

//            for(Player p :Playerlist){
//                randint=rand.nextInt(DDtopIndex--);
//        
//                p.AddToDestDeck(DestDeck.get(randint));
//                DestDeck.remove(randint);
//            }
        }
        
        //Create Train cards 
        for (int i=0; i<6;i++){
            TrainCard traintemp;
            switch(i){
                case 0: //create 25 Red
                    for (int j=0;j<25;j++){
                        traintemp = new TrainCard("Red");
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 1: //create 25 Blue
                    
                    for (int j=0;j<25;j++){
                        traintemp = new TrainCard("Blue");
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 2: //create 25 White
                    
                    for (int j=0;j<25;j++){
                        traintemp = new TrainCard("White");
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 3: //create 25 Black
                    
                    for (int j=0;j<25;j++){
                        traintemp = new TrainCard("Black");
                        TrainDeck.add(traintemp);
                    }
                    break;
                case 4: //create 25 Purple
                    
                    for (int j=0;j<25;j++){
                        traintemp = new TrainCard("Purple");
                        TrainDeck.add(traintemp);
                    }   
                    break;
                case 5: //create 25 Locomotive
                    
                    for (int j=0;j<25;j++){
                        traintemp = new TrainCard("Locomotive");
                        TrainDeck.add(traintemp);
                    }   
                    break;
            }
                    
        }
        
        //Set TrainCard deck top index to 149
        TDtopIndex=149;
        //Shuffle Destination Deck
        Collections.shuffle(TrainDeck);
        
        //at this point everything is face down
        
        
        //Deal 10 Train Cards to each Player
        for (int i =0; i<10;i++){
            //Deal card to user
            user.AddToTrainDeck(TrainDeck.get(TDtopIndex));
            TrainDeck.remove(TDtopIndex--);
            
            //Deal card to AI
            AI.AddToTrainDeck(TrainDeck.get(TDtopIndex));
            TrainDeck.remove(TDtopIndex--);
//            for(Player p :Playerlist){
//                p.AddToTrainDeck(TrainDeck.get(TDtopIndex));
//                TrainDeck.remove(TDtopIndex--); 
//         
//            }
        }
        
        setFaceUpCards();
        
        //GAME SETUP IS DONE
        //START PLAYING GAME
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
    
      public Player getUser() {
        return user;
    }

    public AIPlayer getAI() {
        return AI;
    }
    
    
    public ArrayList<TrainCard> getTrainDeck() {
        return TrainDeck;
    }

    public ArrayList<DestCard> getDestDeck() {
        return DestDeck;
    }


    
    //Setting the potential Destination to button clicked
    public void setDestOne(String dest){
        this.DestOne=dest;
        
    }
    
    //Setting the potential Destination to button clicked
    public void setDestTwo(String dest){
        this.DestTwo=dest;
       
    }
    
//    public  ArrayList<Player> getPlayers(){
//        return Playerlist;
//    }

    void drawDestCard(Player P) {
        int randint;
        randint=rand.nextInt(DDtopIndex--);
        P.AddToDestDeck(DestDeck.get(randint));
        DestDeck.remove(randint);
    }

    void drawTrainCard(Player P, int amount) {
        for (int i=0;i<amount;i++){
            P.AddToTrainDeck(TrainDeck.get(TDtopIndex-5));
            TrainDeck.remove(TDtopIndex-5);
            TDtopIndex--;
        }
        
        
    }

    	//Getter for DestOne 
    public String getDestOne(){
        return this.DestOne;  
    }
    //getter for DestTwo
    public String getDestTwo(){
        return this.DestTwo;
    }
    
    public ArrayList<TrainCard> getFaceUpCards(){
        ArrayList<TrainCard> temp=new ArrayList<TrainCard>();
        for(TrainCard t : TrainDeck){
            if (t.getIsFaceUp()){
                temp.add(t);
            }
        }
        return temp;
    }

    String formatFaceUpTrainCards() {
        String text ="";
        for (int i = 0;i<5;i++){
            String temp =TrainDeck.get(TDtopIndex-i).toString();
            text += temp +" \n";
        }
        return text;
    }

    private void setFaceUpCards() {
        //Set top five Train Cards in deck to 'FaceUp' 
        for(int i = 0;i<5;i++){
            TrainDeck.get(TDtopIndex-i).setIsFaceUp(true);
        }
     
    }

    boolean drawOneFaceUpTrainCard(Player P, String color) {
        for(int j = 0; j<5;j++){
            if(TrainDeck.get(TDtopIndex-j).getColor().equals(color)){
                P.AddToTrainDeck(TrainDeck.get(TDtopIndex-j));
                TrainDeck.remove(TDtopIndex-j);
                TDtopIndex--;
                setFaceUpCards();
                return true;
            }
        }
        return false;    
    }

    boolean drawTwoFaceUpTrainCard(Player P, String color1, String color2) {
        Integer color1Index= null; //set integer object to null
        Integer color2Index = null; //set integer object to null
      
        
        //delete after
        for(TrainCard t: TrainDeck){
            if(t.getIsFaceUp()){
              
            }
        }
        
        for(int j=0; j<5; j++){ //loop through the face up cards
            
            //if the first color is within the face up cards
            
            if(TrainDeck.get(TDtopIndex-j).getColor().equals(color1)){
                color1Index=j; //save index                
                color1="bad value"; //set to bad value in case duplicate colors in face up cards
            }
            else if(TrainDeck.get(TDtopIndex-j).getColor().equals(color2)){
                color2Index = j; //save index
                color2="bad value"; //set to bad value in case duplicate colors in face up cards
            }
        }
        //If either of the colors was not found, return false
        if(color1Index ==null||color2Index==null){
                return false;
        }
        else{
            //At this point it is a valid move
            
            //Add two cards to players deck
            P.AddToTrainDeck(TrainDeck.get(TDtopIndex-color1Index)); 
            P.AddToTrainDeck(TrainDeck.get(TDtopIndex-color2Index));
            
            //remove them from game deck
            TrainCard t = TrainDeck.get(TDtopIndex-color1Index);
            TrainCard t1= TrainDeck.get(TDtopIndex-color2Index);
            TrainDeck.remove(t);
            TrainDeck.remove(t1);
            
            //decrement the top index of the train card deck
            TDtopIndex--;
            
            TDtopIndex--;
            
            //reset the face up train cards
            setFaceUpCards();
            return true;
        }
    }

    public Player calcWinner() {
        if(user.GetScore()>AI.GetScore()){
            return user;
        }
        else if(user.GetScore()==AI.GetScore()){
            return null;
        }
        else{
            return AI;
        }
    }

    
    // setter for CardData (refresh method)
    void setCardData(Label cardData) {
       this.gameCardData = cardData;
    }
    
    //set the text, this is here so we are not creating unecessary new labels
    void setCardDatatext(String text) {
        this.gameCardData.setText(text);
    }
    
    // getter for cardData (refresh method)
    public Label getCardData() {  
        return gameCardData; 
    }
    
    // setter for faceUp (refresh method)
    void setFaceUp(Label faceUp) {
        this.FaceUpCards = faceUp;
    }
    //set the text, this is here so we are not creating unecessary new labels
    void setFaceUptext(String text) {
        this.FaceUpCards.setText(text);
    }
    
    // getter for faceUpText (refresh method)
    public Label getFaceUpCardLabel() { 
        return FaceUpCards;
    }
    
    
    // setter for blackTrainCardCounter (refresh method)
    void setBlackTrainCardcounter(Label blackTrainCardcounter) {
        this.gameBlackTrainCardcounter = blackTrainCardcounter;
    }
    
    // getter for blackTrainCardCounter (refresh method)
    public Label getBlackTrainCardcounter() {
        return gameBlackTrainCardcounter;
    }
    
    
    // setter for blueTrainCardCounter (refresh method)
    void setBlueTrainCardcounter(Label blueTrainCardcounter) {
        this.gameBlueTrainCardcounter = blueTrainCardcounter;
    }
    
    // getter for blueTrainCardCounter (refresh method)
    public Label getBlueTrainCardcounter() {
        return gameBlueTrainCardcounter;
    }
    
    
    // setter for purpleTrainCardCounter (refresh method)
    void setPurpleTrainCardcounter(Label purpleTrainCardcounter) {
        this.gamePurpleTrainCardcounter = purpleTrainCardcounter; 
    }
    
    // getter for purpleTrainCardCounter (refresh method)
    public Label getPurpleTrainCardcounter() {
        return gamePurpleTrainCardcounter;
    }
    
    
    // setter for redTrainCardCounter (refresh method)
    void setRedTrainCardcounter(Label redTrainCardcounter) {
        this.gameRedTrainCardcounter = redTrainCardcounter;    
    }
    
    // getter for redTrainCardCounter (refresh method)
    public Label getRedTrainCardcounter() {
        return gameRedTrainCardcounter;
    }
    
    
    // setter for whiteTrainCardCounter (refresh method)
    void setWhiteTrainCardcounter(Label whiteTrainCardcounter) {
        this.gameWhiteTrainCardcounter = whiteTrainCardcounter;
    }
    
    // getter for whiteTrainCardCounter (refresh method)
    public Label getWhiteTrainCardcounter() {
        return gameWhiteTrainCardcounter;
    }
    
    // getter for locoTrainCardCounter (refresh method)
    void setLocoTrainCardcounter(Label locoTrainCardcounter) {
        this.gameLocoTrainCardcounter = locoTrainCardcounter;
    }
    
    // getter for locoTrainCardCounter (refresh method)
    public Label getLocoTrainCardcounter() {
        return gameLocoTrainCardcounter;
    }
    
    
    // setter for playerNameDisplay (refresh method)
    void setPlayerNameDisplay(Label playerNameDisplay) {
       this.gamePlayerNameDisplay = playerNameDisplay;
    }
    
    // getter for playerNameDisplay (refresh method)
    public Label getPlayerNameDisplay() {
        return gamePlayerNameDisplay;
    }
    
    
    // setter for playerScore (refresh method)
    void setPlayerScore(Label playerScore) {
        this.gamePlayerScore = playerScore;
    }
    
    // // getter for playerScore (refresh method)
    public Label getPlayerScore() {
        return gamePlayerScore;
    }
    
    
    // setter for playerTrains (refresh method)
    void setPlayerTrains(Label playerTrains) {
        this.gamePlayerTrains = playerTrains;
    }
    
    // getter for playerTrains (refresh method)
    public Label getPlayerTrains() {
        return gamePlayerTrains;
    }
    
    
    // setter for ready Button (refresh method)
    void setReady(Button ready) {
        this.gameReady = ready;
    }
    
    // getter for ready Button (refresh method)
    public Button getReady() {
        return gameReady;
    }

    void setAImoveDisplay(Label AImoveDisplay) {
        this.AImoveDisplay=AImoveDisplay;
    }
    
    void setAImoveDisplayText(String text) {
        this.AImoveDisplay.setText(text);
    }
    public Label getAImoveDisplay() {
        return this.AImoveDisplay;
    }

    void setAIScore(Label AIScore) {
        this.AIScore=AIScore;
    }
    
    public Label getAIScore() {
        return this.AIScore;
    }

    void setAITrainCardNum(Label AITrainCardNum) {
        this.AITrainCardNum=AITrainCardNum;
    }
    public Label getAITrainCardNum() {
        return this.AITrainCardNum;
    }

    void setAIDestCardNum(Label AIDestCardNum) {
        this.AIDestCardNum=AIDestCardNum;
    }
    
    public Label getAIDestCardNum() {
        return this.AIDestCardNum;
    }

    void setAIScoretext(int Score) {
        String str1 = Integer.toString(Score);
        this.AIScore.setText(str1);
    }

    void setAITrainCardNumtext(int size) {
        String str1 = Integer.toString(size);
        this.AITrainCardNum.setText(str1);
    }

    void setAIDestCardNumtext(int size) {
        String str1 = Integer.toString(size);
        this.AIDestCardNum.setText(str1);    
    }

    boolean isGameOver() {
        if(user.GetScore()>=40 || AI.GetScore()>=40){
            return true;
        }
        else{
            return false;
        }
    }

   

    
    
    
    
    
    
}
