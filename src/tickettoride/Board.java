/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;


public class Board {
    
    // initialize board array
    public Space[][] board;
    private Display d;
     
    // constructor for board:
    public Board() {
        //initalized our Display variable
        d=new Display();

        board =new Space[20][20];
        
        // creating the border with the array
        
        Space temp;
        for (int i =0;i<19;i++){
            for(int j=0;j<19;j++){
                temp = new Space("==", true,true);
                board[i][j] =temp;   
            }
        }

    }
    
    public void DisplayB(){
        d.displayBoard(board);
    }
    
    

    public void UpdateBoard(DestCard move){//This will need to be changed to a destination card

        
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
        

        System.out.println("");
        System.out.println("");
        System.out.println("Hard coded Move has been made ");
        System.out.println("New Board is displayed below '|' means route is occupied");
        System.out.println("");
        
// =======
//         for (int i =0;i<5;i++){
//             if (board[i][0]==s1){
//                 for (int j=1;j<5;j++){
//                     if(board[i][j]=="=="){
//                         board[i][j]="||";
//                     }
//                 }
//             }
//         }
// >>>>>>> master
        DisplayB();
    }
}    

