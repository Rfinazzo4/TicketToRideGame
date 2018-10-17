/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;


public class Board {
    
    // initialize board array
    private char[][] board;
   
    // constructor for board:
    public Board() {
        // initialize Array for the board
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = ' ';
            }
        }
        
        
        // function to draw board
        
        
    }
    
    // function to draw board
     public static void displayBoard() {
            System.out.println("hello");
        }
     
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Display board
        Board b = new Board();
    } 
    
}
