package gui.gas;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Gas {

    public Scene getView(){
        StackPane layout = new StackPane();
        Label texts = new Label("a");

        layout.getChildren().add(texts);

        Scene scene = new Scene(layout);
        return scene;
    }

}
