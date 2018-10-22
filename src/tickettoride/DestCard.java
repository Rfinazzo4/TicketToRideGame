/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

/**
 *
 * @author ayoubalani
 */
public class DestCard {
    private String d1;
    private String d2;
    private String routecolor;
    private int length;
    private String color;
    private int points;
    private boolean isUsed;
    
    
    DestCard(String d1, String d2, int length, int points, String color){
        
        this.d1= d1;
        this.d2= d2;
        this.length=length;
        this.points=points;
        this.color= color;
    }

    
    
    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
    

    

    public String getD1() {
        return d1;
    }

    public String getD2() {
        return d2;
    }

    public String getRoutecolor() {
        return routecolor;
    }

    public int getLength() {
        return length;
    }

    public int getPoints() {
        return points;
    }

    public boolean isIsUsed() {
        return isUsed;
    }
    
    
    
    
    
    
}
