package tickettoride;

import java.util.ArrayList;

/**
 *
 * @author Ryanfinazzo
 */
public class AIPlayer extends Player {

    public AIPlayer(String name, String color) {
        super(name, color);
    }

    public int CPUMakeMove(int userScore, ArrayList<TrainCard> faceUpCards) {
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


        if (goalValue) {
            // If this returns true.  Can we claim a route?
            // call possible claim function
            // If so return 0 - which will specify the system in Display to call
            // game.GetAI().claimroute 
            // If not, move on to below
            if (claimPossible()) {
                return 1;
                //0 is what specifies to the game ai wants to claim route
            }
        }

        if (reflex1Value) {
            // if true,
            // return - 1 which will specify to quickly draw two train cards which
            // will call game.getAI().draw two train cards
            // else continue
            return 2;
        }

        if (reflex2Value) {
            // if true,
            // return - 2 which will specify to quickly draw a dest card which
            // will call game.getAI().drawdestcard
            //else continue
            return 3;
        }
        
        // 4. Model based agent(4)
        // If we get to this point here, we will base the move on what the model Agent
        // decides is the best action.  
        // this agent will be making most of the moves, it is a more educated decision making process
        // - check all priorities given by enviornment
        // - make decision based on these
        int modelValue = MAgent(this.GetDestCards(), this.GetTrainCards(), faceUpCards, userScore, this.GetScore());
        return modelValue;

    }

