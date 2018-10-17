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
    
    //ArrayList for the decks 
    private String[] playerlist; //should i make this array or arraylist
    private ArrayList<String> traincards;
    private ArrayList<String> dotc;
    private ArrayList<String> destcards;
    
//      private String[] traincards;
//      private int[] dotc;
//      private int[] destcards;
    
    
    //define and initilizae the attributes created
    public void Player(String name,int score, String color,String[] playerlist){
        this.name = name;
        
        this.score = score;
        this.color = color;
        this.playerlist = playerlist;
        
        ArrayList<String> traincards = new ArrayList<String>();
        ArrayList<String> dotc = new ArrayList<String>();
        ArrayList<String> destcards = new ArrayList<String>();
    
    }
    
    
    //DrawTrain Cards() 
    
        public void drawtrainard(Player draw){
            
        }
       
        
    // DrawDestCards
        
        public void DrawDestCards(Player drawdest){
        }
        
        
    //Claim Route(trainCard,DestCard)
        public void ClaimRoute(String traincards, String destcards){
            
            
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
        
        
    }
    
    
    
    
    


