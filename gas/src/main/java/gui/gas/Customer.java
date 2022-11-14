package gui.gas;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Customer {

    public Scene getView(){
        StackPane layout = new StackPane();
        Label texts = new Label("a");

        layout.getChildren().add(texts);

        Scene scene = new Scene(layout);
        return scene;
    }

}
