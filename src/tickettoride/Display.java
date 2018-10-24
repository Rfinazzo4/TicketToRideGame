/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;
import java.util.Scanner;




public class Display {
    Scanner reader;
    int count; //Player index 
   // String input; //

    Display(){
        count=0; //set count to zero
    }
        
    public void displayStart(){

        System.out.println("Inside the mehtod that wil describe the game");

        System.out.println("-----------------------");
        //Add details below
        System.out.println("We will be describing the game here");
        System.out.println("");

    }
   
    public void displayBoard(Space[][] board) {
       for (int i=0;i<5;i++){

           for(int j=0;j<5;j++){
               System.out.print(board[i][j].getMark());
           }
           System.out.println("");

       }
    }
    
    public void endGame(Player winner){
        System.out.println("The game is over! Thank you all for playing. ");
        System.out.println("-------------------------------");
        //Winenr will be sent, for the purposes of the Skeleton we simply 
        //sent an arbitrary Player
        System.out.println("The Winner is: "+ winner.GetName());
        reader.close();
    
    }

    public Player readPlayer() {
        reader = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.print("Player "+ ++count +" Please enter you name : ");
        String name = reader.nextLine();
        Player P = new Player(name);
        return P;
    }

    boolean morePlayers() {
        reader = new Scanner(System.in);
        System.out.println("Another PLayer? Yes or other key for no");
        String input = reader.nextLine();
        if (input.equals("Yes") || input.equals("yes")){
            return true;
        }
        else{
            return false;
        }
        
    }

    DestCard displayPlayerDestcards(Player p) {
        reader = new Scanner(System.in);
        System.out.println("Player " + p.GetName());
        System.out.println("Here are the Desination cards you have been delt");
        System.out.println("---------------------------------------------");
        for (int i =0;i<3;i++){
            System.out.print((i+1)+". ");
            System.out.println(p.GetDestCards().get(i).toString());
        }
       
        System.out.println("Do you wish to keep all 3, you may return one. Yes or any other key for no");
        String input = reader.nextLine();
        if (input.equals("Yes") || input.equals("yes")){
            return null;
        }
        //////////////       
        System.out.println("Which card would you like to return? (1, 2, 3)");
        int temp = reader.nextInt();
        DestCard tempdc;
        switch(temp){
            case 1:
                System.out.println("Done.");
                tempdc = p.GetDestCards().get(0);
                p.GetDestCards().remove(0);
                for (int i =0;i<2;i++){
                    System.out.print((i+1)+". ");
                    System.out.println(p.GetDestCards().get(i).toString());
                }
                return tempdc;
            case 2:
                System.out.println("Done.");
                tempdc = p.GetDestCards().get(1);
                p.GetDestCards().remove(1);
                for (int i =0;i<2;i++){
                    System.out.print((i+1)+". ");
                    System.out.println(p.GetDestCards().get(i).toString());
                }
                return tempdc;
            case 3:
                System.out.println("Done.");
                tempdc = p.GetDestCards().get(2);
                p.GetDestCards().remove(2);
                for (int i =0;i<2;i++){
                    System.out.print((i+1)+". ");
                    System.out.println(p.GetDestCards().get(i).toString());
                }
                return tempdc;
            default:
                return null;
        }  
    }
    
}