    private boolean GAgentScore(int userscore) {
        // if users score is greater than AI's score, respond 
        // by telling CPU to claim a route
        if (userscore > this.GetScore()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean RAgentTrainCards(ArrayList<TrainCard> traincards) {
        // if train cards are below 5 agent responds
        // by telling CPU to draw train cards
        if (traincards.size() < 5) {
            return true;
        } else {
            return false;
        }
    }

    private boolean RAgentDestCards(ArrayList<DestCard> destcards) {
        // If dest cards are below 3 agent responds
        // by telling CPU to draw dest cards
        if (destcards.size() < 3) {
            return true;
        } else {
            return false;
        }
    }

    private int MAgent(ArrayList<DestCard> destCards, ArrayList<TrainCard> traincards,
            ArrayList<TrainCard> faceUpCards, int userScore, int GetScore) {

        // Percept 1 will return a priority value based on the amount of dest cards the user has
        int percept1 = MBpercept1(destCards);

        // Percept 2 will return a boolean value based on how close the user is to winning 
        boolean percept2 = MBpercept2(userScore);
        //now calculate how close ai is to winning
        //if claim is possible this should be top priority

        // Percept3 will calculate which color train cards to draw and return 
        //a number which specifie that
        int calcPercept = calcWhichTrainCardToDraw(destCards, traincards, faceUpCards);

        if (percept2) { //if user is about to winning, try and claim route
            if (claimPossible()) {
                return 1;
            }
        }

        if (calcPercept == 5) { //if two locomotive cards are faceup, pick them up
            return calcPercept;
        }
        if (claimPossible()) { //if we can calim a route, claim one. 
            return 1;
        } else if (calcPercept >= 6 && calcPercept <= 10) { //if one loco and one color cards are face up and needed, pick them up
            return calcPercept;
        } else if (calcPercept >= 11 && calcPercept <= 15) { //if two color cards are face up and needed, pick them up
            return calcPercept;
        } 
        else if (calcPercept ==16) { //if only one color card is face up and needed, pick it up
            return calcPercept;
        }else if (percept1 == 1) { //if AI has < 4 Dest cards, draw one
            return 3;
        } else if (calcPercept >= 17 && calcPercept <= 21) { //if only one color card is face up and needed, pick it up
            return calcPercept;
        } else if (calcPercept == 0) {
            return 2;
        } else {
            return 2;
        }
    }

    private int MBpercept1(ArrayList<DestCard> destcards) {
        //percept 1 will return a priority value based on the amount of dest cards the user has
        if (destcards.size() < 5) {
            return 1;
        } else {
            return 0; //low priority
        }
    }

    private boolean MBpercept2(int userScore) {
        //percept 2 will return a boolean based on how close the user is to winning 
        if (userScore >= 43) {
            return true;
        } else {
            return false;
        }

    }

    private int calcWhichTrainCardToDraw(ArrayList<DestCard> destcards,
            ArrayList<TrainCard> traincards, ArrayList<TrainCard> faceUpCards) {
        //This method will calculate which color train cards to draw and return 
        //a number which specifie that
        
        System.out.println("Size of FaceUp Cards: "+faceUpCards.size());

        //----------------------------------    
        //first check how many faceup cards of each color are available
        int locoCounter = 0;
        int redCounter = 0;
        int blueCounter = 0;
        int whiteCounter = 0;
        int blackCounter = 0;
        int purpleCounter = 0;

        for (TrainCard t : faceUpCards) {
            if (t.getColor().equals("Locomotive")) {
                locoCounter++;
            } else if (t.getColor().equals("Red")) {
                redCounter++;
            } else if (t.getColor().equals("Blue")) {
                blueCounter++;
            } else if (t.getColor().equals("White")) {
                whiteCounter++;
            } else if (t.getColor().equals("Black")) {
                blackCounter++;
            } else if (t.getColor().equals("Purple")) {
                purpleCounter++;
            }
        }

        if (locoCounter > 1) {
            return 5; //this will tell AI to pick up 2 locomotive 
        }

        //----------------------------------
        //Second Calulate which route is the closest to being claimed and get the
        // # of cards needed
        //----------------------------------
        int temp; //number of cards AI has of specific color

        //set leastlength to a high number to be ovverriden
        DestCard bestRoute = null; //holds return value;
        int leastLength = 100; //holds length of shortest route
        for (DestCard route : destcards) {
            if (!route.getRoutecolor().equals("Grey")) {
                temp = this.getAmountTrainCardColor(route.getRoutecolor());
                temp += this.getAmountTrainCardColor("Locomotive");

                if (temp >= route.getLength()) {
                    leastLength = 0;
                    bestRoute = route; //meaning we can claim a route
                } else if ((route.getLength() - temp) < leastLength) {
                    leastLength = route.getLength() - temp;
                    bestRoute = route;
                }
            } else if (this.GetTrainCards().size() > route.getLength()) {
                leastLength = 0;
                bestRoute = route;
            }

        }

        //At this point, we have the route and the # of train cards needed
        //----------------------------------
        //calculate what the best option is for red
        if (bestRoute.getRoutecolor().equals("Red")) {
            if (redCounter > 1) {
                return 11;
            } else if (redCounter == 1 && locoCounter == 1) {
                return 6;
            } else if (redCounter == 1) {
                return 17;
            }
        } //calculate what the best option is for blue
        else if (bestRoute.getRoutecolor().equals("Blue")) {
            if (blueCounter > 1) {
                return 12;
            } else if (blueCounter == 1 && locoCounter == 1) {
                return 7;
            } else if (blueCounter == 1) {
                return 18;
            }
        } //calculate what the best option is for white
        else if (bestRoute.getRoutecolor().equals("White")) {
            if (whiteCounter > 1) {
                return 13;
            } else if (whiteCounter == 1 && locoCounter == 1) {
                return 8;
            } else if (whiteCounter == 1) {
                return 19;
            }
        } //calculate what the best option is for black
        else if (bestRoute.getRoutecolor().equals("Black")) {
            if (blackCounter > 1) {
                return 14;
            } else if (blackCounter == 1 && locoCounter == 1) {
                return 9;
            } else if (blackCounter == 1) {
                return 20;
            }
        } //calculate what the best option is for purple
        else if (bestRoute.getRoutecolor().equals("Purple")) {
            if (purpleCounter > 1) {
                return 15;
            } else if (purpleCounter == 1 && locoCounter == 1) {
                return 10;
            } else if (purpleCounter == 1) {
                return 21;
            }
        } //if there is one Locomotive face up
        else if (locoCounter == 1) {
            return 16;
        }

        return 0;

    }

    private boolean claimPossible() {
        int temp; //temp to keep track of total amount of cards
        for (DestCard route : this.GetDestCards()) {
            if (!route.getRoutecolor().equals("Grey")) {
                temp = this.getAmountTrainCardColor(route.getRoutecolor());
                temp += this.getAmountTrainCardColor("Locomotive");

                if (temp >= route.getLength()) {
                    return true; //meaning we can claim a route
                }
            } else if (this.GetTrainCards().size() > route.getLength()) {
                return true;
            }

        }
        return false;
    }

    DestCard findBestRoute() {
        int temp; //temp to keep track of total amount of cards
        DestCard longRoute = new DestCard("", "", 0, ""); //longest route than can be claimed by the AI

        for (DestCard route : this.GetDestCards()) {
            if (!route.getRoutecolor().equals("Grey")) {
                temp = this.getAmountTrainCardColor(route.getRoutecolor());
                temp += this.getAmountTrainCardColor("Locomotive");

                if (temp >= route.getLength()) {
                    //meaning we can claim this route
                    if (longRoute.getLength() < route.getLength()) {
                        longRoute = route; //overwrite if the current route is greater than long route
                    }
                }
            } else if (this.GetTrainCards().size() > route.getLength()) {
                if (longRoute.getLength() < route.getLength()) {
                    longRoute = route;//overwrite if current grey route is greater than long route
                }
            }
        }
        return longRoute;
    }

}
