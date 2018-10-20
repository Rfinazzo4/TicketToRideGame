/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;


public class Board {
    
    // initialize board array
    public String[][] board;
     
    // constructor for board:
    public Board() {
        
        // creating the border with the array
        board[0][0] = "--------------------------------------------------------";
        board[1][0] = "|";
        board[2][0] = "|";
        board[3][0] = "|";
        board[4][0] = "|";
        board[5][0] = "--------------------------------------------------------";
        board[1][4] = "|";
        board[2][4] = "|";
        board[3][4] = "|";
        board[4][4] = "|";
        
        // first route linking SF and NY
        board[2][1] = "San Francisco";
        board[2][2] = "==================================";
        board[2][3] = "New York";
        
        // second route linking LA and Colorado
        board[4][1] = "Los Angeles";
        board[4][2] = "===============";
        board[4][3] = "Colorado"; 
        
    }
    
   
}    