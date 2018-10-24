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
    private boolean isFaceDown;
    private boolean isUsed;
    
    TrainCard(String color){
        this.color=color;
        isFaceDown = true; //might need to change
        isUsed = false;
    }

    public void setIsFaceDown(boolean isFaceDown) {
        this.isFaceDown = isFaceDown;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public String getColor() {
        return color;
    }

    public boolean isIsFaceDown() {
        return isFaceDown;
    }

    public boolean isIsUsed() {
        return isUsed;
    }
   
}
