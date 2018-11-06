/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ryanfinazzo
 */
public class MakeMove {
    static String temp;
    public static String MakeMove (){
        Stage window = new Stage();
        
        window.setTitle("Pick Move");
        Button button1 = new Button("Claim Route");
        button1.setTranslateY(-100);
        Button button2 = new Button("Draw Train Card");
        button2.setTranslateY(0);
        Button button3 = new Button("Draw Dest Card");
        button3.setTranslateY(100);
        
        button1.setOnAction(e-> {
            temp = "Claim";
            window.close();
        });
        button2.setOnAction(e-> {
            temp = "DrawTrain";
            window.close();
        });
        button3.setOnAction(e-> {
            temp = "DrawDest";
            window.close();
        });
        
        StackPane layout = new StackPane();
       
        Scene scene = new Scene(layout,300,300);
        layout.getChildren().addAll(button1, button2,button3);
        window.setScene(scene);
        window.showAndWait();
        
        return temp;
    }
}
