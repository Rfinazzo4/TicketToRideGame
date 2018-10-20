/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;


import java.util.ArrayList;


public class Player {
    // Making individual attributes 
    private String name; 
    private int score;
    private String color;
    private int traincars;
    
    //ArrayList for the decks 
    
    private ArrayList<String> traincards;
    private ArrayList<String> destcards;
    
//      private String[] traincards;
//      private int[] dotc;
//      private int[] destcards;
    
    
    //define and initilizae the attributes created
     Player(String name){
         
 
        this.name = name;
        this.score = 0; //players score starts with 0
        this.color = color;
        this.traincars = 45; // Player starts with 45 train cars 
    
        ArrayList<String> traincards = new ArrayList<String>();
        ArrayList<String> destcards = new ArrayList<String>();
    
    }
    
    
    

        //add cards to the deck
        public void AddToTrainDeck(String Traincard){
            
            traincards.add(Traincard);
            //
        
        }
       
        
    

        //add the card to the deck 
        public void AddToDestDeck(String DestDeck){
            
            destcards.add(DestDeck);
        }
        
        
    //Claim Route(trainCard,DestCard)
        public void ClaimRoute(String traincards, String destcards){
            
            System.out.println("Route has been claimed"); 
            
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
        public ArrayList<String> GetTrainCards(){
            return this.traincards;
        }
        
        
        // Getter for DestinationCards Deck
        public ArrayList<String> GetDestCards(){
            return this.destcards;
        }
        
        
        //
        
    }
    
    

