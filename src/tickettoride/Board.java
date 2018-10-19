/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;


public class Board {
    
    // initialize board array
    private String[][] board;
   
    // constructor for board:
    public Board() {
        
        // first route linking SF and NY
        board[0][0] = "San Francisco";
        board[0][1] = "==================================";
        board[0][2] = "New York";
        
        // second route linking LA and Colorado
        board[1][0] = "Los Angeles";
        board[1][1] = "===============";
        board[1][2] = "Colorado"; 
        
    }
}     