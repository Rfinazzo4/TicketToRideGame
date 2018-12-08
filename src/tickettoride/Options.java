
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
    public void opts(int x, int y, Player winner){
        Stage fafa = new Stage();
        
        fafa.setTitle("Game Over!");
        Button resume = new Button("Resume Game");
        Button End = new Button("End Game");
        resume.setTranslateY(-100);
        End.setTranslateY(-50);
        
        resume.setOnAction(e-> {
            fafa.close();
        });
        
        End.setOnAction(e-> {
        EndGame quit = new EndGame();
        quit.endGame(x,y,winner);
        fafa.close();
        });
            
        StackPane layout = new StackPane();
        Scene scene = new Scene(layout,500,500);
        

        layout.getChildren().addAll(resume,End);
        fafa.setScene(scene);
        fafa.showAndWait();
    }
}