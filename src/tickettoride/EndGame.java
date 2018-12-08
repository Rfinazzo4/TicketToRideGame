/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ryanfinazzo& everyone else
 */
public class EndGame {
    static void endGame(int score1, int score2, Player winner){
        Stage window = new Stage();
        
        window.setTitle("Game Over!");
        Button button1 = new Button("Thanks For Playing!");
        button1.setTranslateY(-100);
      
        
        
        button1.setOnAction(e-> {
            window.close();
          
        });
        
        StackPane layout = new StackPane();
        Label scores = new Label("Player 1 Score: " + score1+"\nPlayer 2 Score: "+score2);
        Scene scene = new Scene(layout,500,500);
        
        Label winnerText = null;
       
        if (winner==null){
            winnerText = new Label("The Game ended in a Tie!");
        }
        else{
            winnerText = new Label("The Winner is: "+winner.GetName()+"! Congratulations!");
        }
        winnerText.setTranslateY(-200);
        layout.getChildren().addAll(button1, scores, winnerText);
        window.setScene(scene);
        window.showAndWait();
        
    }
}
