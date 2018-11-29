/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

public class DestCard {
    private String d1;
    private String d2;
    private String routecolor;
    private int length;
    private boolean isUsed;
    
    
    DestCard(String d1, String d2, int length, String color){
        
        this.d1= d1;
        this.d2= d2;
        this.length=length;
        this.routecolor= color;
    }

    
    //Setter for isUsed 
    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    //Getter for D1

    public String getD1() {
        return d1;
    }
    // Getter for D1
    public String getD2() {
        return d2;
    }
    // Getter for routecolor
    public String getRoutecolor() {
        return routecolor;
    }
    // Getter for Length
    public int getLength() {
        return length;
    }
   

    public boolean isIsUsed() {
        return isUsed;
    }
   @Override
   public String toString(){
       return (this.d1 +" "+this.d2);
   }

}

