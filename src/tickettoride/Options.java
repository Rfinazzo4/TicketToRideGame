
package tickettoride;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import tickettoride.EndGame;
import tickettoride.Player;

/**
 *
 * @author mostaf
 */
public class Options {
    static boolean val;
    public static boolean opts(int x, int y, Player winner){
        Stage stage = new Stage();
        
        stage.setTitle("Pause Menu");
        Button resume = new Button("Resume Game");
        Button End = new Button("End Game");
        resume.setTranslateY(-100);
        End.setTranslateY(-50);
        
        resume.setOnAction(e-> {
            stage.close();
            val=false;
        });
        
        End.setOnAction(e-> {
            EndGame.endGame(x,y,winner);
            stage.close();
            val=true;
        });
            
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout,500,500);
        

        layout.getChildren().addAll(resume,End);
        stage.setScene(scene);
        stage.showAndWait();
        
        return val;
    }
}