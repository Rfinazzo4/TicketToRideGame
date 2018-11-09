/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;


import java.util.ArrayList;


public class Player {
    // Making individual attributes 
    private String name;  //Name of player
    private int score; //Players score
    private String color; //player color (train car color) 
    private int traincars; //amount of train CARS in posession
    private int TDIndex;    //Index of top card in Train Card Deck
    private int DDIndex;    //Index of top card in Destination Card Deck
    
    //ArrayList for the decks 
    
    private ArrayList<TrainCard> traincards;
    private ArrayList<DestCard> destcards;
    
//      private String[] traincards;
//      private int[] dotc;
//      private int[] destcards;
    
    
    //define and initilizae the attributes created
    Player(String name, String color){

        this.name = name;
        this.score = 0; //players score starts with 0
        this.color = color;
        this.traincars = 50; // Player starts with 45 train cars 
        this.TDIndex=0; 
    
        traincards = new ArrayList<>();
        destcards = new ArrayList<>();
    
    }
    
        //add cards to the deck
        public void AddToTrainDeck(TrainCard card){
            
            traincards.add(card);
            //Incrementindex of top card
            TDIndex++;
        }

        
        //add the card to the deck 
        public void AddToDestDeck(DestCard card){
            
            destcards.add(card);
            //Increment index of top card
            DDIndex++;
        }
        
        //decrement index of top card
        public void DecrementDestDeck(){
            DDIndex--;
        }
        public void IncrementDestDeck(){
            DDIndex++;
        }
        
        
        public void DecrementTrainCardDeck(){
            //decrement index of top card
            TDIndex--;
        }
        public void IncrementTrainCardDeck(){
            //decrement index of top card
            TDIndex++;
        }
        
        //Getter for Name
        public String GetName(){
            return this.name;
        }
        
        
        //Getter for Score
        public int GetScore(){
            return this.score;
        }
        
        
        //Getter for Color
        public String GetColor(){
            return this.color; 
        }
        
        //Getter for number of TrainCars
        public int GetTrainCars(){
            return this.traincars;
        }
        
        
        //Getter for TrainCards deck
        public ArrayList<TrainCard> GetTrainCards(){
            return this.traincards;
        }
        
        
        // Getter for DestinationCards Deck
        public ArrayList<DestCard> GetDestCards(){
            return this.destcards;
        }
        
    @Override
        public String toString(){
            return (name + color);
        }

    String formatTrainCards() {
        int blueCount = 0;
        int redCount = 0;
        int whiteCount = 0;
        int purpleCount = 0;
        int blackCount = 0;
        int locoCount = 0;
        for (TrainCard t :traincards){
            if (t.getColor()=="Blue"){
                blueCount++;
            }
            else if (t.getColor()=="Red"){
                redCount++;
            }
            else if (t.getColor()=="White"){
                whiteCount++;
            }
            else if (t.getColor()=="Purple"){
                purpleCount++;
            }
            else if (t.getColor()=="Black"){
                blackCount++;
            }
            else if (t.getColor()=="Locomotive"){
                locoCount++;
            }
        }
        
        return ("⟡ Blue("+blueCount+")\n⟡ Red("+redCount+")\n⟡ White("+whiteCount+
                ")\n⟡ Purple("+purpleCount+")\n⟡ Black("+blackCount+")\n⟡ Locomotive("+locoCount+")");
    }

    String formatDestCards() {
        String temp="";
        for(DestCard D:destcards){
            temp +="⟡ ";
            temp += D.getD1()+ " <- "+D.getLength()+" -> ";
            temp +=D.getD2() +"\n";    
        }
        return temp;
    }

    public void removeDestCard(DestCard d) {
        setScore(d);
        destcards.remove(d);
        DDIndex--;
    }
    
    public void removeTrainCard(TrainCard t) {
        
        traincards.remove(t);
        TDIndex--;
    }

    private void setScore(DestCard d) {
        score =+d.getLength();
    }

    public int getAmountTrainCardColor(String tcolor) {
        int count=0;
        for (TrainCard t: traincards){
            System.out.println("here0");
            if(t.getColor()==(tcolor)){
                System.out.println("here10");
                count++;
            }
        }
        System.out.println("count"+count);
        return count;
    }

    public int getAmountTrainCardColor() {
        int count=0;
        for (TrainCard t: traincards){
            count++;
        }
        return count;
    }

    boolean searchTrainCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean hasTrainCard(String tempStr) { 
        //checking if playerhas a locomotive card to choose from
        
        for(TrainCard t: traincards){
            if(t.getColor()==tempStr){
                return true;
            }
        }
        return false;
    }

    public TrainCard getTrainCard(String color) {
        for(TrainCard t: traincards){
            if(t.getColor().equals(color)){
                return t;
            }
        }
        return null;
    }

    void subTraincars(int length) {
        this.traincars=traincars-length;
    }
}
    
    

