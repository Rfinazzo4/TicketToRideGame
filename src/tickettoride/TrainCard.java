/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

/**
 *
 * @author Ryanfinazzo
 */
public class TrainCard {
    private String color;
    private boolean isFaceUp;
    private boolean isUsed;
    
    TrainCard(String color){
        this.color=color;
        isFaceUp = false; 
        isUsed = false;
    }

    public void setIsFaceUp(boolean isFaceUp) {
        this.isFaceUp = isFaceUp;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public String getColor() {
        return this.color;
    }

    public boolean getIsFaceUp() {
        return isFaceUp;
    }

    public boolean getIsUsed() {
        return isUsed;
    }
   
    @Override
    public String toString(){
        
        return this.color; 
    }
}
