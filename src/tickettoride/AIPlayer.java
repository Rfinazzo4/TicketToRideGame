
package tickettoride;

import java.util.ArrayList;

/**
 *
 * @author Ryanfinazzo
 */
public class AIPlayer extends Player{
    
    public AIPlayer(String name, String color) {
        super(name, color);
    }
    public void CPUMakeMove(int userScore, ArrayList<TrainCard> faceUpCards){
        //AGENT IDEAS

        // 1. Goal agent based Highest priority (1) 
        // - If score is lower than oponents then claim a route
        // - Else check reflex agent below 
        
        boolean goalValue = GAgentScore(userScore);
        
        // 2. Reflex agent based on low amount of Train cards, priority (2)
        // - If Train cars are lower than a certain number, draw train card
        // - else do not draw, check reflec agent below
        
        boolean reflex1Value = RAgentTrainCards(this.GetTrainCards());
       
        // 3. Reflex agent based on low amount of Dest cards
        // - if Dest cards is lower than three, draw dest card, priority (3) 
        // - else check model agent below
        
        boolean reflex2Value = RAgentDestCards(this.GetDestCards());
        
        
        // 4. Model based agent(4)
        // If we get to this point here, we will base the move on what the Agent
        // decides is the best action.  
        // - check all priorities given by enviornment
        // - make decision based on these
        
        int modelValue = MAgent(this.GetDestCards(),this.GetTrainCards(),userScore, this.GetScore());
        
        switch(modelValue){
            case 0://this specifis that we should claim a route
            case 1://this specifis that we should claim a route
        }
    }
   
    
    private boolean GAgentScore(int userscore) {
        // if users score is greater than AI's score, respond 
        // by telling CPU to claim a route
        if (userscore>this.GetScore()){
            return true; 
        }
        else return false;
    }

    private boolean RAgentTrainCards(ArrayList<TrainCard> traincards) {
        // if train cards are below 5 agent responds
        // by telling CPU to draw train cards
        if (traincards.size()<5){
            return true; 
        }
        else return false;
    }
    
    private boolean RAgentDestCards(ArrayList<DestCard> destcards) {
        // If dest cards are below 3 agent responds
        // by telling CPU to draw dest cards
        if (destcards.size()<3){
            return true; 
        }
        else return false;
    }


    private int MAgent(ArrayList<DestCard> destCards, ArrayList<TrainCard> traincards, int userScore, int GetScore) {
        // percept 1 will return a priority value based on the amount of dest cards the user has
        int percept1 = MBpercept1(destCards);
        
        // percept 2 will return a boolean value based on how close the user is to winning 
        boolean percept2 = MBpercept2(userScore);
        //now calculate how close ai is to winning
        
        // Percept3 will return the distance left from claiming the closest route
        // How close are we to claiming a route (dest card lengths and train card color amounts
        int percept3 = MBpercept3(destCards,traincards);
        
        
        if (percept3==0){
            return 0; //this specifis that we should claim a route
        }
    
    }
    
    private int MBpercept1(ArrayList<DestCard> destcards) {
        //percept 1 will return a priority value based on the amount of dest cards the user has
        if (destcards.size()<4){
            return 3; //5 being high priority
        }
        else if(destcards.size()>=5 && destcards.size()<7){
            return 2; 
        }
        else if(destcards.size()>=7 && destcards.size()<10){
            return 1; 
        }
        else return 0; //low priority
    }
    
    private boolean MBpercept2(int userScore){
        //percept 2 will return a boolean based on how close the user is to winning 
        if (userScore >= 45){
            return true;
        }
        else return false;
        
    }
    
    private int MBpercept3(ArrayList<DestCard> destcards, ArrayList<TrainCard> traincards) {
        // Percept3 will return the distance left from claiming the closest route
        // How close are we to claiming a route (dest card lengths and train card color amounts)
        int color; //number of cards AI has of specific color
        
        //set leastlength to a high number to be ovverriden
        int leastLength=100; //holds the return value
        for(DestCard route : destcards){
            color = this.getAmountTrainCardColor(route.getRoutecolor());
            color+=this.getAmountTrainCardColor("Locomotive");
            
            if(color>=route.getLength()){
                return 0; //meaning we can claim a route
            }
            else if((route.getLength()-color)<leastLength){
                leastLength = route.getLength()-color;
            }
        }
        return leastLength;
    }

}
