/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tickettoride;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Ryanfinazzo
 */
public class MakeMove {
    static String temp;
    static boolean val;
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

    static String TrainCard() {
        Stage window = new Stage();
        
        window.setTitle("Which Draw Would You like?");
        Button button1 = new Button("Draw Two Face Down Train Cards");
        button1.setTranslateY(-100);
        Button button2 = new Button("Draw One Face Down / One Face Up");
        button2.setTranslateY(0);
        Button button3 = new Button("Draw Two Face Up");
        button3.setTranslateY(100);
        
        button1.setOnAction(e-> {
            temp = "one";
            window.close();
        });
        button2.setOnAction(e-> {
            temp = "two";
            window.close();
        });
        button3.setOnAction(e-> {
            temp = "three";
            window.close();
        });
        
        StackPane layout = new StackPane();
       
        Scene scene = new Scene(layout,300,300);
        layout.getChildren().addAll(button1, button2,button3);
        window.setScene(scene);
        window.showAndWait();
        
        return temp;    
    }
    
    static String OneFaceUp() {
        Stage window = new Stage();

        //need to figure out the size of the window pop up 
        window.setTitle("Draw One Face Up Card");
        Label text = new Label("Select One of the Colors Shown to the Right -->");
        text.setTranslateX(100);
        text.setTranslateY(50);
        
        Button button1 = new Button("   Blue   ");
        button1.setTranslateX(150); 
        button1.setTranslateY(100);
        
        Button button2 = new Button("  Purple  ");
        button2.setTranslateX(250);
        button2.setTranslateY(100);
        
        Button button3 = new Button("   Red    ");
        button3.setTranslateX(150);
        button3.setTranslateY(200);
        
        Button button4 = new Button("  White   ");
        button4.setTranslateX(250);
        button4.setTranslateY(200);
        
        Button button5 = new Button("  Black   ");
        button5.setTranslateX(150);
        button5.setTranslateY(300);
        
        Button button6 = new Button("Locomotive");
        button6.setTranslateX(250);
        button6.setTranslateY(300);
        
        
        button1.setOnAction(e-> {
            temp = "Blue";
            window.close();
        });
        button2.setOnAction(e-> {
            temp = "Purple";
            window.close();
        });
        button3.setOnAction(e-> {
            temp = "Red";
            window.close();
        });
        button4.setOnAction(e-> {
            temp = "White";
            window.close();
        });
        button5.setOnAction(e-> {
            temp = "Black";
            window.close();
        });
        button6.setOnAction(e-> {
            temp = "Locomotive";
            window.close();
        });
        
        Pane layout = new Pane();
       
        Scene scene = new Scene(layout,480,400);
        layout.getChildren().addAll(button1, button2,button3,button4,button5,button6,text);
        window.setScene(scene);
        window.showAndWait();
        
        return temp;    
    }

    static String chooseTrainCards(int routeIndex) {
        Stage window = new Stage();

        //need to figure out the size of the window pop up 
        window.setTitle("Pick one Train card");
        Label text = new Label("Select the Train Color Card you would like to use for segment "+(routeIndex+1)+" of the Route.");
        text.setTranslateX(100);
        text.setTranslateY(50);
        
        Button button1 = new Button("   Blue   ");
        button1.setTranslateX(200); 
        button1.setTranslateY(100);
        
        Button button2 = new Button("  Purple  ");
        button2.setTranslateX(300);
        button2.setTranslateY(100);
        
        Button button3 = new Button("   Red    ");
        button3.setTranslateX(200);
        button3.setTranslateY(200);
        
        Button button4 = new Button("  White   ");
        button4.setTranslateX(300);
        button4.setTranslateY(200);
        
        Button button5 = new Button("  Black   ");
        button5.setTranslateX(200);
        button5.setTranslateY(300);
        
        Button button6 = new Button("Locomotive");
        button6.setTranslateX(300);
        button6.setTranslateY(300);
        
        
        button1.setOnAction(e-> {
            temp = "Blue";
            window.close();
        });
        button2.setOnAction(e-> {
            temp = "Purple";
            window.close();
        });
        button3.setOnAction(e-> {
            temp = "Red";
            window.close();
        });
        button4.setOnAction(e-> {
            temp = "White";
            window.close();
        });
        button5.setOnAction(e-> {
            temp = "Black";
            window.close();
        });
        button6.setOnAction(e-> {
            temp = "Locomotive";
            window.close();
        });
        
        Pane layout = new Pane();
       
        Scene scene = new Scene(layout,600,600);
        layout.getChildren().addAll(button1, button2,button3,button4,button5,button6,text);
        window.setScene(scene);
        window.showAndWait();
        
        return temp;    
    }

    static String chooseTwoOptionTrainCards(int routeIndex, String color1, String color2) {
        Stage window = new Stage();

        //need to figure out the size of the window pop up 
        window.setTitle("Pick one Train card");
        Label text = new Label("Select the Train Color Card you would like to use for segment "+(routeIndex+1)+" of the Route.");
        text.setTranslateX(50);
        text.setTranslateY(50);
        
        Button button1 = new Button(color1);
        button1.setTranslateX(210); 
        button1.setTranslateY(130);
        
        Button button2 = new Button(color2);
        button2.setTranslateX(350);
        button2.setTranslateY(130);
        
        button1.setOnAction(e-> {
            temp = color1;
            window.close();
        });
        button2.setOnAction(e-> {
            temp = color2;
            window.close();
        });
        
        Pane layout = new Pane();
       
        Scene scene = new Scene(layout,600,300);
        layout.getChildren().addAll(button1, button2,text);
        window.setScene(scene);
        window.showAndWait();
        
        return temp;    
    }

    static boolean hasLocomotive() {
        Stage window = new Stage();
        
        window.setTitle("You have a Locomotive Card");
        
        Label text = new Label("Would you like to use one or many of your Locomotive Cards?");
        text.setTranslateX(50);
        text.setTranslateY(50);
        
        Button button1 = new Button("Yes");
        button1.setTranslateX(240);
        button1.setTranslateY(100);
        Button button2 = new Button("No");
        button2.setTranslateX(240);
        button2.setTranslateY(150);
        button1.setOnAction(e-> {
            val =true;
            window.close();
        });
        button2.setOnAction(e-> {
            val=false;
            window.close();
        });
        
        Pane layout = new Pane();
       
        Scene scene = new Scene(layout,500,300);
        layout.getChildren().addAll(button1, button2,text);
        window.setScene(scene);
        window.showAndWait();
        
        return val;
    }
}

