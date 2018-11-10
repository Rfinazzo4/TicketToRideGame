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
    static void Route(){
        Stage window = new Stage();
        
        window.setTitle("Invalid Move");
        Button button1 = new Button("Reset");
        button1.setTranslateY(-100);
        
        
        button1.setOnAction(e-> {
            window.close();
        });
        
        StackPane layout = new StackPane();
        Label text = new Label("Not a Correct Route. Please Try Again.");
        Scene scene = new Scene(layout,500,500);
        layout.getChildren().addAll(button1,text);
        window.setScene(scene);
        window.showAndWait();
        
    }

    static void TrainCars() {
        Stage window = new Stage();
        
        window.setTitle("Invalid Move");
        Button button1 = new Button("Reset");
        button1.setTranslateY(-100);
        
        button1.setOnAction(e-> {
            window.close();
        });
        
        StackPane layout = new StackPane();
        Label text = new Label("Not Enough Train Cars. Please Try Again.");
        Scene scene = new Scene(layout,500,500);
        layout.getChildren().addAll(button1,text);
        window.setScene(scene);
        window.showAndWait();
    }    

    static void DestCard() {
        Stage window = new Stage();
        
        window.setTitle("Invalid Move");
        Button button1 = new Button("Reset");
        button1.setTranslateY(-100);
        
        
        button1.setOnAction(e-> {
            window.close();
        });
        
        StackPane layout = new StackPane();
        Label text = new Label("You Do Not Have The Proper Destination Card. Please Try Again.");
        Scene scene = new Scene(layout,500,500);
        layout.getChildren().addAll(button1,text);
        window.setScene(scene);
        window.showAndWait(); 
    }

    static void TrainCards() {
        Stage window = new Stage();
        
        window.setTitle("Invalid Move");
        Button button1 = new Button("Reset");
        button1.setTranslateY(-100);
        
        button1.setOnAction(e-> {
            window.close();
        });
        
        StackPane layout = new StackPane();
        Label text = new Label("You Do Not Have The Proper Train Cards. Please Try Again.");
        Scene scene = new Scene(layout,500,500);
        layout.getChildren().addAll(button1,text);
        window.setScene(scene);
        window.showAndWait();     
    }

    static void NoSuchTrainCard(String color) {
        Stage window = new Stage();
        
        window.setTitle("Invalid Move");
        Button button1 = new Button("Reset");
        button1.setTranslateY(-100);
        
        button1.setOnAction(e-> {
            window.close();
        });
        
        StackPane layout = new StackPane();
        Label text = new Label("There is no "+color+" Face up Cards. Please Try Again. ");
        Scene scene = new Scene(layout,500,500);
        layout.getChildren().addAll(button1,text);
        window.setScene(scene);
        window.showAndWait();     }
}