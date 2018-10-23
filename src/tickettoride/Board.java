/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;


public class Board {
    
    // initialize board array
    public String[][] board;
    private Display d;
     
    // constructor for board:
    public Board() {
        //initalized our Display variable
        d=new Display();

        board =new String [5][5];
        // creating the border with the array
        
        
        for (int i =0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==1 ||i==3){
                    board[i][j] = "==";
                }
                else{
                    board[i][j] = "~~";
                }
            }
        }
        
        board[1][0]="SF";
        board[1][4]="NY";
        
        board[3][0]="LA";
        board[3][4]="CO";
        
        
        
//        board[0][0] = "--------------------------------------------------------";
//        board[1][0] = "|";
//        board[2][0] = "|";
//        board[3][0] = "|";
//        board[4][0] = "|";
//        board[5][0] = "--------------------------------------------------------";
//        board[1][4] = "|";
//        board[2][4] = "|";
//        board[3][4] = "|";
//        board[4][4] = "|";
//        
//        // first route linking SF and NY
//        board[2][1] = "San Francisco";
//        board[2][2] = "==================================";
//        board[2][3] = "New York";
//        
//        // second route linking LA and Colorado
//        board[4][1] = "Los Angeles";
//        board[4][2] = "===============";
//        board[4][3] = "Colorado"; 
//        
    }
    
    public void DisplayB(){
        d.displayBoard(board);
    }
    
    
    public void UpdateBoard(String DestCard){//This will need to be changed to a destination card

        
        //In here is where we would update the Baord, this will be dependent on
        //the players move which will be sent form game
        //Best we can do for now untill we start designing the gameplay more
        
        //Here we just showed we are editing the Board with some hard coded changes


        String s1 = "LA";
        String s2 = "CO";
        
        System.out.println("");
        System.out.println("");
        System.out.println("Hard coded Move has been made ");
        System.out.println("New Board is displayed below '|' means route is occupied");
        System.out.println("");
        
        for (int i =0;i<5;i++){
            if (board[i][0]==s1){
                for (int j=1;j<5;j++){
                    if(board[i][j]=="=="){
                        board[i][j]="||";
                    }
                }
            }
        }
        DisplayB();
    }
}    

