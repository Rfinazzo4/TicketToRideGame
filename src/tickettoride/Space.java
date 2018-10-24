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
public class Space {
    private String mark;
    private boolean isRoute;
    private boolean isDest;
    Space(String mark, boolean route, boolean dest){
        this.mark=mark;
        this.isRoute=route;
        this.isDest=dest;
    }

    public void setIsRoute(boolean isRoute) {
        this.isRoute = isRoute;
    }

    public void setIsDest(boolean isDest) {
        this.isDest = isDest;
    }

    public String getMark() {
        return mark;
    }

    public boolean isIsRoute() {
        return isRoute;
    }

    public boolean isIsDest() {
        return isDest;
    }
    
   
    
}
