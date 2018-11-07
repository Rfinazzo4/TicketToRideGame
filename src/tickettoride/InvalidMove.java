/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static tickettoride.MakeMove.temp;

/**
 *
 * @author Ryanfinazzo
 */
public class InvalidMove {
    public static void popUp(){
        Stage window = new Stage();
        
        window.setTitle("Invalid Move");
        Button button1 = new Button("Claim Route");
        button1.setTranslateY(-100);
        
        
        button1.setOnAction(e-> {
            window.close();
        });
        
        StackPane layout = new StackPane();
        Label text = new Label("Invalid Move, try again.");
        Scene scene = new Scene(layout,300,300);
        layout.getChildren().addAll(button1,text);
        window.setScene(scene);
        window.showAndWait();
        
    }
    
}
